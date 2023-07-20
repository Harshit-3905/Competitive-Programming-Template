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

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long sub(long a, long b) {
        return ((a - b) % mod + mod) % mod;
    }

    static long mul(long a, long b) {
        return (a * b) % mod;
    }
}
