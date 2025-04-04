package Controller;

import Model.mision;
import Model.ninja;
import Model.ninjaDAO;
import Model.skill;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ninjaController {

    private ninjaDAO ninjasDAO = new ninjaDAO();
    
    // Obtener ninjas
    public List<ninja> getNinjaSkill() { 
        return new ArrayList<>(ninjasDAO.getAllNinjas().keySet());
    }
    
    public Map<ninja, List<skill>> getNinjaWihSkill() {
        return ninjasDAO.getAllNinjas();
    }
    
    // Obtener misiones disponibles de ninjas
    public List<mision> getAvailableMissions(int ninjaId) {
        return ninjasDAO.getAvailableMissions(ninjaId);
    }
    
    // Obtener misiones completadas de ninjas
    public List<mision> getCompletedMissions(int ninjaId) {
        return ninjasDAO.getCompletedMissions(ninjaId);
    }

    // Asignar mision
    public boolean assignMission(int ninjaId, int missionId, LocalDate startDate) {
        return ninjasDAO.assignMission(ninjaId, missionId, startDate);
    }
    
    // Completar mision
    public boolean completeMission(int ninjaId, int missionId, LocalDate endDate) {
        return ninjasDAO.completeMission(ninjaId, missionId, endDate);
    }
    
}