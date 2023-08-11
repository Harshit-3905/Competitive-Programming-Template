import java.util.*;
import java.io.*;

public class Solution2 {
    static int mod = 1000000007;

    public static void main(String[] args) throws java.lang.Exception {
        FastReader in = new FastReader();
        int testcase = in.nextInt();
        while (testcase-- > 0) {
            int n = in.nextInt();

        }
    }

    static Trip dfs(List<List<Integer>> list, int x, String s) {
        Trip ans = new Trip(0, 0, 0);
        if (s.charAt(x - 1) == 'B')
            ans.x += 1;
        else
            ans.y += 1;
        for (int y : list.get(x)) {
            Trip c = dfs(list, y, s);
            ans.x += c.x;
            ans.y += c.y;
            ans.z += c.z;
        }
        if (ans.x == ans.y)
            ans.z += 1;
        return ans;
    }

    // For Integer Array
    public static void safeSort(int[] a) {
        shuffle(a);
        Arrays.sort(a);
    }

    public static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    // For Long Array
    public static void safeSortl(long[] a) {
        shufflel(a);
        Arrays.sort(a);
    }

    public static void shufflel(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
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

    float nextFloat() {
        return Float.parseFloat(next());
    }

    boolean nextBoolean() {
        return Boolean.parseBoolean(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}

class Trip {
    int x;
    int y;
    int z;

    Trip(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }
}