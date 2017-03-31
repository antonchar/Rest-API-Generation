package com.antonchar.restgen.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.antonchar.restgen.domain.Employee;
import com.antonchar.restgen.exception.EmployeeCannotBeAddedException;
import com.antonchar.restgen.exception.EmployeeNotFoundException;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public List<Employee> getEmployees() {
        return IntStream.rangeClosed(1, 5)
            .mapToObj(Employee::new)
            .collect(Collectors.toList());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Employee getEmployee(@PathVariable int id) {
        if (id > 0 && id <= 5) {
            return new Employee(id);
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee) {
        if (employee.getId() == 0) {
            employee.setId(6);
            return employee;
        } else {
            throw new EmployeeCannotBeAddedException();
        }
    }
}
