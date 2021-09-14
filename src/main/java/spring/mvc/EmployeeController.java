package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
        }
    }
}

