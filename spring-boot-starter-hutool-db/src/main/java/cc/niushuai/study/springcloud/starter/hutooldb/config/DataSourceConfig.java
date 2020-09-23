package cc.niushuai.study.springcloud.starter.hutooldb.config;

import cn.hutool.db.Db;
import cn.hutool.db.DbUtil;
import cn.hutool.db.Session;
import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.ds.simple.SimpleDataSource;
import cn.hutool.log.level.Level;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ns
 * @date 2020/9/23
 */
@Configuration
public class DataSourceConfig {
    @Resource
    private DataSource dataSource;

    @Bean
    public DataSource dataSource() throws SQLException {

        System.out.println("dataSource init");

        return new SimpleDataSource("jdbc:mysql://47.244.169.240:65533/xtt_test?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&zeroDateTimeBehavior=convertToNull&rewriteBatchedStatements=true&allowMultiQueries=true", "root", "Shuairr1215.", "com.mysql.cj.jdbc.Driver");
    }

    @Bean
    public Db db() {

        System.out.println("dataSource db init");

        return Db.use(this.dataSource);
    }

    @Bean
    public Session session() {

        return Session.create(dataSource);
    }
}