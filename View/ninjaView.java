package View;

import Controller.ninjaController;
import Model.ninja;
import Model.skill;
import java.util.List;
import java.util.Map;

public class ninjaView {
    
    private ninjaController ninjasController = new ninjaController();
    
    public void showNinjas() {
        System.out.println("Ninjas with their skills\n");
        
        Map<ninja, List<skill>> ninjasWithSkills = ninjasController.getNinjaWihSkill();
        
        for(Map.Entry<ninja, List<skill>> entry : ninjasWithSkills.entrySet()) {
            ninja ninjas = entry.getKey();
            List<skill> skills = entry.getValue();
            
            System.out.println("Name: " + ninjas.getName() + " - Village: " + ninjas.getVillage());
            
            if(skills.isEmpty()) {
                System.out.println("Dont have skills");
            } else {
                System.out.println("Skills:");
                for(skill s : skills) {
                    System.out.println(" - " + s.getName() + ": " + s.getDdescription());
                }
            }
        }
    }
    
}
