package com.miniutes.springboot.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate  springjdbcTemplate;
    private static String INSERT_QUERY =
                            """
                            insert into course(id, name, author )
                            values(1, 'learn AWS',  '28 Miniutes' );
                            """;

    public void insert(){
        springjdbcTemplate.update(INSERT_QUERY);
    }
}