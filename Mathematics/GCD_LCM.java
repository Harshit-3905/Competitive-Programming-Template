class GCD_LCM {
    // For Integer Values
    static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // For Long Values
    static long gcdl(long a, long b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            return b;
        return gcdl(b % a, a);
    }

    static long lcml(long a, long b) {
        return (a / gcdl(a, b)) * b;
    }

}
