package ir.preacher.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String fatherName;
    private Integer age;
    private String username;
    private String password;

}
