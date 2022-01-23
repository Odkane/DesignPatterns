package creational.simplefactory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Post {

    private int id;
    private String title;
    private String description;
    private LocalDate createdDate;

}
