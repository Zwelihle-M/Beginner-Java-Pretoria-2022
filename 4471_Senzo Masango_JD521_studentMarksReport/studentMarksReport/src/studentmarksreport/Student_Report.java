
package studentmarksreport;

import javax.swing.JOptionPane;

/**
 *
 * @author UserTek
 */
public class Student_Report extends Student {

    
    public Student_Report(){}
    public Student_Report(int studentNum, double testResult, double assignResult, double examResult) {
        super(studentNum, testResult, assignResult, examResult);
    }

    
    @Override
    public void getStudentNum(){
        //Exception handling to insure integer is entered
        try{
            studentNum = Integer.parseInt(JOptionPane.showInputDialog("Enter student number"));           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            getStudentNum();
        }
    }
    @Override
    public void getTestResult(){
        //Exception handling to insure double is entered
        try{
            testResult = Integer.parseInt(JOptionPane.showInputDialog("Enter your test result"));           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            getTestResult();
        }
    }
    @Override
    public void getAssignResult(){
        //Exception handling to insure double is entered
        try{
            assignResult = Integer.parseInt(JOptionPane.showInputDialog("Enter your assignment result"));           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            getAssignResult();
        }
    }
    @Override
    public void getExamResult(){
        //Exception handling to insure double is entered
        try{
            examResult= Integer.parseInt(JOptionPane.showInputDialog("Enter your exam result"));           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            getExamResult();
        }
    }
    public void print_report(){
        double testWeighting = testResult * 0.25;
        double assignWeighting = assignResult * 0.25;
        double examWeighting = examResult * 0.5;
        double finalAssesment= testWeighting + assignWeighting  + examWeighting ;
        JOptionPane.showMessageDialog(null, "Student Number: " + studentNum + "\n" +
                                            "Test Result: " + testResult + "(25%)" + "\n" +
                                            "Assignment Result: " + assignResult + "(25%)" + "\n" +
                                            "Exam Result: " + examResult + "(50%)" + "\n" +
                                            "Final Assessment :" + finalAssesment + "%");
    }
    
}
