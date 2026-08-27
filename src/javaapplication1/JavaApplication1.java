/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 25074428
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a new Scanner object named 's' to read input from the console
        Scanner s = new Scanner(System.in);
        
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************************************");
        
        //starts an infinite loop that will keep running until explicitly broken
        while (true) {
        System.out.println("------------------------------------------------");
        System.out.print("Enter (1) to launch menu or any other key to exit ");
        
        //Reads the complete line of text entered by the user and stores it in value
        String value = s.nextLine();
        System.out.println("-------------------------------------------------");
        
        //Check if the user typed "1" after removing any accidntal spaces
        if("1".equals(value.trim())){
            
            //calls the menu display method and stores the chosen option number
            int choice = Products.DisplayMenu();
            
            //Beging evaluating the numerical choice to run the correct feature
            switch(choice){
                
                //execute product creation if the option is 1
                case 1: Products.CaptureProduct();
                    break;//stop execution inside the switch block and exits it
                    
                //execute product creation if the option is 2  
                case 2: Products.SearchProduct();
                    break;//stop execution inside the switch block and exits it
                    
                //execute product creation if the option is 3    
                case 3: Products.UpdateProduct();
                    break;//stop execution inside the switch block and exits it
                    
                //execute product creation if the option is 4    
                case 4: Products.DeleteProduct();
                    break;//stop execution inside the switch block and exits it
                    
                //execute product creation if the option is 5    
                case 5: Products.PrintProductReport();
                    break;//stop execution inside the switch block and exits it
                    
                //execute product creation if the option is 6    
                case 6: Products.ExitApplication();
                    break;//stop execution inside the switch block and exits it
            }
        }
        
        //executes altarnative code if the user input was not "1"
        else{  
            Products.ExitApplication();
        } 
            
        }
    
    }
    
}