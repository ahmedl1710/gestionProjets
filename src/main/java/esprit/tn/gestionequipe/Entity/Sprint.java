package esprit.tn.gestionequipe.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sprint implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    //@Temporal(TemporalType.DATE)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;
}
