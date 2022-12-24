package esprit.tn.gestionequipe.Repository;

import esprit.tn.gestionequipe.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
