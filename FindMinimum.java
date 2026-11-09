public class FindMinimum {

    public static int findMin(){
      int n = 99;
      for(int i = 0; i < 10; i++){
        int a = ((int)(Math.random() * 100));
        if (a < n){
           n = a;
           }
           
          }
         return n;
        }
         
    public static void main (String[] args){
    System.out.print("The minimum of a random set of 10 numbers is " + findMin());
    }
  }