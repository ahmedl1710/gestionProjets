package esprit.tn.gestionequipe.Controller;

import esprit.tn.gestionequipe.Entity.Sprint;
import esprit.tn.gestionequipe.Service.ISprintImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sprint")
@AllArgsConstructor
public class SprintController {

    private ISprintImpl sprintService;

    @PostMapping("/addSprint")
    public Sprint ajouterSprint(@RequestBody Sprint s)
    {
       return sprintService.Create(s);
    }

    @PutMapping("/updateSprint/{ID}")
    public Sprint modifierSprint(@PathVariable int ID,@RequestBody Sprint s)
    {
        return sprintService.Update(ID,s);
    }

    @GetMapping("/showSprints")
    public List<Sprint> afficherSprint()
    {
        return sprintService.Read();
    }
    @GetMapping("showSprint/{ID}")
    public Sprint afficherUnSeulSprint(@PathVariable int ID)
    {
        return sprintService.getOne(ID);
    }
    @DeleteMapping("/deleteSprint/ID")
    public List<Sprint> supprimerSprint(@PathVariable int ID)
    {
        String s= sprintService.Delete(ID);
        return sprintService.Read();
    }
}
