/*
Abe Brege
LabE
4/15/23
*/
package companyPackage;
import java.util.Scanner;
import java.text.NumberFormat;

public class LabE {

    public static void main(String[] args) {
        //this is defining variables that will be used later
         
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String nextEmployee = "y";
        boolean validSalary = false;
        boolean validForce = false;
        boolean validBonus = false;
        boolean validRate = false;
        boolean validSalesSalary = false;
        boolean validSalesToDate = false;
        int salesForce = 0;
        double baseSalary = 0.0;
        double annualBonus = 0.0;
        double salesToDate = 0.0;
        double commissionRate = 0.0;
        
            Scanner sc; //setting up scanner
            sc = new Scanner(System.in);
            String input;
            
            System.out.println("Welcome to the Employee Maker");
            // asking user if they want to create a manager or sales person, the first if is what happens for manager
             
        while(!nextEmployee.equalsIgnoreCase("n")){    
            System.out.print("Would you like to create a Manager (type m) or a Sales Person (type s)");
            input = sc.nextLine();
            String employeeType = input;
            // assigning each input to variables
             
            if (employeeType.equalsIgnoreCase("m")){
                System.out.println("Name: ");
                input = sc.nextLine();
                String name = input;
                
                System.out.println("Employee Number: ");
                input = sc.nextLine();
                String employeeNum = input;

               do{ 
                  System.out.println("Base Salary: ");
                  try{
                      input = sc.nextLine();
                      baseSalary = Double.parseDouble(input);
                      validSalary = true;
                     } 
                  catch(NumberFormatException e){
                      System.out.println("That is not a valid salary. Please enter in a number.");
                  }
               }while(!validSalary);

                System.out.println("Hire Date: ");
                input = sc.nextLine();
                String hireDate = input;

                System.out.println("Division: ");
                input = sc.nextLine();
                String division = input;
                
                do {
                    System.out.println("Sales Force: ");
                    try {
                        input = sc.nextLine();
                        salesForce = Integer.parseInt(input);
                        validForce = true;
                        } 
                    catch (NumberFormatException e) {
                            System.out.println("That is not a valid sales force. Please enter in a whole number.");
                        }
                    } while (!validForce);
                
                do {
                    System.out.println("Annual Bonus: ");
                try {
                    input = sc.nextLine();
                    annualBonus = Double.parseDouble(input);
                    validBonus = true;
                    } 
                catch (NumberFormatException e) {
                    System.out.println("That is not a valid annual bonus. Please enter in a number.");
                     }
                    } while (!validBonus);
                //creating the manager class instance and then setting the variables, followed by the report that pulls from the Manager class using get
                 
                Manager manager = new Manager(name, employeeNum, baseSalary, hireDate, division, salesForce, annualBonus);
                    manager.setName(name);
                    manager.setNum(employeeNum);
                    manager.setBaseSalary(baseSalary);
                    manager.setHireDate(hireDate);
                    manager.setDivision(division);
                    manager.setSalesForce(salesForce);
                    manager.setAnnualBonus(annualBonus);
                    
                    System.out.println("\nMANAGER REPORT:");
                    System.out.println("Name: " + manager.getName());
                    System.out.println("Employee Number: " + manager.getNum());
                    System.out.println("Base Salary: " + currencyFormat.format(manager.getBaseSalary()));
                    System.out.println("Hire Date: " + manager.getHireDate());
                    System.out.println("Division: " + manager.getDivision());
                    System.out.println("Sales Force: " + manager.getSalesForce());
                    System.out.println("Annual Bonus: " + currencyFormat.format(manager.getAnnualBonus()));
                    
                    System.out.println("Would you like to create another employee?: ");
                    nextEmployee = sc.nextLine();
                    
                     //below is the same, but for the sales person
                     
            }
            else if(employeeType.equalsIgnoreCase("s")){
                System.out.println("Name: ");
                input = sc.nextLine();
                String name = input;
                
                System.out.println("Employee Number: ");
                input = sc.nextLine();
                String employeeNum = input;

                do{ 
                  System.out.println("Base Salary: ");
                  try{
                      input = sc.nextLine();
                      baseSalary = Double.parseDouble(input);
                      validSalesSalary = true;
                     } 
                  catch(NumberFormatException e){
                      System.out.println("That is not a valid salary. Please enter in a number.");
                  }
               }while(!validSalesSalary);

                System.out.println("Hire Date: ");
                input = sc.nextLine();
                String hireDate = input;
                
                do {
                    System.out.println("Commission rate: ");
                    try {
                        input = sc.nextLine();
                        commissionRate = Double.parseDouble(input);
                        validRate = true;
                    } catch (NumberFormatException e) {
                        System.out.println("That is not a valid commission rate. Please enter in a number.");
                    }
                } while (!validRate);
                
                do {
                    System.out.println("Sales To Date: ");
                    try {
                        input = sc.nextLine();
                        salesToDate = Double.parseDouble(input);
                        validSalesToDate = true;
                    } catch (NumberFormatException e) {
                        System.out.println("That is not a valid sales to date number. Please enter in a number.");
                    }
                } while (!validSalesToDate);
                //salesperson class instance with the variables being set and then got from the get methods for the report
                SalesPerson salesPerson = new SalesPerson(name, employeeNum, baseSalary, hireDate, commissionRate, salesToDate);
                    salesPerson.setName(name);
                    salesPerson.setNum(employeeNum);
                    salesPerson.setBaseSalary(baseSalary);
                    salesPerson.setHireDate(hireDate);
                    salesPerson.setSalesToDate(salesToDate);
                    salesPerson.setCommissionRate(commissionRate);
                    
                    System.out.println("\nSALES PERSON REPORT:");
                    System.out.println("Name: " + salesPerson.getName());
                    System.out.println("Employee Number: " + salesPerson.getNum());
                    System.out.println("Base Salary: " + currencyFormat.format(salesPerson.getBaseSalary()));
                    System.out.println("Hire Date: " + salesPerson.getHireDate());
                    System.out.println("CommissionRate: " + salesPerson.getCommissionRateFormatted() + "%");
                    System.out.println("Sales to date: " + currencyFormat.format(salesPerson.getSalesToDate()));
                    System.out.println("Commission Earned: " + currencyFormat.format(salesPerson.getCommissionRate() * salesPerson.getSalesToDate()));
                    
                    System.out.println("Would you like to create another employee?: ");
                    nextEmployee = sc.nextLine();                    
                
            }
            
    }
    }
}
