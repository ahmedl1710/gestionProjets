package esprit.tn.gestionequipe.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desciption;


    @OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
    private Set<Sprint> sprints;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<User> users;

}
