import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Shuffle_hashing {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        in.nextLine(); 
        while (t-- > 0) {
            String p = in.nextLine();
            String h = in.nextLine();
            if (h.length() < p.length()) {
                out.println("NO");
                continue;
            }
            Map<Character, Integer> pCount = new HashMap<>();
            for (char c : p.toCharArray()) {
                pCount.put(c, pCount.getOrDefault(c, 0) + 1);
            }
            Map<Character, Integer> hCount = new HashMap<>();
            for (char c : h.toCharArray()) {
                hCount.put(c, hCount.getOrDefault(c, 0) + 1);
            }
            boolean possible = true;
            for (char c : pCount.keySet()) {
                if (hCount.getOrDefault(c, 0) < pCount.get(c)) {
                    possible = false;
                    break;
                }
            }
            if (!possible) {
                out.println("NO");
                continue;
            }
            int lenP = p.length();
            Map<Character, Integer> windowCount = new HashMap<>();
            for (int i = 0; i < lenP; i++) {
                char c = h.charAt(i);
                windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);
            }
            if (windowCount.equals(pCount)) {
                out.println("YES");
                continue;
            }
            boolean found = false;
            for (int i = lenP; i < h.length(); i++) {
                char leftChar = h.charAt(i - lenP);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                if (windowCount.get(leftChar) == 0) {
                    windowCount.remove(leftChar);
                }
                char newChar = h.charAt(i);
                windowCount.put(newChar, windowCount.getOrDefault(newChar, 0) + 1);
                if (windowCount.equals(pCount)) {
                    found = true;
                    break;
                }
            }
            out.println(found ? "YES" : "NO");
        }
        out.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
