import java.util.Scanner;

public class Patrones {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digita un numero entero positivo:");
        int n = scan.nextInt();

        System.out.println("Selecciona un patron:");
        System.out.println("1. Triangulo delimitado");
        System.out.println("2. Piramide de asteriscos");
        System.out.println("3. Rombo de asteriscos");
        System.out.println("4. Piramide numerica simetrica");

        int resp = scan.nextInt();

        if(resp == 1){

            for(int i = 1; i <= n; i++){

                System.out.print("1");

                for(int j = 1; j <= i - 1; j++){
                    System.out.print(" *");
                }

                if(i > 1){
                    System.out.print(" 1");
                }

                System.out.println();
            }
        }

        if(resp == 2){

            for(int i = 1; i <= n; i++){

                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }

                System.out.println();
            }
        }

        if(resp == 3){

            for(int i = 1; i <= n; i++){

                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }

                System.out.println();
            }

            for(int i = n - 1; i >= 1; i--){

                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }

                System.out.println();
            }
        }

        if(resp == 4){

            for(int i = 1; i <= n; i++){

                for(int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }

                for(int j = i - 1; j >= 1; j--){
                    System.out.print(j + " ");
                }

                System.out.println();
            }
        }
    }
}
