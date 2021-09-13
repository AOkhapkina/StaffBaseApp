package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class EmployeeController {
    @RequestMapping("/")
    public String showGreeting() {
        return "greeting";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask_emp_details_view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
        String name = emp.getName();
        emp.setName("Mr./Mrs. "+name);

        String surname = emp.getSurname();
        emp.setSurname(surname + "!");

        String department = emp.getDepartment();
        emp.setDepartment(department + " department");

        double salary = emp.getSalary();
        emp.setSalary(salary+0.50);

        return "show_emp_details_view";
    }
}

