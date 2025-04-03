package konoha;

import View.ninjaView;
import java.sql.*;
import java.util.Scanner;

public class KONOHA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ninjaView ninjasView = new ninjaView();
        while (true) {
            System.out.println("Ninjas Menu\n");
            System.out.println("1. List all ninjas with their skills");
            System.out.println("2. Show available missions for a specific ninja");
            System.out.print("Choose: ");
            
            int option = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch (option) {
                case 1:
                    ninjasView.showNinjas();
                    break;
                case 2:
                    
                    break;
                default :
                    break;
            }
        }
    }

}
