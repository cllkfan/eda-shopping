package com.eda.service.impl;

import com.eda.entity.Classify;
import com.eda.mapper.ClassifyMapper;
import com.eda.service.ClassifyService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Classify)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:08
 */
@Service("classifyService")
public class ClassifyServiceImpl implements ClassifyService {
    @Resource
    private ClassifyDao classifyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    @Override
    public Classify queryById(Integer cId) {
        return this.classifyDao.queryById(cId);
    }

    /**
     * 分页查询
     *
     * @param classify 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Classify> queryByPage(Classify classify) {
        long total = this.classifyDao.count(classify);
        return new PageImpl<>(this.classifyDao.queryAllByLimit(classify, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param classify 实例对象
     * @return 实例对象
     */
    @Override
    public Classify insert(Classify classify) {
        this.classifyDao.insert(classify);
        return classify;
    }

    /**
     * 修改数据
     *
     * @param classify 实例对象
     * @return 实例对象
     */
    @Override
    public Classify update(Classify classify) {
        this.classifyDao.update(classify);
        return this.queryById(classify.getCId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cId) {
        return this.classifyDao.deleteById(cId) > 0;
    }
}
