package com.employeeList.Employee.DAO;

import com.employeeList.Employee.Entity.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDAOTest {
    private EmployeeDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:oracle:DIP:@localhost:1521:orcl");
        dataSource.setUsername("DIP");
        dataSource.setPassword("DIP");
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");


        dao = new EmployeeDAO(new JdbcTemplate(dataSource));
    }

    @Test
    public void list() {

       List<Employee> listEmployee = dao.list();
       assertTrue(listEmployee.isEmpty());

    }

    @Test
    void save() {
    }

    @Test
    void get() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}