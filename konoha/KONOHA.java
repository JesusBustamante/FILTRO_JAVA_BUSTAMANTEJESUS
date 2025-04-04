package konoha;

import View.ninjaView;
import java.sql.*;
import java.util.Scanner;

public class KONOHA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ninjaView ninjasView = new ninjaView();
        while (true) {
            System.out.println("\nNinjas Menu\n");
            System.out.println("1. List all ninjas with their skills");
            System.out.println("2. Show available missions for a specific ninja");
            System.out.println("3. Display the missions completed for a specific ninja");
            System.out.println("4. Assign a mission to a ninja, recording the start date");
            System.out.println("5. Mark a mission as completed, recording the date of completion");
            System.out.print("Choose: ");
            
            int option = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch (option) {
                case 1:
                    ninjasView.showNinjas();
                    break;
                case 2:
                    ninjasView.showAvailableMissions();
                    break;
                case 3:
                    ninjasView.showCompletedMissions();
                    break;
                case 4:
                    ninjasView.assignMissionNinja();
                    break;
                case 5:
                    ninjasView.completeMissionNinja();
                    break;
                default :
                    break;
            }
        }
    }

}
