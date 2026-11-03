import java.util.Scanner;

public class Final {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double n4;

        System.out.println("Digite o valolr da primeira nota: ");
        n1 = input.nextDouble();

        System.out.println("Digite o valolr da segunda nota: ");
        n2 = input.nextDouble();

        System.out.println("Digite o valolr da terceira nota: ");
        n3 = input.nextDouble();

        System.out.println("Digite o valolr da quarta nota: ");
        n4 = input.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if(media >= 7) {
            System.out.println("Sua nota é: "+ media+ (" você está aprovado"));
        } else if (media >=5 && media < 7) {
            System.out.println("Sua nota é: "+ media+ (" você está de recuperação"));
        } else if (media < 5) {
            System.out.println("Sua nota é: "+ media+ (" você está reprovado"));
        }
    }
}
