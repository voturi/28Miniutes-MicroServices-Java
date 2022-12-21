package com.miniutes.springboot.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBCRepository repository;
    @Override  public void run(String... args) throws Exception {
         repository.insert();
    }
}
