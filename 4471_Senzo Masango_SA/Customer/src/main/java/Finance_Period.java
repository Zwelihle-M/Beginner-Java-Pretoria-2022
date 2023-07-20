/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USERTeK
 */
public class Finance_Period extends Customer {
    //if months<=3 no interest or else interest
    @Override
    public void calculate_repayment() {
        // TODO Auto-generated method stub
        if(numberOfMonths<=3) {    
            monthlyRepaymentAmount=productPrice/numberOfMonths;
        }
        else {
            double interest= (25.0/100.0) * productPrice;
            double amount=productPrice + interest;
            monthlyRepaymentAmount=amount/numberOfMonths;
        }
    }
}