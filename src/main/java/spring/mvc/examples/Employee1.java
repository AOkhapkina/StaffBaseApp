package spring.mvc.examples;

import lombok.Data;
import spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Data
public class Employee1 {

    private String name;
    private String surname;
    private double salary;
    private String phoneNumber;
    private String email;
    private String department;

    public Employee1() {

    }

    public Employee1 (String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

}

