package Domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "datetime")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="offerid")
    private CourseOffering offering;

    @ManyToOne
    @JoinColumn(name="studentid")
    private Student student;

    public Registration(LocalDate date, CourseOffering offering, Student student) {
        this.date = date;
        this.offering = offering;
        this.student = student;
    }

    public Registration() {

    }
}
