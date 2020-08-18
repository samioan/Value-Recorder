//’σκηση 1
//Καταγραφή τιμών από το 10 ως το 100 σε πίνακα και εμφάνιση των τιμών των μοναδικών εισόδων
//Μέθοδοι κύριας κλάσης
//Assignment1Methods.java

import java.util.Scanner;

public class Assignment1Methods{
   
   Scanner input = new Scanner(System.in);
   
   //Μεταβλητές   
   private int[] numbers; //πίνακας για εμφάνιση όλων των τιμών εισόδων
   private int[] numbers2; //πίνακας για εμφάνιση των τιμών των μοναδικών εισόδων    
   private int entries; //πλήθος εισόδων
   
   //Αρχικοποίηση μεταβλητών
   public Assignment1Methods(){
   
      numbers = new int[entries];
      numbers2 = new int[entries];   
      entries = 0;
   
   }//τέλος constructor 
   
   //Ορισμός πλήθους εισόδων
   public void setEntries(){
   
      System.out.print("Please enter your desired amount of entries: ");
      entries = input.nextInt();
      numbers = new int[entries];
      numbers2 = new int[entries];
   
   }//τέλος μεθόδου setEntries
   
   //Εισαγωγή και καταγραφή τιμών
   public void enterValues(){
   
      for(int i = 0; i < numbers.length; i++){
      
         System.out.print("Please enter a value between 10 and 100: ");
         numbers[i] = input.nextInt();     
             
         if(numbers[i] >= 10 && numbers[i] <= 100){
         
            numbers[i] = numbers[i];
            numbers2[i] = numbers[i];
            
         } else {
            System.out.println("Invalid value entered");
            numbers[i] = 0;
            numbers2[i] = 0;
            i--;        
            
         }//τέλος if
               
      }//τέλος for
   
   }//τέλος μεθόδου enterValues
   
   //Εύρεση, καταγραφή και εμφάνιση των τιμών των μοναδικών εισόδων
   public void findUnique(){
      
      //Εμφάνιση όλων των εισόδων σε ένα πίνακα
      System.out.println("");
      System.out.println("ARRAY WITH DUPLICATES");
      
      for(int i = 0; i < numbers.length; i++){
      
         System.out.print(+numbers[i]+" ");
         
      }//τέλος for
      
      //Εμφάνιση όλων των τιμών των μοναδικών εισόδων
      System.out.println("");
      System.out.println("ARRAY WITHOUT DUPLICATES");
      
      for(int a = 0; a<numbers2.length; a++){
      
         boolean isUnique=false;
         
         for (int j = 0; j < a; j++){
         
            if(numbers2[a]==numbers2[j]){
            
            isUnique=true;
            break;
            }//τέλος if
         
         }//τέλος for
         
         if(!isUnique){
         
            System.out.print(numbers2[a]+" ");
         
         }//τέλος if
      
      }//τέλος for
   
   System.out.println("");
                          
   }//τέλος μεθόδου findUnique      

}//τέλος κλάσης Assignment1Methods