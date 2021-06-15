package Exerc�cioCollecttions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Estoque implements Fun�oesPrograma{

	Scanner entrada = new Scanner(System.in);
	ArrayList<String> list = new ArrayList<String>();
    
	public Estoque() {
		super();
	}
	
	public void armazenarDados(String n) {
		list.add(n);
	}
	public void removerDados(String n) {
		for(int i = 0; i < list.size(); i++) {
			if(list.contains(n)) {
				list.remove(n);
			}else {
				System.out.println("Valor n�o encontrado");
			}
		}
	}
	
	public void atualizarDados(String n) {
		System.out.println("Digite o novo produto: ");
		String novo = entrada.next(); 
		if(list.contains(n)) {
			list.remove(n);
			list.add(novo);
		}else {
			System.out.println("Produto n�o existe!");
		}
	}
	
	public void ordenar() {
		Collections.sort(list);
	}
	public void imprimir() {
		System.out.println(list);
	}
	
	
	
}
