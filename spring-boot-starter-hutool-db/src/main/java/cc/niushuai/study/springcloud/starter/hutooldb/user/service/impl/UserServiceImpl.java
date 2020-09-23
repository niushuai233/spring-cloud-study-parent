package cc.niushuai.study.springcloud.starter.hutooldb.user.service.impl;

import cc.niushuai.study.springcloud.starter.hutooldb.user.entity.User;
import cc.niushuai.study.springcloud.starter.hutooldb.user.service.UserService;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.Session;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author ns
 * @date 2020/9/23
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private Db db;


    @Override
    public void insert(User user) throws SQLException {

        int insert = db.insert(Entity.create("user").set("name", "张三三").set("create_time", LocalDateTime.now()));

        System.out.println("insert = " + insert);
    }

    @Override
    public List<User> selectList(User user) throws SQLException {

        return db.find(Entity.create("user"), User.class);
    }
}
