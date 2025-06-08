
import java.io.*;
import java.util.*;

public class Team_Training {


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int ch = 0; ch < t; ch++) {
            String[] temp = in.nextLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int x = Integer.parseInt(temp[1]);
            temp = in.nextLine().split(" ");
            ArrayList<Integer> lst = new ArrayList<>();
            int res = 0;
            for (int i = 0; i < n; i++) {
                int c = Integer.parseInt(temp[i]);
                if (c >= x)
                    res++;
                else lst.add(c);
            }
            Collections.sort(lst);
            int curBuf = 1;
            for (int i = lst.size() - 1; i >= 0; i--) {
                int k = (x % lst.get(i) > 0) ? (x / lst.get(i)) + 1 : x / lst.get(i);
                if (k <= curBuf) {
                    res++;
                    curBuf = 1;
                }
                else curBuf++;
            }

            System.out.println(res);
        }
    }
}