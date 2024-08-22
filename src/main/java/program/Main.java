package main.java.program;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n1 = 0;
        float n2 = 0;

        var result = 0F;

        String opString = "";
        String operation = "";

        try {
            Operations operations = new Operations();
            while(true) {
                while (true) {
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextInt();

                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Digite a operação (Soma/Multiplicação/Divisão/Subtração/Resto/Par): ");
                    opString = scanner.nextLine();

                    if (opString != null) {
                        if (opString.equalsIgnoreCase("Soma")) {
                            result = Operations.Somar(n1, n2);
                            operation = "Soma";
                            break;
                        }else if(opString.equalsIgnoreCase("Multiplicação")){
                            result = Operations.Multiplicacao(n1, n2);
                            operation = "Multiplicação";
                        }
                        else if (opString.equalsIgnoreCase("Divisão")) {
                            if (n2 == 0) {
                                System.out.println("Divisão por 0 não é permitido!");
                                continue;
                            }
                            result = Operations.Dividir(n1, n2);
                            operation = "Divisão";
                            break;
                        } else if (opString.equalsIgnoreCase("Subtração")) {
                            result = Operations.Subtracao(n1, n2);
                            operation = "Subtração";
                            break;
                        }else if(opString.equalsIgnoreCase("Resto")){
                            result = Operations.RestoDivisao(n1, n2);
                            operation = "Resto da Divisão";
                            break;
                        }else if(opString.equalsIgnoreCase("Par")){
                            boolean isPar = Operations.isPar(n1, n2);
                            result = Operations.Somar(n1, n2);
                            if(isPar){System.out.println("A somatoria " + result + " é Par!");}
                            else{System.out.println("A somatoria " + result + " é Impar!");}
                        }
                        else {
                            System.out.println("Não entendi, pode repetir? ");
                        }
                    }else {
                        System.out.println("Insira um valor valido!");
                    }
                }

                System.out.println("O resultado da operação " + operation + " foi: " + result);

                System.out.print("Quer fazer mais alguma operação(S/N)? ");
                String msg = scanner.nextLine();

                if (msg.equalsIgnoreCase("S")) {
                    System.out.println("-------- Nova Operação --------");
                }else{
                    System.out.println("Fim do Programa!");
                    break;
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            scanner.next();
        } catch (Exception e) {
            System.out.println("Algo deu errado: " + e.getMessage());
        }
    }
}
