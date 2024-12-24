package gr.aueb.quarkus.starter.controller;

import gr.aueb.quarkus.starter.dto.StudentInsertDTO;
import gr.aueb.quarkus.starter.dto.StudentReadOnlyDTO;
import gr.aueb.quarkus.starter.dto.TeacherInsertDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Controller
@RequestMapping("/students")
public class StudentController {


    @GetMapping("/insert")
    public String getStudentDTO(Model model) {
        model.addAttribute("studentInsertDTO", new StudentInsertDTO());
        return "students/insert";
    }


    @PostMapping("/insert")
    public String addStudent(Model model, @ModelAttribute("studentInsertDTO") StudentInsertDTO studentInsertDTO){

        StudentReadOnlyDTO studentReadOnlyDTO = new StudentReadOnlyDTO(1L , "Bill", "Kr.",
                "Computer Science");
        model.addAttribute("dto", studentReadOnlyDTO);
        return "students/success";
    }
}
