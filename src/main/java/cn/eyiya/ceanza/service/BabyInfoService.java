package cn.eyiya.ceanza.service;

import cn.eyiya.ceanza.model.BabyInfo;
import cn.eyiya.ceanza.model.BabyInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author G
 * @date 2019/11/11 15:49
 */
public interface BabyInfoService {
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
