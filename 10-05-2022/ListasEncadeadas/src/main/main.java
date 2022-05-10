package main;

import java.util.Scanner;

import Listas.*;

public class main {

	public static void main(String[] args) {
		
		ListaIntCrescente lista = new ListaIntCrescente();
		Scanner le = new Scanner(System.in);
		
		System.out.println("Informe o valor positivo para inserir ou negatio para sair");
		int valor = le.nextInt();
		
		while (valor >= 0) {
			lista.insere(valor);
			lista.show();
			System.out.println("Informe o valor positivo para inserir ou negatio para sair");
			valor = le.nextInt();
		}
		
		System.out.println("Remove?");
		valor = le.nextInt();
		while (valor >= 0) {
			lista.remove(valor);
			lista.show();
			System.out.println("Remove?");
			valor = le.nextInt();
		}
		
		le.close();
	}

}
