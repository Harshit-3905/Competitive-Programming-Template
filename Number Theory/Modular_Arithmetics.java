class Modular_Arithmetics {
    static int mod = 1000000007;

    static int add(int a, int b) {
        return (a + b) % mod;
    }

    static int sub(int a, int b) {
        return ((a - b) % mod + mod) % mod;
    }

    static int mul(int a, int b) {
        return (a * b) % mod;
    }

    static int exp(int base, int exp) {
        if (exp == 0)
            return 1;
        int half = exp(base, exp / 2);
        if (exp % 2 == 0)
            return mul(half, half);
        return mul(half, mul(half, base));
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long sub(long a, long b) {
        return ((a - b) % mod + mod) % mod;
    }

    static long mul(long a, long b) {
        return (a * b) % mod;
    }

    static long exp(long base, long exp) {
        if (exp == 0)
            return 1;
        long half = exp(base, exp / 2);
        if (exp % 2 == 0)
            return mul(half, half);
        return mul(half, mul(half, base));
    }
}
