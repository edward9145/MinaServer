package net.itrigo.yixing.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.itrigo.yixing.domain.UploadData;
import net.itrigo.yixing.util.ByteAndStr16;
import net.itrigo.yixing.util.DataBaseHandler;
import net.itrigo.yixing.util.DataHandler;
import net.itrigo.yixing.util.Default;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.RootLogger;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;


public class MinaTcpServer extends IoHandlerAdapter {
	
	public static final int PORT = 5033;
	public static final int IDLE_TIME = 40;
	
	public MinaTcpServer() throws IOException {
		NioSocketAcceptor acceptor = new NioSocketAcceptor();
		acceptor.setHandler(this);
		acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, IDLE_TIME);
		acceptor.bind(new InetSocketAddress(PORT));
//		System.out.println(Default.now() + " TCP服务启动 port:" + PORT);
	}
	
	public static void main(String[] args) throws IOException {
		if(args.length != 0 && args[0] != null){
			Default.DB_NAME = args[0];
			System.out.println("DB_NAME: " + args[0]);
		}
		new MinaTcpServer();
	}
	
	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {
		IoBuffer ioBuf = (IoBuffer) message;
		byte[] rawData = new byte[ioBuf.limit()];
		ioBuf.get(rawData, ioBuf.position(), ioBuf.limit());
		System.out.println(">> " + rawData.length + " byte");
		System.out.println(ByteAndStr16.Bytes2HexString(rawData));
		
		try {
			DataBaseHandler dataBaseHanlder = new DataBaseHandler(Default.DB_YIXING);
			UploadData uploadData = DataHandler.parseData(rawData);
			
			if(uploadData != null) {
				dataBaseHanlder.saveData(uploadData);
			}
			
			// 处理返回信息
			String responseStr = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
			System.out.println("<< " + responseStr.getBytes().length + " byte");
			System.out.println(responseStr);
	
			// 发送byte返回信息
			IoBuffer buffer = IoBuffer.allocate(responseStr.length());
			buffer.put(responseStr.getBytes());
			buffer.flip();
			session.write(buffer);
		}
		catch (Exception ex){
			System.err.println(new Date());
			ex.printStackTrace();
		}
		
//		// 拿到所有的客户端Session
//		Collection<IoSession> sessions = session.getService().getManagedSessions().values();
//		// 向所有客户端发送数据
//		for (IoSession sess : sessions) {
//			sess.write(buffer);
//		}
	}
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		System.out.println(Default.now() + " ========== [会话关闭] ==========");
	}
	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		System.out.println(Default.now() + " [会话异常]");
		super.exceptionCaught(session, cause);
	}
	@Override
	public void messageSent(IoSession iosession, Object obj) throws Exception {
//		System.out.println(Default.now() + " [服务端消息发送]");
		super.messageSent(iosession, obj);
	}
	@Override
	public void sessionCreated(IoSession iosession) throws Exception {
//		System.out.println();
		System.out.println(Default.now() + " ========== [会话创建] ==========");
		super.sessionCreated(iosession);
	}
	@Override
	public void sessionIdle(IoSession iosession, IdleStatus idlestatus)
			throws Exception {
//		System.out.println(Default.now() + " [会话休眠]");
		super.sessionIdle(iosession, idlestatus);
		iosession.close();
	}
	@Override
	public void sessionOpened(IoSession iosession) throws Exception {
//		System.out.println(Default.now() + " [会话打开]");
		super.sessionOpened(iosession);
	}
}
