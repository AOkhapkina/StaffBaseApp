package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

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
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "ask_emp_details_view";

        } else {
            return "show_emp_details_view";
//При желании можно добавлять что то к тексту по умолчанию(Mr./Mrs., ! и т.д.)
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

        }
    }
}

