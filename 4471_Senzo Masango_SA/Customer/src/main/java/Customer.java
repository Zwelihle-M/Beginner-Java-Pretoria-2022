/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USERTeK
 */
import javax.swing.JOptionPane;

public class Customer {
    //variables for storing customer data
    String customerName;
    int contactNumber;
    double productPrice;
    double numberOfMonths;
    double monthlyRepaymentAmount;
    //getter and setter 
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName() {
        this.customerName = JOptionPane.showInputDialog("Please enter the customer name ");
    }
    public int getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber() {
        this.contactNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter the customer contact number "));
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice() {
        this.productPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the product "));
    }
    public double getNumberOfMonths() {
        return numberOfMonths;
    }
    public void setNumberOfMonths() {
        this.numberOfMonths = Double.parseDouble(JOptionPane.showInputDialog("Please enter the number of repayment months "));
    }
    public void calculate_repayment() {
        System.out.print("hello");
        monthlyRepaymentAmount=productPrice/numberOfMonths;
    }
}

