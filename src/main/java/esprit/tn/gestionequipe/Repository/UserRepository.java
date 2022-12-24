package esprit.tn.gestionequipe.Repository;

import esprit.tn.gestionequipe.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
