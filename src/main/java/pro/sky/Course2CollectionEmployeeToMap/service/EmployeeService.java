package pro.sky.Course2CollectionEmployeeToMap.service;

import pro.sky.Course2CollectionEmployeeToMap.model.Employee;

import java.util.Map;

public interface EmployeeService {

    Employee addEmployee(String firstName, String surName, String lastName, int department, double salary);

    Employee removeEmployee(String firstName, String surName, String lastName);

    Employee findEmployee(String firstName, String surName, String lastName);

    Map<String, Employee> printAllEmployees();
}
