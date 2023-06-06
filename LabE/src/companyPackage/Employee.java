
package companyPackage;

import java.text.NumberFormat;

public class Employee {
    String name;
    String employeeNum;
    double baseSalary;
    String hireDate;
    /**
     * this is the defining of the variables in the employee class
     * @param name
     * @param employeeNum
     * @param baseSalary
     * @param hireDate 
     */
   public Employee(String name, String employeeNum, double baseSalary, String hireDate){
       this.name = name;
       this.employeeNum = employeeNum;
       this.baseSalary = baseSalary;
       this.hireDate = hireDate;
       /**
        * creating the employee method that i can pass the values collected through
        */
   }

   public Employee(){
       this.name = "";
       this.employeeNum = "";
       this.baseSalary = 0.0;
       this.hireDate = "";
       /**
        * this is the default employee when no values are passed through
        */
   }
    public String getName(){
        return this.name;
        /**
         * returns name
         */
   }
    public void setName(String name){
        this.name = name;
        /**
         * sets name var to name
         */
    }
    public String getNum(){
        return this.employeeNum;
         /**
         * returns number
         */
    }
    public void setNum(String employeeNum){
        this.employeeNum = employeeNum;
        /**
         * sets number var to employeeNum
         */
    }
    public String getHireDate(){
        return this.hireDate;
         /**
         * returns hire date
         */       
    }
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
        /**
         * sets hire date var to hireDate
         */
    }
    public double getBaseSalary(){
        return this.baseSalary;
        /**
         * returns base salary
         */
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
        /**
         * sets base salary var to baseSalary
         */
    }
    public String getBaseSalaryFormatted(){
        return NumberFormat.getCurrencyInstance().format(this.baseSalary);
        /**
         * returns base salary formatted
         */
    }
}
