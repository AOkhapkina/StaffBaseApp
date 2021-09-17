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

    @Pattern(regexp = "\\d-\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern x-xxx-xxx-xx-xx")
    private String phoneNumber;

    @CheckEmail(value = "corp.com", message = "email's ending must be corp.com")
    private String email;

    private String department;
    private Map<String, String> departments;

    private String carBrand;
    private Map<String, String> carBrands;

    private String[] languages;
    private Map<String, String> languageList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology","IT");
        departments.put("Human Resources","HR");
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
}

