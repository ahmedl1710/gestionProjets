package esprit.tn.gestionequipe.Service;

import esprit.tn.gestionequipe.Entity.Sprint;
import esprit.tn.gestionequipe.Repository.SprintRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ISprintImpl implements IService<Sprint>{
    SprintRepository sprintRepository;

    @Override
    public Sprint Create(Sprint T) {
        return sprintRepository.save(T);
    }

    @Override
    public List<Sprint> Read() {
        return sprintRepository.findAll();
    }

    @Override
    public Sprint Update(int ID, Sprint T) {
        Sprint s=sprintRepository.findById(ID).orElse(null);
        s=T;
        return sprintRepository.save(T);
    }

    @Override
    public String Delete(int ID) {
        sprintRepository.deleteById(ID);
        return "Sprint deleted";
    }

    @Override
    public Sprint getOne(Integer ID) {
        return sprintRepository.findById(ID).orElse(null);
    }
}
