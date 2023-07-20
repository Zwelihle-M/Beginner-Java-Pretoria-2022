/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USERTeK
 */
import javax.swing.JOptionPane;
public class Customer_Finance {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //two objects . first with interest and second with no interest
        Finance_Period a=new Finance_Period();
        a.setCustomerName();
        a.setContactNumber();
        a.setProductPrice();
        a.setNumberOfMonths();
        a.calculate_repayment();
        display_info(a);
        Finance_Period b=new Finance_Period();
        b.setCustomerName();
        b.setContactNumber();
        b.setProductPrice();
        b.setNumberOfMonths();
        b.calculate_repayment();
        display_info(b);
    }
    //displaying message box
    public static void display_info(Customer c) {
        String info=String.format("Customer Name:%s \n Customer Contact: %d \n Product Amount: R %.2f%n "
                + "Repayment Months: %.0f%n Monthly Repayment: R %.2f%n Total Due: R %.2f%n",
                c.customerName,c.contactNumber,c.productPrice,c.numberOfMonths,
                c.monthlyRepaymentAmount,c.monthlyRepaymentAmount*c.numberOfMonths);
        JOptionPane.showMessageDialog(null, info);
    }
}