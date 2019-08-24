package main;

import java.util.Scanner;

import banco.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		double saqui=0;
		System.out.print("informe o numero da conta");
		int nconta = sc.nextInt();
		System.out.print("informe o nome do titular");
		String name = sc.next();
		System.out.print("deposito inicial ? (s/n)");
		String deci = sc.next();
		if (deci.equals("s")) {
			System.out.println("informe o deposito incial");
			double saldo = sc.nextDouble();
			 Conta c1 = new Conta(nconta, name, saldo,saqui);
			System.out.print("informacoes da conta");
			System.out.println("conta:" + nconta + "," +"name:"+name+","+"saldo:"+saldo);}
		else if  (deci.equals("n"))
		System.out.print("informe um valor de deposito:");
		double saldo =sc.nextDouble();
		System.out.println("valor atualizado");
		System.out.println("conta:" + nconta +","+"name:"+name+","+"saldo:"+saldo);
		System.out.print("deseja sacar? (s/n)");
		String deci2=sc.next();
		if (deci2.equals("s")) {
			System.out.println("informe o valor:");
			saqui=sc.nextDouble();
			Conta c1 = new Conta(nconta, name, saldo,saqui);
			c1.saque();
			System.out.println("conta:" + nconta +","+"name:"+name+","+"saldo:"+c1.saque());
		}
		else
			sc.close();
	}
}
