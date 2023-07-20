/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonkiller;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;



    
public class DragonKiller  {
    String NameSurname;
    
    public void DragonKiller(String NameSurname){
      this.NameSurname = NameSurname;  
    }
    
    public void Input_Name (){
        NameSurname = JOptionPane.showInputDialog("Enter Name and Surname");
        
    }
    public void RemoveSpace(){  
        //Replaces the space between the name surname
        String withoutspace = NameSurname.replaceAll("\\s", " "); 
        int count = 0;
        
        for (int i=0;i<withoutspace.length();i++){
            
            count++;
            
        }
        
        
        
             
        
    }
    
    
    
    
    

public static void main(String[] args) {
    DragonKiller DK = new DragonKiller(); 
    DK.Input_Name();  //calls the input 
    DK.RemoveSpace(); //calls the spacing function 
    
    
    int arr[] ={10,20,30,40,50}; //Loop through the array to find value using binary search
    int key = 30;
    int result = Arrays.binarySearch(arr,key);
    if (result<0)
        System.out.println("Element is not found");
    else
        System.out.println("Element is found at Index:"+result);
    
    
    
  
        
    
     
    
    
    
        
        

        
    }
    
}
