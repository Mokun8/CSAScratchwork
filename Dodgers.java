import java.util.Scanner;

public class Dodgers {
   public static void main(String[] args) {
   String Rotation;
   String favPlayer;
   boolean win;
   int numWins;
   double teamOPS;
   double teamOPB;
   double teamSLG;
   double teamMOBA;
   
   Rotation = "Yamamoto, Snell, Skubal, Glasnow, and Sheehan";
   favPlayer = "Clayton Kershaw";
   win = true;
   numWins = 91;
   teamOPB = .337;
   teamSLG = .422;
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("The Dodgers have won " + numWins + " games in the 2026 season so far");
   System.out.println("In " + Rotation + " we trust");
   favPlayer = scanner.nextLine();
   System.out.println("Your favorite Dodgers player is " + favPlayer);
   teamOPS = (teamOPB + teamSLG);
   teamMOBA = (teamSLG / 4.0 + teamOPB);
   System.out.println("The current Dodgers team OPS is " + teamOPS);
   System.out.println("The current Dodgers team MOBA is " + teamMOBA);
   
      if (win=true){
      System.out.println("Three-peat back on");
      }else{
      System.out.println("It's never been more over");
      }
  
      if (favPlayer.equals("Clayton Kershaw")){
      System.out.print("Did we just become best friends?");
      
      }
   }
}