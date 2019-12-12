package cn.eyiya.ceanza.service.impl;

import cn.eyiya.ceanza.dao.BabyInfoDao;
import cn.eyiya.ceanza.model.BabyInfo;
import cn.eyiya.ceanza.model.BabyInfoExample;
import cn.eyiya.ceanza.service.BabyInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author G
 * @date 2019/11/11 15:50
 */
@Service
public class BabyInfoServiceImpl implements BabyInfoService {
    @Resource
    private BabyInfoDao babyInfoDao;

    @Override
    public long countByExample(BabyInfoExample example) {
        return babyInfoDao.countByExample(example);
    }

    @Override
    public int deleteByExample(BabyInfoExample example) {
        return babyInfoDao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return babyInfoDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BabyInfo record) {
        return babyInfoDao.insert(record);
    }

    @Override
    public int insertSelective(BabyInfo record) {
        return babyInfoDao.insertSelective(record);
    }

    @Override
    public List<BabyInfo> selectByExample(BabyInfoExample example) {
        return babyInfoDao.selectByExample(example);
    }

    @Override
    public BabyInfo selectByPrimaryKey(Integer id) {
        return babyInfoDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(BabyInfo record, BabyInfoExample example) {
        return babyInfoDao.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(BabyInfo record, BabyInfoExample example) {
        return babyInfoDao.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(BabyInfo record) {
        return babyInfoDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BabyInfo record) {
        return babyInfoDao.updateByPrimaryKey(record);
    }
}
