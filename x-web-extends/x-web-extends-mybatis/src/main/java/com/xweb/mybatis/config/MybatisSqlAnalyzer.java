package com.xweb.mybatis.config;

import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class MybatisSqlAnalyzer implements InitializingBean {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public void afterPropertiesSet() throws Exception {
        Configuration configuration = sqlSessionFactory.getConfiguration();
        Collection<MappedStatement> mappedStatements = configuration.getMappedStatements();
        for (MappedStatement mappedStatement : mappedStatements) {
            SqlSource sqlSource = mappedStatement.getSqlSource();
            System.out.println(sqlSource);
        }
    }
}
