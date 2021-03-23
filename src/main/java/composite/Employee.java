package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private final String name;
    private final String jobPosition;
    private final List<Employee> child;

    public Employee(String name, String jobPosition) {
        this.name = name;
        this.jobPosition = jobPosition;
        child = new ArrayList<>();

    }

    public Employee add(Employee employee) {
        child.add(employee);
        return this;
    }

    public Employee remove(Employee employee) {
        child.add(employee);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder childString = new StringBuilder();
        for (Employee employee : child) {
            childString.append("\n[").append(employee.toString()).append("]");
        }

        return "Employee{" +
                "name='" + name + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", child=" + childString.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(jobPosition, employee.jobPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jobPosition);
    }
}
