package gr.aueb.quarkus.starter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    @GetMapping("/date")
    public String getDate(Model model) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy HH:mm:ss");
        String formattedDate = now.format(dateTimeFormatter);
        model.addAttribute("dateStr", formattedDate);
        return "date";
    }

}
