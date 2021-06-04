package Domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Administrator extends Person {

    @Column(name="title", columnDefinition = "nvarchar(50)")
    private String title;
}
