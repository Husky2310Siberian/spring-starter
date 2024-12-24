package gr.aueb.quarkus.starter.dto;


import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentInsertDTO {

    private String firstname;
    private String lastname;
    private String department;

}
