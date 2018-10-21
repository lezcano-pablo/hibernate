/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp2;

/**
 *
 * @author FamiliaLezcano
 */
public class Testapp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String employeeName= "Pablo";
        String employeeLocation= "Salta";
        double employeeSalary= 1200000;
        if(DataBaseAccessObject.addEmployee( employeeName,  employeeLocation,  employeeSalary)){
            System.out.println("Employee added successfully");
        }
        else{
            System.out.println("Falta error occured");
        }
    }
    
}
