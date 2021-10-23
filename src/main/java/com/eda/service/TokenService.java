package com.eda.service;

import com.eda.entity.Token;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Token)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:19
 */
public interface TokenService {

    /**
     * 通过ID查询单条数据
     *
     * @param tkId 主键
     * @return 实例对象
     */
    Token queryById(Integer tkId);

    /**
     * 分页查询
     *
     * @param token 筛选条件
     * @return 查询结果
     */
    Page<Token> queryByPage(Token token);

    /**
     * 新增数据
     *
     * @param token 实例对象
     * @return 实例对象
     */
    Token insert(Token token);

    /**
     * 修改数据
     *
     * @param token 实例对象
     * @return 实例对象
     */
    Token update(Token token);

    /**
     * 通过主键删除数据
     *
     * @param tkId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tkId);

}
