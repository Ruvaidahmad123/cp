import java.util.*;
import java.io.*;

public class Alternating_Series {
    static long mod = (long) (1e9 + 7);
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            run();
        }
        out.flush();
    }

    static void run() {
        String s = sc.next();
        char[] c = s.toCharArray();
        Arrays.sort(c); // ascending
        StringBuilder res = new StringBuilder(s.length());
        for (int i = c.length - 1; i >= 0; i--) {
            res.append(c[i]); // append in reverse for descending order
        }
        out.println(res);
    }

    // ======================= Utility Classes & Methods =======================

    static class DSU {
        int[] p, rank, setSize;
        int numSets;
        public DSU(int N) {
            p = new int[numSets = N];
            rank = new int[N];
            setSize = new int[N];
            for (int i = 0; i < N; i++) {
                p[i] = i;
                setSize[i] = 1;
            }
        }
        public int findSet(int i) { return p[i] == i ? i : (p[i] = findSet(p[i])); }
        public boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }
        public void unionSet(int i, int j) {
            if (isSameSet(i, j)) return;
            numSets--;
            int x = findSet(i), y = findSet(j);
            if (rank[x] > rank[y]) {
                p[y] = x; setSize[x] += setSize[y];
            } else {
                p[x] = y; setSize[y] += setSize[x];
                if (rank[x] == rank[y]) rank[y]++;
            }
        }
        public int numDisjointSets() { return numSets; }
        public int sizeOfSet(int i) { return setSize[findSet(i)]; }
    }

    static long modInverse(long A, long M) {
        if (gcd(A, M) != 1) return -1;
        return power(A, M - 2, M);
    }

    static long power(long x, long y, long p) {
        long res = 1; x %= p;
        if (x == 0) return 0;
        while (y > 0) {
            if ((y & 1) != 0) res = (res * x) % p;
            y >>= 1; x = (x * x) % p;
        }
        return res % p;
    }

    static long gcd(long a, long b) { return a == 0 ? b : gcd(b % a, a); }
    static long lcm(long a, long b) { return (a / gcd(a, b)) * b; }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                if (st != null && st.hasMoreTokens()) str = st.nextToken("\n");
                else str = br.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
