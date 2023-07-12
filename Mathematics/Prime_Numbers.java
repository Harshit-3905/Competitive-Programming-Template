class Prime_Numbers {

    boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void sieve(int n, boolean p[]) {
        for (int i = 0; i <= n; i++)
            p[i] = true;
        p[1] = false;
        for (int j = 2; j * j <= n; j++) {
            if (p[j] == true) {
                for (int i = j * j; i <= n; i += j)
                    p[i] = false;
            }
        }
    }
}
