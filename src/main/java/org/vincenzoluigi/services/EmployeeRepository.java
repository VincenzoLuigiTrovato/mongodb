package org.vincenzoluigi.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.vincenzoluigi.models.Employee;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> { //String: Type of Employee ID
/*
    Employee findByCode(String code);
    List<Employee> findByFullNameLike(String name);
    List<Employee> findByStartGreaterThan(Date startDate);

    //Supports native JSON query string
    @Query("{fullName: '?0'}")
    List<Employee> findCustomByFullName(String fullName);
 */
}
