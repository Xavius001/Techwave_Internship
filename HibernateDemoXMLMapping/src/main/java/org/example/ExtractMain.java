package org.example;

import org.example.dao.DbOperations;
import org.example.pojo.Projects;

import java.time.LocalDate;
import java.util.Scanner;

public class ExtractMain {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            int pcode = S.nextInt();
            Projects P = DbOperations.fetchProjectByCode(pcode);
            System.out.println("Project Details");
            System.out.println("Project Code "+P.getProjectCode());
            System.out.println("Project Desc "+P.getProjectDesc());
            System.out.println("Project stdt "+P.getStartDate());
            System.out.println("Duration "+P.getDuration());
            System.out.println("Do you want to extract another line? Y/N");
            S.nextLine();
            char Choice = S.nextLine().charAt(0);
            if(Choice=='N') {
                repeat = false;
            }
        }
    }
}
