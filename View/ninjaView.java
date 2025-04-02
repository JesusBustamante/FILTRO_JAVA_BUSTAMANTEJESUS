package View;

import Controller.ninjaController;
import Model.ninja;

public class ninjaView {
    
    private ninjaController ninjasController = new ninjaController();
    
    public void showNinjas() {
        System.out.println("Ninjas with their skills");
        
        for(ninja ninjas : ninjasController.getNinjaSkill()) {
            System.out.println("Nombre: " + ninjas.getName());
        }
        
        
    }
    
}
