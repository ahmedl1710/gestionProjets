package esprit.tn.gestionequipe.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String pwd;
    private String fName;
    private String iName;
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Project> projects= new HashSet<>();

    @OneToMany(cascade =CascadeType.ALL)
    private Set<Project> mesProjets;
}
