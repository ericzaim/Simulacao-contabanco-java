package edu.eric.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public int Numero;
    public String Agencia,NomeCliente;
    public double Saldo;

    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Numero: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite seu Nome: ");
        String NomeCliente= scanner.next();

        System.out.println("Digite sua Agência: ");
        String Agencia = scanner.next();

        System.out.println("Digite seu Saldo: ");
        double Saldo = scanner.nextDouble();
       
            System.out.println("Olá"+ NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
        
}
}
