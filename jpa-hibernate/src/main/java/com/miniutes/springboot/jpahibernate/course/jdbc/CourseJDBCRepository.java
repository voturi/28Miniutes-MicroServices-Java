package com.miniutes.springboot.jpahibernate.course.jdbc;

import com.miniutes.springboot.jpahibernate.course.jdbc.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate  springjdbcTemplate;
    private static String INSERT_QUERY =
                            """
                            insert into course(id, name, author )
                            values(?, ?, ? );
                            """;
    private static String DELETE_QUERY =
            """
            Delete from course where id = ?  ;
            """;
    private static String SEARCH_QUERY =
            """
            Select * from course where id = ?  ;
            """;

    public void insert(Course course){
        springjdbcTemplate.update(INSERT_QUERY, course.getId(),course.getName(), course.getAuthor());
    }
    public void delete(int id){
        springjdbcTemplate.update(DELETE_QUERY, id);
    }
    public Course search(int id){
       return   springjdbcTemplate.queryForObject(SEARCH_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}