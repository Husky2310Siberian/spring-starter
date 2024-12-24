package gr.aueb.quarkus.starter.controller;

import gr.aueb.quarkus.starter.dto.TeacherInsertDTO;
import gr.aueb.quarkus.starter.dto.TeacherReadOnlyDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teachers")
public class TeacherController {


    @GetMapping("/insert")
    public String getTeacherDTO(Model model) {
        model.addAttribute("teacherInsertDTO", new TeacherInsertDTO());
        return "teachers/insert";
    }

    @PostMapping("/insert")
    public String addTeacher(Model model, @ModelAttribute("teacherInsertDTO") TeacherInsertDTO teacherInsertDTO) {


        TeacherReadOnlyDTO teacherReadOnlyDTO = new TeacherReadOnlyDTO(1L , "Bill", "K.");
        model.addAttribute("dto", teacherReadOnlyDTO);
        return "teachers/success";

    }
}