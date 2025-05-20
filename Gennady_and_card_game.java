import java.util.HashSet;
import java.util.Scanner;

public class Gennady_and_card_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            String str=sc.nextLine();
            String my_cards=sc.nextLine();
            String cards[]=my_cards.split(" ");
            HashSet<Character>set=new HashSet<>();
            for(String card:cards){
                char rank=card.charAt(0);
                char suit=card.charAt(1);
                set.add(rank);
                set.add(suit);
            }
            boolean found=false;
            for(char ch:str.toCharArray()){
                if(set.contains(ch)){
                    found=true;
                    System.out.println("YES");
                    break;
                }
            }
            if(!found){
                System.out.println("NO");
            }
        // }
        sc.close();
    }
}
