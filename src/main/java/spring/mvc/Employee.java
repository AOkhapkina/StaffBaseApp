package spring.mvc;

import lombok.Data;
import spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.*;

@Data
public class Employee {
    @Size(min = 2, message = "name must have min 2 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "salary must be greater than 499")
    @Max(value = 1000, message = "salary must be less than 1001")
    private double salary;//@NotBlank == @NotEmpty + not space /// @NotEmpty == @NotNull + @NotString
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String,String> languageList;
    @Pattern(regexp = "\\d-\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern x-xxx-xxx-xx-xx")
    private String phoneNumber;
    @CheckEmail(value = "corp.com", message = "email's ending must be corp.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "Mercedes");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutsch", "DE");
        languageList.put("French", "FR");
      }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

}

