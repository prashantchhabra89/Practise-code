import java.util.Scanner;


public class TowersOfHanoi {

   public void solve(int n, String start, String aux, String end)
   {
	   if(n == 1)
	   {
		   System.out.println(start + "->" + end);
	   }
	   else
	   {
		   solve(n-1, start, end, aux);
		   System.out.println(start + "->" + end);
	       solve(n-1, aux, start, end);
	   }
   }

   public static void main(String[] args) {
       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
       System.out.print("Enter number of discs: ");
       Scanner scanner = new Scanner(System.in);
       int discs = scanner.nextInt();
       towersOfHanoi.solve(discs, "A", "B", "C");
   }
}

