import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite valor de x: ");
            Double x = ler.nextDouble();


            System.out.println("Digite valor de y: ");
            Double y = ler.nextDouble();

            if (x < 0 && y < 0) {
                System.out.println("3");
            }
            if (x > 0 && y > 0) {
                System.out.println("1");
            }
            if (x < 0 && y > 0) {
                System.out.println("2");
            } if(x > 0 && y < 0) {
                System.out.println("4");
            }
            System.out.println("Deseja continuar? ");
            sair = ler.nextInt();
        }
    }
}