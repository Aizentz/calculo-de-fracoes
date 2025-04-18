public class App {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        Fraction a1 = new Fraction();

        int info1;

        System.out.println("Bem vindo ao calculador de frações!");
        System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("""
                    Nós podemos fazer:
                    1- Multiplicação de fração
                    2- divisão de fração
                    3- fração sob um número
                    
                    Qual das opções acima você escolhe? :
                    """);

        do {

            System.out.print("->");
            info1 = Integer.parseInt(scanner.nextLine());

        } while (info1 < 0 || info1 > 3);
        if(info1 == 1){
            System.out.print("Por favor, digite o seu numerador: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Por favor, digite o seu Denominador: ");
            int dom1 = Integer.parseInt(scanner.nextLine());
            System.out.println("X");
            System.out.print("Por favor, digite o seu numerador: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.print("Por favor, digite o seu Denominador: ");
            int dom2 = Integer.parseInt(scanner.nextLine());
            a1.fracMultiple(num1,dom1,num2,dom2);
        }else if (info1 == 2){
            System.out.print("Por favor, digite o seu numerador: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Por favor, digite o seu Denominador: ");
            int dom1 = Integer.parseInt(scanner.nextLine());
            System.out.println("/");
            System.out.print("Por favor, digite o seu numerador: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.print("Por favor, digite o seu Denominador: ");
            int dom2 = Integer.parseInt(scanner.nextLine());
            a1.fracDivision(num1, dom1, num2, dom2);
        }else{
            System.out.print("Por favor, digite o seu numerador: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Por favor, digite o seu Denominador: ");
            int dom1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Por favor, digite o número a calcular: ");
            int num = Integer.parseInt(scanner.nextLine());
            a1.fracWithNum(num, num1, dom1);


        }


    }
}
