package companyPackage;

import java.text.NumberFormat;
import java.util.Locale; 

public class SalesPerson extends Employee {
    double commissionRate;
    double salesToDate;
    /**
     * sets the two variables of SalesPerson in the SalesPerson class that extends Employee
     * @param name
     * @param employeeNumber
     * @param baseSalary
     * @param hireDate
     * @param salesToDate
     * @param commissionRate 
     */

    public SalesPerson(String name, String employeeNumber, double baseSalary, String hireDate, double salesToDate, double commissionRate) {
        super(name, employeeNumber, baseSalary, hireDate);
        this.salesToDate = salesToDate;
        this.commissionRate = commissionRate;
        /**
         * method used for when we get user input
         */
    }
    
    public SalesPerson() {
        super();
        this.commissionRate = 0.0;
        this.salesToDate = 0.0;
        /**
         * default fallback method for when there is no user input
         */
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
        /**
         * sets commission rate var to commissionRate
         */
    }

    public double getCommissionRate() {
        return commissionRate;
        /**
         * returns commissionRate
         */
    }

    public void setSalesToDate(double salesToDate) {
        this.salesToDate = salesToDate;
        /**
         * sets sales to date var to salesToDate
         */
    }

    public double getSalesToDate() {
        return salesToDate;
        /**
         * returns salesToDate
         */
    }

    public String getSalesToDateFormatted() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        return formatter.format(salesToDate);
        /**
         * returns salesToDateFormatted
         */
    }

    public double getCommissionRateFormatted() {
            return commissionRate * 100;
            /**
         * returns commissionRate as a whole number in a percentage
         */
    }
}
