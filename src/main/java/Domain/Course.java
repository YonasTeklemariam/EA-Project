package Domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String code;

    @Column(length = 3)
    private String abbreviation;

    @Column(length = 255)
    private String name;

    @Column(length = 4000)
    private String description;

}

