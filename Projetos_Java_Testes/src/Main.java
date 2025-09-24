import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome completo : ");
        String nome = scanner.nextLine();
        System.out.println("Idade ? ");
        int idade = scanner.nextInt();

        System.out.printf("INFORMAÇÃO COMPLETA : %s %d anos" , nome , idade);
    }
}