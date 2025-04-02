package Controller;

import Model.ninja;
import Model.ninjaDAO;
import Model.skill;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ninjaController {

    private ninjaDAO ninjasDAO = new ninjaDAO();
    
    public List<ninja> getNinjaSkill() {
        
        return new ArrayList<>(ninjasDAO.getAllNinjas().keySet());
    }
    
    public Map<ninja, List<skill>> getNinjaWihSkill() {
        return ninjasDAO.getAllNinjas();
    }

}
