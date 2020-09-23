package cc.niushuai.study.springcloud.starter.mybatisplus.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class MybatisPlusConfig {

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory mySqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);

        // 设置XML扫描
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);

        MybatisConfiguration configuration = new MybatisConfiguration();

        configuration.getGlobalConfig().setIdentifierGenerator(new CustomerIdentifierGenerator());

        // 设置属性为空，补充null
        configuration.setJdbcTypeForNull(JdbcType.NULL);

        // 设置驼峰映射
        configuration.setMapUnderscoreToCamelCase(true);

        // 读入配置
        sqlSessionFactoryBean.setConfiguration(configuration);

        // 设置事务
        sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());

        configuration.getGlobalConfig().setSqlSessionFactory(sqlSessionFactoryBean.getObject());

        return sqlSessionFactoryBean.getObject();
    }
}