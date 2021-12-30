package com.employeeList.Employee.Controller;

import com.employeeList.Employee.DAO.EmployeeDAO;
import com.employeeList.Employee.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO dao;

        @RequestMapping("/employee")
        public String viewHomePage(Model model ) {
            List<Employee> listEmployee = dao.list();
            model.addAttribute("listEmployee", listEmployee);
            return "index";

    }

}
