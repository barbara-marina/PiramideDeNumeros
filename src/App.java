import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numero = new Scanner(System.in);
        System.out.println("Insira o número de degraus desejado para a sua pirâmide: ");
        int degraus = numero.nextInt();
        System.out.println();

        for (int i = 1; i <= degraus; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
