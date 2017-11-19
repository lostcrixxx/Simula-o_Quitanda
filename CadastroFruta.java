import java.util.Scanner;
import java.util.ArrayList;

public class CadastroFruta {
	public static void main(String[] args) {

    // Variáveis
    int opcao, cont;
    
    // Objeto
    Fruta fruta = new Fruta();

    // ArrayList
    ArrayList<Fruta> vetor = new ArrayList<Fruta>();

    // Scanner
    Scanner ler = new Scanner(System.in);

    // Laço e Menu
    do{
    	System.out.println("CADASTRO DE FRUTA");
       	System.out.println("---------------------------------");
       	System.out.println("1) Cadastrar uma fruta\n" +
						   "2) Alterar todos os dados pelo código\n" +
						   "3) Pesquisar uma fruta pelo nome ou código\n" +
						   "4) Pesquisar média de preço pela época\n" +
						   "5) Mostrar fruta mais cara\n" +
						   "6) Mostrar todas as frutas de uma determinada época\n" +
						   "7) Sair\n"+
						   "Escolha uma opção: ");
		opcao = ler.nextInt();
		System.out.println("---------------------------------");

		switch(opcao){
			case 1:
				// 1) Cadastrar uma fruta
				fruta.cadastrar(vetor);
				break;
			case 2:
				// 2) Alterar todos os dados pelo código
				fruta.alterar(vetor);
				break;
			case 3:
				// 3) Pesquisar uma fruta pelo nome ou código
				fruta.pesquisar(vetor);
				break;
			case 4:
				// 4) Pesquisar média de preço das frutas pela época
				fruta.media(vetor);
				break;
			case 5:
				// 5) Mostrar fruta mais cara
				fruta.maior(vetor);
				break;
			case 6:
				// 6) Mostrar todas as frutas de uma determinada época
				fruta.epoca(vetor);
				break;
			case 7:
				// Sair
				break;
			case 0:
				// Para teste
				fruta.teste(vetor);
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while(opcao != 7);
   	}
}
