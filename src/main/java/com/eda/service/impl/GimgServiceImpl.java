package com.eda.service.impl;

import com.eda.entity.Gimg;
import com.eda.mapper.GimgMapper;
import com.eda.service.GimgService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Gimg)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:12
 */
@Service("gimgService")
public class GimgServiceImpl implements GimgService {
    @Resource
    private GimgDao gimgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gimgId 主键
     * @return 实例对象
     */
    @Override
    public Gimg queryById(Integer gimgId) {
        return this.gimgDao.queryById(gimgId);
    }

    /**
     * 分页查询
     *
     * @param gimg 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Gimg> queryByPage(Gimg gimg) {
        long total = this.gimgDao.count(gimg);
        return new PageImpl<>(this.gimgDao.queryAllByLimit(gimg, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param gimg 实例对象
     * @return 实例对象
     */
    @Override
    public Gimg insert(Gimg gimg) {
        this.gimgDao.insert(gimg);
        return gimg;
    }

    /**
     * 修改数据
     *
     * @param gimg 实例对象
     * @return 实例对象
     */
    @Override
    public Gimg update(Gimg gimg) {
        this.gimgDao.update(gimg);
        return this.queryById(gimg.getGimgId());
    }

    /**
     * 通过主键删除数据
     *
     * @param gimgId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer gimgId) {
        return this.gimgDao.deleteById(gimgId) > 0;
    }
}
