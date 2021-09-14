package spring.mvc.examples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
//    // При работе с формами, аннотация @RequestParam позволяет нам связывать поле формы с параметром метода из Controller-а
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr. " + empName + "!";
//        model.addAttribute("nameAttribute", empName);
//        return "show_emp_details_view";
//    }
}
