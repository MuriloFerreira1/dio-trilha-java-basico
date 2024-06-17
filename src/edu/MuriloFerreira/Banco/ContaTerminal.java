package edu.MuriloFerreira.Banco;

import java.util.Scanner;

public class ContaTerminal {
	private static final Scanner SCAN = new Scanner(System.in);
	private static int numero;
	private static String agencia;
	private static String nomeCliente;
	private static float saldo;
	
	public static void main(String[] args) {
		System.out.println("Por favor, insira o número da agência: ");
		numero = SCAN.nextInt();
		System.out.println("Por favor, insira a agência: ");
		agencia = SCAN.next();
		System.out.println("Por favor, insira seu nome: "); 
		nomeCliente = SCAN.next();
		System.out.println("Por favor, insira o saldo da conta: ");
		saldo = SCAN.nextFloat();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
	}
}
