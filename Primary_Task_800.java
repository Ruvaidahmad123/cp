import java.util.Scanner;

public class Primary_Task_800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String str=n+"";
            if(str.length()<=2){
                System.out.println("NO");
                continue;
            }
            int first_part=Integer.parseInt(str.substring(0,2));
            String second_part=str.substring(2,str.length());
            int second_part_old_len=second_part.length();
            int second_part_new_len=(Integer.parseInt(second_part)+"").length();
            if(first_part==10 && second_part_old_len==second_part_new_len && Integer.parseInt(second_part)>=2){
                System.out.println(("YES"));
            }
            else
            System.out.println("NO");
        }
    }
}
