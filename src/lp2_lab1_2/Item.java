package lp2_lab1_2;

public class Item {
	String nome;
	double preco;
	
	public Item() {
		System.out.println("Nome do item: ");
		this.nome = Main.scanner.nextLine();
		
		System.out.println("Preco: (separe os decimais com virgula)");
		this.preco = Main.scanner.nextDouble();
		Main.scanner.nextLine();
	}
	void showItem() {
		System.out.println("- " + nome + " R$ " + preco);
	}
}
