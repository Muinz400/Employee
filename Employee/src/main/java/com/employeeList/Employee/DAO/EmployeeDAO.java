package com.employeeList.Employee.DAO;

import com.employeeList.Employee.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> list() {
        String sql = "SELECT * FROM EMPLOYEE";



       List<Employee> listEmployee = jdbcTemplate.query(sql,
               BeanPropertyRowMapper.newInstance(Employee.class));
        return listEmployee;
    }
    public void save(Employee employee) {

    }
    public Employee get(int id) {

        return null;
    }
    public void update(Employee employee) {

    }
    public void delete(int id) {

    }

}
