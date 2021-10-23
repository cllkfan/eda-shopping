package com.eda.service;

import com.eda.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2021-10-23 19:25:22
 */
public interface UsersService {

    /**
     * 通过ID查询单条数据
     *
     * @param uId 主键
     * @return 实例对象
     */
    Users queryById(Integer uId);

    /**
     * 分页查询
     *
     * @param users 筛选条件
     * @return 查询结果
     */
    Page<Users> queryByPage(Users users);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param uId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uId);

}
