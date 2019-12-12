package cn.eyiya.ceanza.dao;

import cn.eyiya.ceanza.model.BabyInfo;
import cn.eyiya.ceanza.model.BabyInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BabyInfoDao {
    long countByExample(BabyInfoExample example);

    int deleteByExample(BabyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BabyInfo record);

    int insertSelective(BabyInfo record);

    List<BabyInfo> selectByExample(BabyInfoExample example);

    BabyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BabyInfo record, @Param("example") BabyInfoExample example);

    int updateByExample(@Param("record") BabyInfo record, @Param("example") BabyInfoExample example);

    int updateByPrimaryKeySelective(BabyInfo record);

    int updateByPrimaryKey(BabyInfo record);
}