package org.vincenzoluigi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vincenzoluigi.models.Employee;
import org.vincenzoluigi.models.EmployeeDTO;

import java.time.ZoneId;
import java.util.Date;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(EmployeeDTO employeeDTO){
        Employee employee = new Employee();

        employee.setFullName(employeeDTO.getFullName());
        employee.setCode(employeeDTO.getCode());
        Date date = Date.from(employeeDTO.getStartDate().atStartOfDay(ZoneId.of("Europe/Rome")).toInstant());
        employee.setStartDate(date);

        employeeRepository.insert(employee);
        return employee;
    }


}
