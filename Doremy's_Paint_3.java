import java.util.*;
public class Doremys_Paint_3 {
    public static String getAns(int n, int arr[]) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int x : arr) {
            frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
            if(frequencyMap.size()>2)return "NO";
        }
        if (frequencyMap.size() == 1) {
            return "YES";
        }
        if (frequencyMap.size() == 2) {
            List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
            if (frequencies.get(0)!=n/2 && frequencies.get(0)!=(n+1)/2) {
                return "NO";
            } else {
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n <= 2) {
                System.out.println("YES");
            } else {
                String ans = getAns(n, arr);
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
