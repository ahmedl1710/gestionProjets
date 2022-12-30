package esprit.tn.gestionequipe.Service;

import esprit.tn.gestionequipe.Entity.Project;
import esprit.tn.gestionequipe.Repository.ProjectRepository;
import esprit.tn.gestionequipe.Repository.SprintRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class IProjectServiecImpl implements IService<Project>{

    private ProjectRepository projectRepository;



    @Override
    public Project Create(Project T) {

        return projectRepository.save(T);
    }

    @Override
    public List<Project> Read() {
        return projectRepository.findAll();
    }

    @Override
    public Project Update(int ID, Project T) {
        Project proj=projectRepository.findById(ID).orElse(null);
        proj.setTitle(T.getTitle());
        proj.setDesciption(T.getDesciption());
        proj.setUsers(T.getUsers());
        proj.setSprints(T.getSprints());
        return projectRepository.save(proj);
    }

    @Override
    public String Delete(int ID) {
        projectRepository.deleteById(ID);
        return "Project deleted";
    }

    @Override
    public Project getOne(Integer ID) {
        return projectRepository.findById(ID).orElse(null);
    }
}
