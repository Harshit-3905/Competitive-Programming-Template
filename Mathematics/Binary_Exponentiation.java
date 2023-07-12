class Binary_Exponentiation {
    static int mod = 1000000007;

    static int power(int N, int R) {
        if (R == 0)
            return 1;
        int ans = power(N, R / 2);
        if ((R & 1) == 0)
            return (ans * ans) % mod;
        else
            return (((ans * ans) % mod) * N) % mod;
    }

    static int power2(int N, int R) {
        int ans = 1;
        while (R > 0) {
            if ((R & 1) == 1) {
                ans = (ans * N) % mod;
            }
            N = (int) ((1l * N * N) % mod);
            R = (R >> 1);
        }
        return ans;
    }
}