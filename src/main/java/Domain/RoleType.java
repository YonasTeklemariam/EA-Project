package Domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum RoleType {
    STUDENT("Student"), FACULTY("Faculty"), PERSONNEL("Personnel"), ADMINISTRATOR("Administrator");
    private String type;

    private RoleType(String type) {
        this.type =type;
    }
}
