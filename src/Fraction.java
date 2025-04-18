public class Fraction {

    private int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    void fracMultiple(int a, int b, int c, int d) {
        if (a > 0 && b > 0 && c > 0 && d > 0) {
            int num = a * c;
            int dom = b * d;
            int mdc = mdc(num, dom);
            num /= mdc;
            dom /= mdc;
            System.out.println("O resultado é: " + num + "/" + dom);
        } else {
            System.out.println("Valor inválido!");
        }
    }


    void fracDivision(int a, int b, int c, int d) {
        if (a > 0 && b > 0 && c > 0 && d > 0) {
            int num = a * d;
            int dom = b * c;
            int mdc = mdc(num, dom);
            num /= mdc;
            dom /= mdc;
            System.out.println("O resultado é: " + num + "/" + dom);
        } else {
            System.out.println("Valor inválido!");
        }
    }


    void fracWithNum(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            double result = a * (b / (double) c);
            System.out.printf("O resultado é: %.2f\n", result);
        } else {
            System.out.println("Valor inválido!");
        }
    }
}

