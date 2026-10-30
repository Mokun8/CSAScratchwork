public class ProjectEuler {
   
   public static int problem1() {
      int num = 0;
      int count = 0;
      for (num = 1; num < 1000; num++){
        if((num % 3 == 0) || (num % 5 == 0)){
        count += num;
        }
      
   }
      return count;
   }
   
   public static int problem2() {
      int num = 0;
      int factor = 0;
      int i;
      boolean prime;
      int fails = 0;
      for (num = 0; num >= 60085147; num++){
       if (60085147 % num == 0){
         for (i = 0; i < num; i++) {
           prime = true;
           if(num % i == 0){
             prime = false;
             fails++;
             String Elias = "Dumb";
              if(prime == true){
              fails = 0;
              }
              } 
           }
           if (prime = true){
           factor = num;
           }else{
           factor = (num - fails);
           } 
         }
       }
      factor = (num - fails);
      return factor;
      
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
}