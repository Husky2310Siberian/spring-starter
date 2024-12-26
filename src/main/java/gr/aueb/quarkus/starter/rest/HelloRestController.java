package gr.aueb.quarkus.starter.rest;

import gr.aueb.quarkus.starter.dto.TeacherReadOnlyDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/teachers/{id}")
    public ResponseEntity<TeacherReadOnlyDTO> getOneTeacher(@PathParam("id") Long id){
        //call service and get a teacher read only dto
        TeacherReadOnlyDTO readOnlyDTO = new TeacherReadOnlyDTO(1L , "Bob" , "Marley");

        if(Objects.equals("id" , 1L)){
            return new ResponseEntity<>(readOnlyDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
