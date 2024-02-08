package pro.sky.Course2CollectionEmployeeToMap.model;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private final Map<String, Employee> employeesMap;

    public EmployeeBook(HashMap<String, Employee> employeesMap) {
        this.employeesMap = employeesMap;
    }

    public Map<String, Employee> getEmployeesMap() {
        return employeesMap;
    }
}
