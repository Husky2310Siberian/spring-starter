package gr.aueb.quarkus.starter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {


    /**
     * @return a page, so use String
     */
    //@RequestMapping(path = "/coding" , method = RequestMethod.GET)
    @GetMapping("/coding")
    public String sayHello(Model model){
        model.addAttribute("message", "Hello Coding!!!");
        return "index";
    }

    @GetMapping("/welcome")
    public String sayWelcome(Model model, @RequestParam(value = "name" , defaultValue = "Guest") String name){
        model.addAttribute("name" , name);
        return "welcome";
    }

}
