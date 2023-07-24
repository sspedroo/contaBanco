package org.Pedro.domain;

import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cmd = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta1 = new ContaTerminal();

        System.out.println("Seja bem vindo ao Banco DIO");
        System.out.println("Por favor digite o numero de sua conta: ");
        conta1.setNumero(cmd.nextInt());

        System.out.println("Agora digite sua agencia: ");
        conta1.setAgencia(cmd.next());

        System.out.println("Digite seu nome: ");
        conta1.setNome(cmd.next());

        System.out.println("Olá " + conta1.getNome() + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                conta1.getAgencia() + ", conta " + conta1.getNumero() + " e seu saldo R$: " + conta1.getSaldo() + " já está" +
                " disponivel pra saque.");
    }
}
