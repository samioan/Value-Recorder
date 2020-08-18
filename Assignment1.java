//’σκηση 1
//Καταγραφή τιμών από το 10 ως το 100 σε πίνακα και εμφάνιση των τιμών των μοναδικών εισόδων
//Assignment1.java

public class Assignment1 {

   public static void main(String args[]){
   
      Assignment1Methods as1 = new Assignment1Methods();
      
      System.out.println("ASSIGNMENT 1");
      System.out.println("");
      
      //Μέθοδοι εφαρμογής
      as1.setEntries(); //καθορισμός πλήθους εισόδων
      as1.enterValues(); //εισαγωγή και καταγραφή τιμών
      as1.findUnique(); //εμφάνιση των τιμών των μοναδικών εισόδων
      
      System.out.println("");
      System.out.println("END OF PROGRAM"); 
                                     
   }//τέλος μεθόδου main

}//τέλος κλάσης Assignment1