package dioTrilhaJavaBasico.contaBanco.src;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo");
        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agora, digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                ", conta "+ numero +
                " e seu saldo "+ saldo +
                " já está disponível para saque");


    }
}