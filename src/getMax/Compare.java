package getMax;

public class Compare {

    public static int flip(int n) {
        return (n ^ 1);
    }

    public static int sign(int n) {
        return flip(n >> 31 & 1);
    }

    public static int getMax(int a, int b) {
        int c = a - b;
        int asign = sign(a);
        int bsign = sign(b);
        int csign = sign(c);
        int difab = asign ^ bsign;
        int flidif = flip(difab);
        int returna = difab * asign + flidif * csign;
        int returnb = flip(returna);
        return returna * a + returnb * b;//ddd
    }


}
