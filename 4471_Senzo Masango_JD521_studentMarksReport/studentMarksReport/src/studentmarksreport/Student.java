
package studentmarksreport;
import javax.swing.JOptionPane;
/**
 *
 * @author UserTek
 */
public class Student {
    
    int studentNum;
    double testResult;
    double assignResult; // Assignment Result
    double examResult;
    
    public Student(){}
    public Student(int studentNum, double testResult, double assignResult, double examResult){
        /*super(studentNum, testResult, assignResult, examResult);*/
        this.studentNum = studentNum;
        this.testResult = testResult;
        this.assignResult = assignResult;
        this.examResult = examResult;
        
        
    }
    public void getStudentNum(){
        //Exception handling to ensure integer is entered
        try{
            studentNum = Integer.parseInt(JOptionPane.showInputDialog("Enter student number"));           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            getStudentNum();
        }
    }
    public void getTestResult(){
        //Exception handling to ensure double is entered
        try{
            testResult = Integer.parseInt(JOptionPane.showInputDialog("Enter your test result"));           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            getTestResult();
        }
    }
    public void getAssignResult(){
        //Exception handling to ensure double is entered
        try{
            assignResult = Integer.parseInt(JOptionPane.showInputDialog("Enter your assignment result"));           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            getAssignResult();
        }
    }
    public void getExamResult(){
        //Exception handling to ensure double is entered
        try{
            examResult = Integer.parseInt(JOptionPane.showInputDialog("Enter your exam result"));           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            getExamResult();
        }
    }
}    
        
    
