import java.util.*;
import java.io.*;

public class Solution {
    static int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
        int testcase = Integer.parseInt(br.readLine());
        for(int i=1;i<=testcase;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            
        }
        pw.flush();
        pw.close();
        br.close();
    }

    public static long sqrt(long x) {
        long l = 0;
        long h = (long) (3e9);
        long ans = 0;
        while (l <= h) {
            long mid = l + (h - l) / 2;
            if (mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
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
class Pair {
    int x;
    int y;

    Pair(int a, int b) {
        x = a;
        y = b;
    }
}