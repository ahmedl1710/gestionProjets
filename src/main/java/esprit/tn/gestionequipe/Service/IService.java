package esprit.tn.gestionequipe.Service;

import java.util.List;

public interface IService <object>{

    object Create(object T);
    List<object> Read();
    object Update(int ID,object T);
    String  Delete(int ID );

    object getOne(Integer ID);
}
