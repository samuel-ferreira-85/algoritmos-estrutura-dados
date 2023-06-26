package recursividade;

import java.math.BigInteger;

public class Fatorial2 {
    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(101);

        System.out.println(fatorial(n));
    }

    private static BigInteger fatorial(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO) <= 0) {
            return BigInteger.ONE;
        } else {
            return n.multiply(fatorial(n.subtract(BigInteger.ONE)));
        }
    }
}
