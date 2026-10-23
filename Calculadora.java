import java.util.Scanner;

public class Calculadora {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double num1;
        double num2;

        System.out.println("========================");
        System.out.println("    CALCULADORA JAVA    ");
        System.out.println("========================");

        do {
        System.out.println(" ");
        System.out.println("""
            OPERACIONES:
            1. Suma
            2. Resta
            3. Multiplicacion
            4. Division
            5. Salir
            """);

            System.out.println("Ingresa tu opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("-------------------------");
                    System.out.printf("La suma es: %.2f%n", num1 + num2);
                    System.out.println("-------------------------");
                    break;

                case 2:
                    System.out.println("Ingresa el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("-------------------------");
                    System.out.printf("La resta es: %.2f%n", num1 - num2);
                    System.out.println("-------------------------");
                    break;

                case 3:
                    System.out.println("Ingresa el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("-------------------------");
                    System.out.printf("La multiplicacion es: %.2f%n", num1 * num2);
                    System.out.println("-------------------------");
                    break;

                case 4:
                    System.out.println("Ingresa el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("-------------------------");
                    System.out.printf("La division es: %.2f%n", num1 / num2);
                    System.out.println("-------------------------");
                    break;

                case 5:
                    System.out.println("\n-----------------------------------------");
                    System.out.println("Gracias por utilizar la calculadora Java.");
                    System.out.println("-----------------------------------------");
                    break;

                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("Esa no es una opcion valida, intenta de nuevo.");
                    System.out.println("----------------------------------------------");
                    break;
            }
        } while (opcion != 5);
    }
}
