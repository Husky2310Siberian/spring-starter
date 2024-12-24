package gr.aueb.quarkus.starter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StudentReadOnlyDTO {

    private Long id;
    private String firstname;
    private String lastname;
    private String department;

}
