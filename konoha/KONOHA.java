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
            
            int option = sc.nextInt();
            sc.nextLine();
            
            switch (option) {
                case 1:
                    ninjasView.showNinjas();
                    break;
            }
        }
    }

}
