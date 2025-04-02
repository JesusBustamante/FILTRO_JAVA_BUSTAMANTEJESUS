package Controller;

import Model.ninja;
import Model.ninjaDAO;
import java.util.List;

public class ninjaController {

    private ninjaDAO ninjasDAO = new ninjaDAO();
    
    public List<ninja> getNinjaSkill() {
        
        return (List<ninja>) ninjasDAO.getAllNinjas();
    }

}
