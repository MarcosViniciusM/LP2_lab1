package lp2_lab1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("teste");
		ArrayList<Pedido> listaPedido = new ArrayList<>();
		do {
			System.out.println("==========================");
			System.out.println("1 - Registrar Pedido");
			System.out.println("2 - Remover Pedido");
			System.out.println("3 - Listar Pedido");
			System.out.println("4 - Sair");
			System.out.println("==========================");
			
			int input = scanner.nextInt();
			scanner.nextLine();
		switch(input) {
		case 1:
			//inicia o wizard do pedido novo
			listaPedido.add(new Pedido());
			break;
		case 2:
			//percorre o array de pedidos com o ID dado pelo usuario
			//se encontra um pedido com o mesmo ID, o pedido é removido
			
			//seria melhor como metodo de Pedido, mas não estou acostumado
			//com as minúcias de java ainda
			System.out.println("Número do pedido que deve ser retirado?");
			
			int retirar = scanner.nextInt();
			scanner.nextLine();
			
			boolean intacto = true;
			for ( int i = 0; i < listaPedido.size();i++) {
				Pedido p = listaPedido.get(i);
				if(p.id == retirar) {
					listaPedido.remove(i);
					intacto = false;
					break;
				}
			}
			if(intacto) {
				System.out.println("O id fornecido não foi encontrado!");
			}
			else {
				System.out.println("Item retirado com sucesso.");
			}
			break;
		case 3:
			//laco for simples para mostrar os pedidos
			//normalmente eu transformaria isso numa função
			//mas o laço for do java já é bem robusto
			for (Pedido p : listaPedido) {
				p.showRecibo();
				System.out.println();
			}
			break;
		case 4:
			System.out.println("Saindo...");
			scanner.close();
			return;
			} 
		} while(true);
	}
}
