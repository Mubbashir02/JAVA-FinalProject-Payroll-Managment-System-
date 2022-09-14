/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mubbashir
 */
public class Employeinfo {
    String FirstName;
    String lastName;
    String empdepartment;
    String level;
    int hours;
    private int salary;
    private int empAge;
    private int officeid;
    private int cnic;
    String a;
    boolean b = false;
    Scanner input = new Scanner(System.in);
    public void public_display()
    {
        System.out.println("Enter your first name: ");
        FirstName = input.nextLine();
        
         System.out.println("Enter your last name: ");
        lastName = input.nextLine();
        
         System.out.println("Enter employee department: ");
        empdepartment = input.nextLine();
        do{
            
            System.out.println("Enter level: ");
            System.out.println("1.manager\n 2. assistant manager\n 3. assistant : ");
            level =input.nextLine();
            if("manager".equals(level)||"assistant manager".equals(level)||"assistant".equals(level)) 
            {
              a = level;
              b = true;
              break;
            }
            else
            {
                System.out.println("Please input correct: ");
            }
           
        }
        while(b != true);
                
         
         

        System.out.println("Enter hours: ");
        hours = input.nextInt();        
      
    }
    public void setempage() {
        
        System.out.println("Enter your age : ");
        empAge = input.nextInt();
        }
        
         public void setcnic(){
        
        System.out.println("enter cnic number: ");
        cnic= input.nextInt();
       
         }
        public void setofficeid(){
       
        System.out.println("enter office id: ");
        officeid=input.nextInt();
       
        }
        
        public void setsalary() {
        
        System.out.println("Enter salary : ");
        salary = input.nextInt();
    }

    public void getempage() {
        System.out.println("Age "+ empAge);
       
    }
    
    
    public void getcnic() {
        System.out.println("CNIC " +cnic);
       
    }
    
    public void getofficeid() {
        System.out.println("ID "+officeid);
       
    }
    
    
    public void getsalary() {
        System.out.println("Salary "+ salary);
    }
    
    public void Write () throws IOException
    {
     
        try{
            System.out.println("\n");
       FileWriter  myObj = new FileWriter ("filename.txt",true);
       BufferedWriter bufferedWriter =
                new BufferedWriter(myObj);
       
       bufferedWriter.write(salary + "\t");
       bufferedWriter.write( empAge+ "\t");
       bufferedWriter.write(officeid+ "\t");
       bufferedWriter.write(cnic+ "\t");
       bufferedWriter.write(FirstName+ "\t");
       bufferedWriter.write(lastName+ "\t");
       bufferedWriter.write( empdepartment+ "\t");
       bufferedWriter.write(level+ "\t");
       bufferedWriter.write( hours+ "\t");
       bufferedWriter.newLine();
      bufferedWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}
