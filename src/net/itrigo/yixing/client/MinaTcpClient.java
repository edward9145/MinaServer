package net.itrigo.yixing.client;

import java.net.InetSocketAddress;

import net.itrigo.yixing.server.MinaTcpServer;
import net.itrigo.yixing.util.ByteAndStr16;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.transport.socket.nio.NioSocketConnector;


public class MinaTcpClient extends IoHandlerAdapter {
	private IoConnector connector;
	private static IoSession session;
	
	public MinaTcpClient() {
		connector = new NioSocketConnector();
		connector.setHandler(this);
		ConnectFuture connFuture = connector.connect(new InetSocketAddress("localhost", MinaTcpServer.PORT));
		connFuture.awaitUninterruptibly();
		session = connFuture.getSession();
		System.out.println("TCP 客户端启动");
	}
	public static void main(String[] args) throws Exception {
		MinaTcpClient client = new MinaTcpClient();
		
		String testStr = "14 04 19 AA 0D 0C 0A AA 16 00 00 16 00 00 16 00 00 16 00 00 16 00 00 16 00 00 17 00 00 17 00 00 17 00 00 17 00 00 17 00 00 17 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 01 00 00 01 00 00 01 00 00 01 00 00 01 00 00 02 00 00 02 00 00 02 00 00 02 00 00 02 00 00 02 00 00 03 00 00 03 00 00 03 00 00 03 00 00 03 00 00 03 00 00 04 00 00 04 00 00 04 00 00 04 00 00 04 00 00 04 00 00 05 00 00 05 00 00 05 00 00 05 00 00 05 00 00 05 00 00 06 00 00 06 00 00 06 00 00 06 00 00 06 00 00 06 00 00 AA AA 00 00 45 AA AA";
		byte[] testByte = ByteAndStr16.HexString2Bytes(testStr);
		
		IoBuffer buffer = IoBuffer.allocate(20);
		buffer.setAutoExpand(true);				// 自动扩容
		buffer.setAutoShrink(true);				// 自动收缩
		
		buffer.put(testByte);
		buffer.flip();
		session.write(buffer);
		
		// 关闭会话，待所有线程处理结束后
		client.connector.dispose(true);
	}
	@Override
	public void messageReceived(IoSession iosession, Object message)
			throws Exception {
		IoBuffer bbuf = (IoBuffer) message;
		byte[] byten = new byte[bbuf.limit()];
		bbuf.get(byten, bbuf.position(), bbuf.limit());
		System.out.println("客户端收到消息" + ByteAndStr16.Bytes2HexString(byten));
		System.out.println(new String(byten));
	}
	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		System.out.println("客户端异常");
		super.exceptionCaught(session, cause);
	}
	@Override
	public void messageSent(IoSession iosession, Object obj) throws Exception {
		System.out.println("客户端消息发送");
		super.messageSent(iosession, obj);
	}
	@Override
	public void sessionClosed(IoSession iosession) throws Exception {
		System.out.println("客户端会话关闭");
		super.sessionClosed(iosession);
	}
	@Override
	public void sessionCreated(IoSession iosession) throws Exception {
		System.out.println("客户端会话创建");
		super.sessionCreated(iosession);
	}
	@Override
	public void sessionIdle(IoSession iosession, IdleStatus idlestatus)
			throws Exception {
		System.out.println("客户端会话休眠");
		super.sessionIdle(iosession, idlestatus);
	}
	@Override
	public void sessionOpened(IoSession iosession) throws Exception {
		System.out.println("客户端会话打开");
		super.sessionOpened(iosession);
	}
}