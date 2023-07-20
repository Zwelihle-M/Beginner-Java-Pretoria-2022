
package studentmarksreport;

/**
 *
 * @author UserTek
 */
public class StudentMarksReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student_Report stuReport = new Student_Report(); 
        stuReport.getStudentNum();
        stuReport.getTestResult();
        stuReport.getAssignResult();
        stuReport.getExamResult();
        stuReport.print_report();
    }
    
}
