/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.IOException;

/**
 *
 * @author Mubbashir
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Payroll_Managment_System pay = new Payroll_Managment_System();
        //pay.MainHeader();
        //pay.login_page();
        Employeinfo info = new Employeinfo();
        info.public_display();
        info.setcnic();
        info.setempage();
        info.setofficeid();
        info.setsalary();
        info.Write();
        ShowDetail show = new ShowDetail();
        show.display();
    }
    
}
