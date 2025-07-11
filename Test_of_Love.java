import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Test_of_Love {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();

            ArrayList<Integer> log = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) == 'L') {
                    log.add(i);
                }
            }
            log.add(n);
        
            int i = -1;
            int log_next = 0;
            boolean valid = true;

            while(i<n-1){
                if(m >= log.get(log_next) - i){
                    i = log.get(log_next);
                }else{
                    i+= m;
                    if(i>n-1){
                        valid = true;
                        break;
                    }
                    if(log_next >= log.size()) {
                        break;
                    }
                    while(i<n && i< log.get(log_next)) {
                        if(str.charAt(i) == 'C') {
                            valid = false;
                            break;
                        }
                        else{
                            if(k<=0){
                                valid = false;
                                break;
                            }else{
                                i++;
                                k--;
                            }
                        }
                    }
                }
                if(!valid) break;
                log_next++;
            }
            if(valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
