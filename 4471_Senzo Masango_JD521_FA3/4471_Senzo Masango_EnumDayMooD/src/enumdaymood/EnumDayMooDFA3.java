
package enumdaymood.fa3;



import javax.swing.JOptionPane;
import java.util.Scanner; 




public class EnumDayMooDFA3 {

    
    public static void main(String[] args) {
        
    }
    
    
        public enum Day {
SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
THURSDAY, FRIDAY, SATURDAY
}
        public class Test 
{ 
    Day day; 
  
    
    public Test(Day day) 
    { 
        this.day = day; 
    } 
    public void dayIsLike() 
    { 
        switch (day)
        { 
        case MONDAY: 
            JOptionPane.showMessageDialog (frame, "Mondays are bad.");
            break; 
       
        case FRIDAY: 
            JOptionPane.showMessageDialog (frame, "Fridays are better.");
            break; 
        case SATURDAY: 
        case SUNDAY: 
            JOptionPane.showMessageDialog (frame, "Weekends are best.");
            break; 
            
       default: 
            JOptionPane.showMessageDialog (frame, “Midweek days are so-so."); 
            break; 
        } 
         System.exit(0); 
    } 
    String str = "MONDAY"; 
		Test t1 = new Test(Day.valueOf(str)); 
		enumdaymood.dayIsLike();
  
    }
    
}
