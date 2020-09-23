package cc.niushuai.study.springcloud.starter.hutooldb.user.service;

import cc.niushuai.study.springcloud.starter.hutooldb.user.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ns
 * @date 2020/9/23
 */
public interface UserService {
    void insert(User user) throws SQLException;

    List<User> selectList(User user) throws SQLException;
}
