
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Card_Game {
    static class Pair implements Comparable<Pair>{
        int a;
        long b;
        String str;

        Pair(int a,long b,String str){
            this.a=a;
            this.b=b;
            this.str=str;
        }

        public int compareTo(Pair o) {
            return Integer.compare(this.a, o.a); // Ascending order by a
        }


        // To store and get the values of a pair class in a HASHMAP in java.
        /*
            //  equals() method
            @Override
            public boolean equals(Object o) {
                if (this == o) return true; // same object
                if (o == null || getClass() != o.getClass()) return false; // type check

                Pair pair = (Pair) o;
                return a == pair.a && b == pair.b; // value comparison
            }

            //  hashCode() method
            @Override
            public int hashCode() {
                return Objects.hash(a, b); // simple & reliable
            }
                */




//            public int compareTo(Pair o){
//                return Long.compare(this.b,o.b);
//            }
//
//            public int compareTo(Pair other) {
//                return this.str.compareTo(other.str); // Ascending order by str
//            }
//
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static ArrayList<Integer>[] gr;
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            String str=sc.next();
            TreeSet<Integer> al=new TreeSet<>();
            TreeSet<Integer> bo=new TreeSet<>();
            int ele=-1;
            for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);
                if(ch=='A'){
                    al.add(i+1);
                }
                else {
                    bo.add(i+1);
                    if (i!=n-1){
                        ele=i+1;
                    }
                }
            }

//            out.println(ele);

            boolean bob=true;
            for(int c:al){
                boolean beat=false;
                if (c==1 && ele>1){
                    beat=true;
                }
                else if (c==n && bo.contains(1)){
                    beat=true;
                }
                else if (c<n && c>1 && bo.last()>c){
                    beat=true;
                }
                bob&=beat;
            }

            if (!bob){
                out.println("Alice");
            }
            else {
                out.println("Bob");
            }
        }
        out.flush();
    }
}

