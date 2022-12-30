package esprit.tn.gestionequipe.Service;

import esprit.tn.gestionequipe.Entity.User;
import esprit.tn.gestionequipe.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IUserServiceImpl implements IService<User>{
    UserRepository userRepository;

    @Override
    public User Create(User T) {
        return userRepository.save(T);
    }

    @Override
    public List<User> Read() {
        return userRepository.findAll();
    }

    @Override
    public User Update(int ID, User T) {
        User u=userRepository.findById(ID).orElse(null);
        u.setEmail(T.getEmail());
        u.setPwd(T.getPwd());
        u.setRole(T.getRole());
        u.setProjects(T.getProjects());
        u.setFName((T.getFName()));
        u.setIName(T.getIName());
        u.setMesProjets(T.getMesProjets());
        return userRepository.save(u);
    }

    @Override
    public String Delete(int ID) {
        userRepository.deleteById(ID);
        return "User deleted";
    }

    @Override
    public User getOne(Integer ID) {
        return userRepository.findById(ID).orElse(null);
    }
}
