/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Scanner;

/**
 *
 * @author Mubbashir
 */
public class Payroll_Managment_System {
     public void MainHeader()
    {  
        System.out.print("\n\n\n\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.print("\t\t\t@@ ____________________________________________________________________________________________________________________________@@\n");
        System.out.print("\t\t\t@@|                                                                                                                           |@@\n");
        System.out.print("\t\t\t@@|                                                     WELCOME TO                                                            |@@\n");
        System.out.print("\t\t\t@@|                                                                                                                           |@@\n");
        System.out.print("\t\t\t@@|                                               M AND M SOFTWARE HOUSE                                                      |@@\n");
        System.out.print("\t\t\t@@|                                                                                                                           |@@\n");
        System.out.print("\t\t\t@@|                                         2-B East Street, Phase-I, DHA Karachi                                             |@@\n");                                                                                  
        System.out.print("\t\t\t@@ ____________________________________________________________________________________________________________________________@@\n");
        System.out.print("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\n");
       
        System.out.print("\t\t                                          ___________________________________________________                                          \n\n");
        System.out.print("\t\t                                                   @@| PayRoll Managment System|@@                                       \n");
        System.out.print("\t\t                                          ___________________________________________________                                        \n\n");
}

     public void login_page()
     {
         
         Scanner sc = new Scanner(System.in);
         String username,password;
         String Output_Username="admin";
         String Output_Password="12345";
        boolean login = false;
        while(!login)
        {
            System.out.println("");
             System.out.print("\t\t\t\t\t\t\t\t\t\tUsername: ");
            username = sc.next();
            System.out.println("");
            System.out.print("\t\t\t\t\t\t\t\t\t\t Password: ");
            password = sc.next();
            System.out.println("");
            if(username.equals(Output_Username) && password.equals(Output_Password))
            {
                System.out.println("\t\t\t\t\t\t\t\t\t\tLogin Successfuly");
                login = true;
            }
            else
            {
                System.out.println("\t\t\t\t\t\t\t\t\t\tUnSuccessfuly Login");
                
            }
        }   
         
        
     }
     
}

