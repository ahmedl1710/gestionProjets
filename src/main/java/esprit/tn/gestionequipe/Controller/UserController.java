package esprit.tn.gestionequipe.Controller;

import esprit.tn.gestionequipe.Entity.User;
import esprit.tn.gestionequipe.Service.IUserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private IUserServiceImpl userService;

    @PostMapping("/addUser")
    public User ajouterUser(@RequestBody User u)
    {
        return  userService.Create(u);
    }


        @PutMapping("/updateUser/{ID}")
    public User modifierUser(@PathVariable int ID,@RequestBody User u)
    {
        return userService.Update(ID,u);
    }

    @GetMapping("/showUsers")
    public List<User> afficherUsers()
    {
        return userService.Read();
    }

    @GetMapping("/showUSer/{ID}")
    public User afficherUnSeulUser(@PathVariable int ID)
    {
       return userService.getOne(ID);
    }

    @DeleteMapping("/deletUser/{ID}")
    public List<User> deleteUser(@PathVariable int ID)
    {
         String s=userService.Delete(ID);
         return userService.Read();

    }


}
