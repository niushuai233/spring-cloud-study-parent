import cc.niushuai.study.springcloud.starter.mybatisplus.SpringBootStarterMyBatisPlusApplication;
import cc.niushuai.study.springcloud.starter.mybatisplus.user.bean.User;
import cc.niushuai.study.springcloud.starter.mybatisplus.user.mapper.UserMapper;
import com.baomidou.mybatisplus.core.toolkit.GlobalConfigUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootStarterMyBatisPlusApplication.class)
public class SampleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(userList.size(), userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsert() {

        User entity = new User();
        entity.setName("张三").setAge(10).setEmail("x@t.com");
        userMapper.insert(entity);

        SqlSessionFactory currentSessionFactory = GlobalConfigUtils.currentSessionFactory(User.class);

        System.out.println(currentSessionFactory);

        testSelect();
    }
}