package ex;

public class PerecheNumere {
    private int intreg1;
    private int intreg2;

    public PerecheNumere(int intreg1, int intreg2) {
        this.intreg1 = intreg1;
        this.intreg2 = intreg2;
    }

    public int getIntreg1() {
        return intreg1;
    }

    public void setIntreg1(int intreg1) {
        this.intreg1 = intreg1;
    }

    public int getIntreg2() {
        return intreg2;
    }

    public void setIntreg2(int intreg2) {
        this.intreg2 = intreg2;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "numar1=" + intreg1 +
                ", intreg2=" + intreg2 +
                '}';
    }

    public static void main(String[] args) {
        PerecheNumere pereche = new PerecheNumere(5, 10);
        System.out.println(pereche); // Va apela metoda toString implicit
    }

    public boolean suntConsecutiveInFibonacci() {
        if (intreg1 <= 0 || intreg2 <= 0) {
            return false;
        }
        int a = 0, b = 1;
        while (b < intreg2) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == intreg2;
    }

    public int celMicMultipluComun() {
        // Utilizați algoritmul lui Euclid pentru calculul CMMDC (cel mai mare divizor comun).
        int a = intreg1;
        int b = intreg2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // CMMDC * CMMC = a * b
        return (intreg1 * intreg2) / a;
    }

    public boolean auSumaCifrelorEgala() {
        return sumaCifrelor(intreg1) == sumaCifrelor(intreg2);
    }

    private int sumaCifrelor(int numarIntreg) {
        int suma = 0;
        while (numarIntreg != 0) {
            suma += numarIntreg % 10;
            numarIntreg = numarIntreg / 10;
        }
        return suma;
    }


    public boolean auAcelasiNumarCifrePare() {
        return numarCifrePare(intreg1) == numarCifrePare(intreg2);
    }

    private int numarCifrePare(int număr) {
        int count = 0;
        while (număr != 0) {
            int cifră = număr % 10;
            if (cifră % 2 == 0) {
                count++;
            }
            număr /= 10;
        }
        return count;
    }
}
