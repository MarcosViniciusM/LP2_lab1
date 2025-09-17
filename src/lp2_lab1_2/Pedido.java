package lp2_lab1_2;

import java.util.ArrayList;

public class Pedido {
	String cliente;
	int id;
	ArrayList<Item> listaItem;
	
	//normalmente isso seria uma funcao, mas nao sei como funciona em java
	//dificil traduzir meus macetes de c++ ...
	static int getID = 1;
	
	
	public Pedido() {
		this.id = getID++;
		listaItem = new ArrayList<Item>();
		System.out.println("Nome do cliente: ");
		this.cliente = Main.scanner.nextLine();
		int input = 1;
		//construtor do pedido já inclui o menu de criação
		do {
			//construtor do item deve iniciar o proprio menu de criação
			listaItem.add(new Item());
			System.out.println("Criar outro item?");
			System.out.println("1 - Sim");
			System.out.println("2 - Nao");
			input = Main.scanner.nextInt();
			Main.scanner.nextLine();
		} while(input != 2);
		showRecibo();
		System.out.println("========================================"); 
		System.out.println("   Obrigado pela preferência! :)    "); 
		System.out.println("========================================\n");
	}
	
	void showRecibo() {
		System.out.println("----------------------------------------");
		System.out.println("Pedido Nº: " + id);
		System.out.println("Cliente: " + cliente);
		System.out.println("----------------------------------------");
		System.out.println("Itens:");
		double precoTotal=0;
		for (Item i : listaItem) {
			i.showItem();
			precoTotal+=i.preco;
		}
		System.out.println("----------------------------------------"); 
		System.out.println("Total: R$ " + precoTotal);
	}
}
