package spring.mvc.examples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.Employee;


@Controller
@RequestMapping("/")
public class Controller2 {
//    @RequestMapping("/")
//    public String showGreeting() {
//        return "greeting";
//    }
//
//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails() {
//        return "ask_emp_details_view";
//    }
//
//    При работе с формами, аннотация @RequestParam позволяет нам связывать поле формы с параметром метода из Controller-а
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr. " + empName + "!";
//        model.addAttribute("nameAttribute", empName);
//        return "show_emp_details_view";
//    }
//*************************************************************
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee1 emp) {
//        При желании можно добавлять что то к тексту по умолчанию(Mr./Mrs., ! и т.д.)
//        String name = emp.getName();
//        emp.setName("Mr./Mrs. "+name);
//
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//
//        String department = emp.getDepartment();
//        emp.setDepartment(department + " department");
//
//        double salary = emp.getSalary();
//        emp.setSalary(salary+0.50);
//        return "show_emp_details_view";
//    }
}
