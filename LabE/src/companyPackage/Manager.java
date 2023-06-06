package companyPackage;

import java.text.NumberFormat;
import java.util.Locale;

public class Manager extends Employee{
    String division;
    int salesForce;
    double annualBonus;
    /**
     * this is the main class variable declaration for a manger type employee
     * @param name
     * @param employeeNumber
     * @param baseSalary
     * @param hireDate
     * @param division
     * @param salesForce
     * @param annualBonus 
     */
    public Manager(String name, String employeeNumber, double baseSalary, String hireDate, String division, int salesForce, double annualBonus) {
        super(name, employeeNumber, baseSalary, hireDate);
        this.division = division;
        this.salesForce = salesForce;
        this.annualBonus = annualBonus;
        /**
         * the method used to pass through inputs from user
         */
    }

    public Manager() {
        super();
        this.division = "";
        this.salesForce = 0;
        this.annualBonus = 0.0;
        /**
         * default method if there is no inputs
         */
    }

    public String getDivision() {
        return division;
        /**
         * returns division
         */
    }

    public void setDivision(String division) {
        this.division = division;
        /**
         * sets division var to division
         */
    }

    public int getSalesForce() {
        return salesForce;
        /**
         * returns salesForce
         */
    }

    public void setSalesForce(int salesForce) {
        this.salesForce = salesForce;
        /**
         * sets sales force var to salesForce
         */
    }

    public double getAnnualBonus() {
        return annualBonus;
        /**
         * returns annualBonus
         */
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
        /**
         * sets annual bonus var to annualBonus
         */
    }

    public String getAnnualBonusFormatted() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        return formatter.format(annualBonus);
        /**
         * returns annualBonusFormatted
         */
    }
}
