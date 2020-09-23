import cc.niushuai.study.springcloud.starter.hutooldb.SpringBootStarterHutoolDbApplication;
import cc.niushuai.study.springcloud.starter.hutooldb.user.entity.User;
import cc.niushuai.study.springcloud.starter.hutooldb.user.service.UserService;
import cn.hutool.db.GlobalDbConfig;
import cn.hutool.log.level.Level;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootStarterHutoolDbApplication.class)
public class SampleTest {

    @Resource
    private UserService userService;

    @Test
    public void testSelect() throws SQLException {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsert() throws SQLException {
        GlobalDbConfig.setShowSql(true, true, true, Level.INFO);

        userService.insert(null);

        testSelect();
    }
}