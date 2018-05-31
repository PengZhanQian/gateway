package com.qianpz.gateway.dal.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author qianpengzhan
 * @DESC  javaConfig方式 注入 数据源
 * @create 2018-05-31 10:03
 * @email qianpz@jcgroup.com.cn
 **/
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.qianpz.gateway.dal.auto","com.qianpz.gateway.dal.auto.mapper"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class DataSourceConfig {

    /**
     * JDBC 数据库地址
     */
    @Value("${datasource.general-mysql.url}")
    private String url;

    /**
     * JDBC 数据库用户名
     */
    @Value("${datasource.general-mysql.username}")
    private String userName;

    /**
     * JDBC 数据库密码
     */
    @Value("${datasource.general-mysql.password}")
    private String password;

    /**
     * JDBC 数据库驱动
     */
    @Value("${datasource.general-mysql.driver-class-name}")
    private String driverClassName;

    /**
     * JDBC 数据库最大链接数
     */
    @Value("${datasource.general-mysql.max-idle}")
    private String maxIdle;

    /**
     * JDBC 数据库最小链接数
     */
    @Value("${datasource.general-mysql.min-idle}")
    private String minIdle;

    /**
     * JDBC 数据库最长等待时间
     */
    @Value("${datasource.general-mysql.max-wait}")
    private String maxWait;

    /**
     * JDBC 数据库初始化链接数
     */
    @Value("${datasource.general-mysql.initial-size}")
    private String initialSize;

    /**
     * JDBC 数据库最大活跃数
     */
    @Value("${datasource.general-mysql.max-active}")
    private String maxActive;

    @Value("${datasource.minEvictableIdleTimeMillis}")
    private String minEvictableIdleTimeMillis;


    /**
     * 注入数据源 dataSource
     * @return
     */
    @Primary
    @Bean
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setDriverClassName(driverClassName);
        datasource.setUsername(userName);
        datasource.setPassword(password);
        datasource.setInitialSize(Integer.valueOf(initialSize));
        datasource.setMinIdle(Integer.valueOf(minIdle));
        datasource.setMaxWait(Long.valueOf(maxWait));
        datasource.setMaxActive(Integer.valueOf(maxActive));
        datasource.setMinEvictableIdleTimeMillis(Long.valueOf(minEvictableIdleTimeMillis));
        return datasource;
    }

    /**
     * 加入事务管理
     * @param dataSource
     * @return
     */
    @Primary
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * 加入 sqlSession工厂
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Primary
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        String path = "classpath*:com.qianpz.gateway.dal.auto.mapper/*.xml";
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(path));
        return factoryBean.getObject();
    }

    /**
     * 分页工具类
     * @return
     */
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        properties.setProperty("helperDialect", "mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

    private void addPageHelperPlugin(SqlSessionFactoryBean sessionFactoryBean) throws Exception {
        PageInterceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("reasonable", "true");
        interceptor.setProperties(properties);
        sessionFactoryBean.getObject().getConfiguration().addInterceptor(interceptor);
    }

    @Bean(name = "sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(String maxIdle) {
        this.maxIdle = maxIdle;
    }

    public String getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(String minIdle) {
        this.minIdle = minIdle;
    }

    public String getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(String maxWait) {
        this.maxWait = maxWait;
    }

    public String getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(String initialSize) {
        this.initialSize = initialSize;
    }

    public String getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(String maxActive) {
        this.maxActive = maxActive;
    }

    public String getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(String minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }
}
