package esprit.tn.gestionequipe.Controller;


import esprit.tn.gestionequipe.Entity.Project;
import esprit.tn.gestionequipe.Service.IProjectServiecImpl;
import esprit.tn.gestionequipe.Service.ISprintImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.System.in;

@RestController
@RequestMapping("/project")
@AllArgsConstructor
public class ProjectController {

    private IProjectServiecImpl projectService;
    private ISprintImpl iSprint;

    @PostMapping("/addProject")
    public Project ajouterProject(@RequestBody Project p)
    {
       //iSprint.Create()
        
        return projectService.Create(p);
    }

    @PutMapping("/updateProject/{ID}")
    public Project modifierProject(@PathVariable int ID,@RequestBody Project p)
    {
        return projectService.Update(ID,p);
    }
    @GetMapping("/showProjects")
    public List<Project> afficherProjects()
    {
       return projectService.Read();
    }

    @GetMapping("/showProject/{ID}")
    public Project afficherUnSeulProject(@PathVariable int ID)
    {
        return projectService.getOne(ID);
    }
    @DeleteMapping("/deleteProject/{ID}")
    public List<Project> supprimerProject(@PathVariable int ID)
    {
        String s=projectService.Delete(ID);
        return projectService.Read();
    }


}
