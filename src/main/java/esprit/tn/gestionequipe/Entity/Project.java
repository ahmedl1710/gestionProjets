package esprit.tn.gestionequipe.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desciption;


    @OneToMany(mappedBy = "project")
    private Set<Sprint> sprints;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<User> users;

}
