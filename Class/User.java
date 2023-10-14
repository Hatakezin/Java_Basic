import java.util.Scanner;

public class User{
    public static void main(String[] args){
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano do seu carro: ");
        carro.ano(scanner.nextInt());
        System.out.print("Digite a marca do seu carro: ");
        carro.marca(scanner.next());
        System.out.print("Digite o preço do seu carro (Há taxa): ");
        carro.preço(scanner.nextInt());
        scanner.close();
        carro.valores();
    }
}