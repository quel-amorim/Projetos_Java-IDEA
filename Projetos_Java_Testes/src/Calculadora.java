import java.util.Scanner;
public class Calculadora {

    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Cadastre um número (inteiro ou com virgula) : ");
        float num1 = scanner.nextFloat();
        System.out.println("Cadastre outro número (inteiro ou com virgula) : ");
        float num2 = scanner.nextFloat();
        System.out.println("Tipo de operação :\n[1]Somar\n[2]Subtrair\n[3]Divisão\n[4]Multiplicar\n[5]Todas operações\n[0]Sair\nEscolha : ");

        int operacao = scanner.nextInt();
        switch(operacao){
            case 1 :
                System.out.println(num1 + " + " + num2 +  " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 +  " = " + (num1 - num2));
                break;
            case 3:
                if (num2 != 0){
                    System.out.println(num1 + " / " + num2 +  " = " + (num1 / num2));
                }else{
                    System.out.println("Divisão por zero! ");
                }
                break;
            case 4:
                System.out.println(num1 + " x " + num2 +  " = " + (num1 * num2));
                break;
            case 5:
                System.out.println(num1 + " + " + num2 +  " = " + (num1 + num2));
                System.out.println(num1 + " - " + num2 +  " = " + (num1 - num2));
                if (num2 != 0){
                    System.out.println(num1 + " / " + num2 +  " = " + (num1 / num2));
                }else{
                    System.out.println("Divisão por zero! ");
                }
                System.out.println(num1 + " x " + num2 +  " = " + (num1 * num2));
                break;
            default:
                System.out.println("Desconhecido ");
        }
        scanner.close();
    }
}
