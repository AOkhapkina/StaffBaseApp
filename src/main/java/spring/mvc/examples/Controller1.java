package spring.mvc.examples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller //-это специализированный @Component–компонент, отвечающий за связь между View и Model. Здесь сосредоточена логика работы приложения(бизнес логика)
@RequestMapping("/employee") // для добавления URL адреса во всех методах, нам не нужно это делать в каждом методе, достаточно добавить controller_mapping к классу
// Не допускать в двух разных контроллерах одинаковые URL, возникнет IllegalStateException: Ambiguous mapping.
public class Controller1 {
//    @RequestMapping("/")// связывает URL address с методом контроллера
//    public String showGreeting() {
//        return "greeting";
//    }
//
//    @RequestMapping("/askDetails") // получится /employee/askDetails, т.е. в method_mapping не нужно добавлять /employee, т.к. он указана в controller_mapping (к классу)
//    public String askEmployeeDetails() {
//        return "ask_emp_details_view";
//    }
//
////    @RequestMapping("/showDetails")
////    public String showEmpDetails(){
////        return "show-emp-details-view";
////    }
//
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) { //в Controller2.class - HttpServletRequest заменяем на @RequestParam("employeeName") String empName
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " - developer");
//        return "show_emp_details_view";
//    }

}
