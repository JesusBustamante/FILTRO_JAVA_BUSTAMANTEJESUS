package View;

import Controller.ninjaController;
import Model.mision;
import Model.ninja;
import Model.skill;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
    
    public void showAvailableMissions() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ninja ID: ");
        int id = sc.nextInt();
        
        List<mision> missions = ninjasController.getAvailableMissions(id);
        
        if(missions.isEmpty()) {
            System.out.println("\nNo missions available for this ninja");
            return;
        }
        
        System.out.println("\nMissions available for this ninja:\n");
        
        missions.forEach(m ->
                        System.out.println("ID: " + m.getId() + " - Description: " + m.getDescription() + " - Range: " 
                                            + m.getRangesMission() + " - Reward: " + m.getReward()));
                                            
    }
    
    public void showCompletedMissions() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ninja ID: ");
        int id = sc.nextInt();
        
        List<mision> missions = ninjasController.getCompletedMissions(id);
        
        if(missions.isEmpty()) {
            System.out.println("\nNo missions completed for this ninja");
            return;
        }
        
        System.out.println("\nMissions completed for this ninja:\n");
        
        missions.forEach(m ->
                        System.out.println("ID: " + m.getId() + " - Description: " + m.getDescription() + " - Range: " 
                                            + m.getRangesMission() + " - Reward: " + m.getReward()));
                                            
    }
    
    public void assignMissionNinja() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ninja ID: ");
        int idninja = sc.nextInt();
        
        System.out.print("Enter the id of the mission to assign: ");
        int idmission = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Start Date (YYYY-MM-DD): ");
        String startdate = sc.nextLine();
        
        try {
            LocalDate startDate = LocalDate.parse(startdate);
            boolean register = ninjasController.assignMission(idninja, idmission, startDate);
            
            if(register) {
                System.out.println("\nMission successfully assigned");
            } else {
                System.out.println("\nCould not assign the mission");
            }
        } catch (DateTimeParseException e) {
            System.out.println("\nInvalid date. Use format (YYYY-MM-DD)");
        }
        
    }
    
    public void completeMissionNinja() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ninja ID: ");
        int idninja = sc.nextInt();
        
        System.out.print("Enter the id of the mission to assign: ");
        int idmission = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter End Date (YYYY-MM-DD): ");
        String enddate = sc.nextLine();
        
        try {
            LocalDate endDate = LocalDate.parse(enddate);
            boolean register = ninjasController.completeMission(idninja, idmission, endDate);
            
            if(register) {
                System.out.println("\nMission marked as completed");
            } else {
                System.out.println("\nCCould not update the mission. Verify that it is assigned");
            }
        } catch (DateTimeParseException e) {
            System.out.println("\nInvalid date. Use format (YYYY-MM-DD)");
        }
        
    }
}
