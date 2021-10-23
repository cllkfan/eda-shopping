package com.eda.service.impl;

import com.eda.entity.Token;
import com.eda.mapper.TokenMapper;
import com.eda.service.TokenService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Token)表服务实现类
 *
 * @author makejava
 * @since 2021-10-23 19:25:19
 */
@Service("tokenService")
public class TokenServiceImpl implements TokenService {
    @Resource
    private TokenDao tokenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tkId 主键
     * @return 实例对象
     */
    @Override
    public Token queryById(Integer tkId) {
        return this.tokenDao.queryById(tkId);
    }

    /**
     * 分页查询
     *
     * @param token 筛选条件
     * @return 查询结果
     */
    @Override
    public Page<Token> queryByPage(Token token) {
        long total = this.tokenDao.count(token);
        return new PageImpl<>(this.tokenDao.queryAllByLimit(token, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param token 实例对象
     * @return 实例对象
     */
    @Override
    public Token insert(Token token) {
        this.tokenDao.insert(token);
        return token;
    }

    /**
     * 修改数据
     *
     * @param token 实例对象
     * @return 实例对象
     */
    @Override
    public Token update(Token token) {
        this.tokenDao.update(token);
        return this.queryById(token.getTkId());
    }

    /**
     * 通过主键删除数据
     *
     * @param tkId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tkId) {
        return this.tokenDao.deleteById(tkId) > 0;
    }
}
