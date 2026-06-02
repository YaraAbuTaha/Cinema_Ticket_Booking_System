
package cinematicketproject;
import java.util.*;

public class MYSL {

  
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("*  Welcome to MYSL Cinema   *");
        System.out.println("*****************************");
        System.out.println("This is our website to book your ticket <3");
        System.out.println("Ticket categories depends on age: kids,adult,teen");
        System.out.println("Seat Type: standard,VIP");
        System.out.println("YOU CAN ONLY BOOK 5 SEATS EACH TIME ");
        System.out.println("our discounts depents on the number of seats \n three seats= 10% \n four or five seats= 20%");
        System.out.println("press enter to start booking!!");
        double price =0.0;
        double total=0.0;
        input.nextLine();
        String enter= "yes";
        while (enter.equals("yes")){
            total=0.0;
            System.out.print("enter number of ticket :");
            int T = input.nextInt();
            if (T<=5 && T>0){
                System.out.println("ticket number="+T);
            }
            else{
            System.out.println("sorry!you can book 5 only,try again.");
            return;
            }
           for (int i=1 ;i<=T;i++){
               input.nextLine();
                System.out.print("enter seat type:VIP,standard : ");
               String S =input.nextLine();
                   System.out.println("seat type="+S);
               System.out.print("enter age: ");
               double a = input.nextDouble();
                 if(a<=3){
                   System.out.println("sorry its under 4 years");
                   price=0.0;
               }
               else if(a<=10){
                   System.out.println("kid age="+a);
                   price = 4.0;
                   if(S.equalsIgnoreCase("VIP")){
                       price = 8.0;
                   }
               }
                   else if(a<=18){
                   System.out.println("teen age="+a);
                   price =8.0;
                   if(S.equalsIgnoreCase("VIP")){
                       price =13.0;
                   }
                   }
                   else {
                       System.out.println("adult age="+a);
                       price = 12.0;
                       if(S.equals("VIP")){
                           price=17.0;
                       }
                           }
             
               
                   total = total + price;   
               }
           
               System.out.println("price before discount="+total );
               double sale;
           if(T==3){
                sale= total*0.90;
            }
           else if (T==4 || T==5){
               sale = total*0.80;
           }
           else{
               sale = total*1.0;
           }
                 
            
             System.out.println("price after discount=" +sale);
             input.nextLine();
             System.out.println("enter stop to exit! and enter yes for another booking");
              enter = input.nextLine();
              
              
              
             }
           }   
          
   
            
        }
        
        
  

