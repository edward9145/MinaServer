package net.itrigo.yixing.mapper;

import java.util.List;
import net.itrigo.yixing.domain.UploadData;
import net.itrigo.yixing.domain.UploadDataExample;
import org.apache.ibatis.annotations.Param;

public interface UploadDataMapper {
    int countByExample(UploadDataExample example);

    int deleteByExample(UploadDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadData record);

    int insertSelective(UploadData record);

    List<UploadData> selectByExample(UploadDataExample example);

    UploadData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadData record, @Param("example") UploadDataExample example);

    int updateByExample(@Param("record") UploadData record, @Param("example") UploadDataExample example);

    int updateByPrimaryKeySelective(UploadData record);

    int updateByPrimaryKey(UploadData record);
}