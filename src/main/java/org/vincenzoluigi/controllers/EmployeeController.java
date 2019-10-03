package org.vincenzoluigi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.vincenzoluigi.models.Employee;
import org.vincenzoluigi.models.EmployeeDTO;
import org.vincenzoluigi.services.EmployeeRepository;
import org.vincenzoluigi.services.EmployeeService;

import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {
    private static final String[] NAMES = {"Tom", "Jerry", "Donald"};

    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {"text/html"})
    public String home() {
        String html = "";
        html += "<li><a href='/new'>Test Insert</a></li>";
        html += "<li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += "<li><a href='/showFullNameLikeTom'>Show Full Name Like Tom</a></li>";
        html += "<li><a href='/deleteAllEmployee'>Delete All Employee</a></li>";
        html += "</ul>";

        return html;
    }

    @ResponseBody
    @GetMapping(value = "/new", produces = "text/html")
    public String addEmployee() {
        String html = "";
        html += "<form method='POST' action='/insert'>" +
                "<label>code</label><input type='text' name='code' />" +
                "<label>full name</label><input type='text' name='fullName' />" +
                "<label>date</label><input type='date' name='startDate' />" +
                "<input type='Submit' />" +
                "</form>";
        return html;
    }

    @ResponseBody
    @PostMapping("/insert")
    public String testInsert(@ModelAttribute EmployeeDTO employeeDTO) { //employeeDTO: EmployeeDTO@7482
        Employee employee = employeeService.save(employeeDTO);

        return "Inserted: " + employeeDTO.toString();
    }
    /*
    @ResponseBody
    @GetMapping("/showAllEmployee")
    public String  showAllEmployee(){
        List<Employee> employees = this.employeeService.findAll();

        String html = "";
        for(Employee em : employees){
            html += em;
        }
        return html;
    }
    */
}
