import java.util.*;
public class Game_With_Integers
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t = sc.nextInt();  
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            if(n%3==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
        sc.close();
	}
}
