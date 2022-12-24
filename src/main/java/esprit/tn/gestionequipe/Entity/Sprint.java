package esprit.tn.gestionequipe.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    //@Temporal(TemporalType.DATE)
    @Temporal(TemporalType.DATE)
    private Date startDate;


    @ManyToOne
    private Project project;
}
