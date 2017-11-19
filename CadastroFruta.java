import java.util.Scanner;
import java.util.ArrayList;

public class CadastroFruta {
	public static void main(String[] args) {

    // Vari�veis
    int opcao, cont;
    
    // Objeto
    Fruta fruta = new Fruta();

    // ArrayList
    ArrayList<Fruta> vetor = new ArrayList<Fruta>();

    // Scanner
    Scanner ler = new Scanner(System.in);

    // La�o e Menu
    do{
    	System.out.println("CADASTRO DE FRUTA");
       	System.out.println("---------------------------------");
       	System.out.println("1) Cadastrar uma fruta\n" +
						   "2) Alterar todos os dados pelo c�digo\n" +
						   "3) Pesquisar uma fruta pelo nome ou c�digo\n" +
						   "4) Pesquisar m�dia de pre�o pela �poca\n" +
						   "5) Mostrar fruta mais cara\n" +
						   "6) Mostrar todas as frutas de uma determinada �poca\n" +
						   "7) Sair\n"+
						   "Escolha uma op��o: ");
		opcao = ler.nextInt();
		System.out.println("---------------------------------");

		switch(opcao){
			case 1:
				// 1) Cadastrar uma fruta
				fruta.cadastrar(vetor);
				break;
			case 2:
				// 2) Alterar todos os dados pelo c�digo
				fruta.alterar(vetor);
				break;
			case 3:
				// 3) Pesquisar uma fruta pelo nome ou c�digo
				fruta.pesquisar(vetor);
				break;
			case 4:
				// 4) Pesquisar m�dia de pre�o das frutas pela �poca
				fruta.media(vetor);
				break;
			case 5:
				// 5) Mostrar fruta mais cara
				fruta.maior(vetor);
				break;
			case 6:
				// 6) Mostrar todas as frutas de uma determinada �poca
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
				System.out.println("Op��o inv�lida!");
			}
		} while(opcao != 7);
   	}
}
