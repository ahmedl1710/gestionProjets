package esprit.tn.gestionequipe.Repository;

import esprit.tn.gestionequipe.Entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint,Integer> {
}
