import java.util.Scanner;
import java.util.ArrayList;

public class Fruta {

	// Vari�veis
	private String codigoFruta, nomeFruta, dataFruta, epocaFruta;
	private float valUniFruta, pesoUniFruta;
	int cont;
	
	// Scanner
    Scanner ler = new Scanner(System.in);
    
    public Fruta(String codigoFruta, String nomeFruta, String dataFruta, String epocaFruta, float valUniFruta, float pesoUniFruta) {
    	this.codigoFruta = codigoFruta;
    	this.nomeFruta  = nomeFruta;
    	this.dataFruta  = dataFruta;
    	this.epocaFruta =  epocaFruta;
    	this.valUniFruta = valUniFruta;
    	this.pesoUniFruta = pesoUniFruta;
    }
    
    public Fruta() {
    	this("", "", "", "", 0f, 0f);
    }
    
    public void setCodigoFruta(String codigoFruta) {
		this.codigoFruta = codigoFruta;    	
    }
    
    public String getCodigoFruta() {
		return this.codigoFruta;    	
    }
    
    public void setNomeFruta(String nomeFruta) {
		this.nomeFruta = nomeFruta;    	
    }
    
    public String getNomeFruta() {
		return this.nomeFruta;    	
    }
    
    public void setEpocaFruta(String epocaFruta) {
		this.epocaFruta = epocaFruta;    	
    }
    
    public String getEpocaFruta() {
		return this.epocaFruta;    	
    }
    
    public void setDataFruta(String dataFruta) {
		this.dataFruta = dataFruta;    	
    }
    
    public String getDataFruta() {
		return this.dataFruta;    	
    }
    
     public void setValUniFruta(float valUniFruta) {
		this.valUniFruta = valUniFruta;    	
    }
    
    public float getValUniFruta() {
		return this.valUniFruta;    	
    }
    
    public void setPesoUniFruta(float pesoUniFruta) {
		this.pesoUniFruta = pesoUniFruta;    	
    }
    
    public float getPesoUniFruta() {
		return this.pesoUniFruta;    	
    }
    
    public void print() {
    	System.out.println("---------------------------------");
    	System.out.println("C�digo da fruta: " + getCodigoFruta());
    	System.out.println("Nome da fruta: " + getNomeFruta());
    	System.out.println("Data cadastrada: " + getDataFruta());
    	System.out.println("�poca de comercializa��o da fruta: " + getEpocaFruta());
    	System.out.println("Valor unit�rio da fruta: " + getValUniFruta());
    	System.out.println("Peso unit�rio da fruta: " + getPesoUniFruta());
    	System.out.println("----------------------------------");
    }
    
    // Para teste
    public void teste(ArrayList<Fruta> vetor){
		for(int i=0; i<vetor.size(); i++) {
    		System.out.println("C�digo da fruta: " + vetor.get(i).getCodigoFruta());
		   	System.out.println("Nome da fruta: " + vetor.get(i).getNomeFruta());
		   	System.out.println("Data: " + vetor.get(i).getDataFruta());
		   	System.out.println("�poca de comercializa��o da fruta: " + vetor.get(i).getEpocaFruta());
		   	System.out.println("Valor unit�rio da fruta: " + vetor.get(i).getValUniFruta());
		   	System.out.println("Peso unit�rio da fruta: " + vetor.get(i).getPesoUniFruta());
		   	System.out.println("----------------------------------");
		}
    }
    
    // 1) Cadastrar uma fruta
    public void cadastrar(ArrayList<Fruta> vetor) {
    	System.out.println("Digite o c�digo da fruta ");
		setCodigoFruta(ler.nextLine());
		System.out.println("Digite o nome da fruta ");
		setNomeFruta(ler.nextLine());
		System.out.println("Digite a data ");
		setDataFruta(ler.nextLine());
		System.out.println("Digite a �poca de comercializa��o da fruta ");
		setEpocaFruta(ler.nextLine());
		System.out.println("Digite o valor unit�rio da fruta ");
		setValUniFruta(ler.nextFloat());
		System.out.println("Digite o peso unit�rio da fruta ");
		setPesoUniFruta(ler.nextFloat());
		vetor.add(new Fruta(getCodigoFruta(), getNomeFruta(), getDataFruta(), getEpocaFruta(), getValUniFruta(), getPesoUniFruta()));
		System.out.println("------------------------------");
		System.out.println("Fruta cadastrada com sucesso !");
		System.out.println("------------------------------");
    }
    
    // 2) Alterar todos os dados pelo c�digo
    public void alterar(ArrayList<Fruta> vetor){
    	if(vetor.size() != 0) {
			cont = 0;
			System.out.println("Qual o c�digo da fruta que deseja alterar");
	      	codigoFruta = ler.nextLine();
	      	for (int i=0; i<vetor.size(); i++) {
	      		Fruta aux = vetor.get(i);
	      		if(codigoFruta.equals(aux.getCodigoFruta())) {
		      		System.out.println("Digite o novo nome da fruta ");
					nomeFruta = ler.nextLine();
					vetor.get(i).setNomeFruta(nomeFruta);
					System.out.println("Digite a nova data ");
					dataFruta = ler.nextLine();
					vetor.get(i).setDataFruta(dataFruta);
					System.out.println("Digite a nova �poca de comercializa��o da fruta ");
					epocaFruta = ler.nextLine();
					vetor.get(i).setEpocaFruta(epocaFruta);
					System.out.println("Digite o novo valor unit�rio da fruta ");
					valUniFruta = ler.nextFloat();
					vetor.get(i).setValUniFruta(valUniFruta);
					System.out.println("Digite o novo peso da fruta ");
					pesoUniFruta = ler.nextFloat();
					vetor.get(i).setPesoUniFruta(pesoUniFruta);
					cont++;
	      		}
	      	}
	      	if(cont != 0) {
	      		System.out.println("Conclu�do com Sucesso !!!");
	      	} else {
	      		System.out.println("---------------------------------");
	      		System.out.println("Nenhum registro de fruta encontrado !");
	      		System.out.println("---------------------------------");
	      	}
      	} else {
	      	System.out.println("ERRO! Primeiro cadastre uma fruta");
	      	System.out.println("---------------------------------");
      	}
    }
    
    // 3) Pesquisar uma fruta pelo nome ou c�digo
    public void pesquisar(ArrayList<Fruta> vetor){
		if(vetor.size() != 0) {
			String pesquisa;
			cont = 0;
			System.out.println("Digite o nome ou c�digo da fruta que deseja pesquisar");
	      	pesquisa = ler.nextLine();
  			for(int i=0; i<vetor.size(); i++) {
	   			Fruta aux = vetor.get(i);
	     		if(pesquisa.equals(aux.getNomeFruta()) || pesquisa.equals(aux.getCodigoFruta())){
					aux.print();
					cont++;
				}
	    	}
	    	if(cont != 0) {
	    		System.out.println("Conclu�do com Sucesso !!!");
	    	} else {
	    		System.out.println("---------------------------------");
	    		System.out.println("Nenhum registro de fruta encontrado !");
	    		System.out.println("---------------------------------");
	    	}
      	} else {
		System.out.println("ERRO! Primeiro cadastre uma fruta");
	   	System.out.println("---------------------------------");
   		}
	}
	
	// 4) Pesquisar m�dia de pre�o das frutas pela �poca
	public void media(ArrayList<Fruta> vetor){
		if(vetor.size() != 0) {
			float valorFinal;
			int div;
			div = 0;
			valorFinal = 0f;
		
			System.out.println("Digite a �poca da fruta");
			epocaFruta = ler.nextLine();
			System.out.println("----------------------------");
	    	for(int i=0; i<vetor.size(); i++){
	    		Fruta aux = vetor.get(i);
	    		if(epocaFruta.equals(aux.getEpocaFruta())){
	      		    valorFinal += aux.getValUniFruta();
	      		    div++;
   				}
			}
			if(div != 0) {
				float media = valorFinal / div;
				System.out.println("M�dia de valores na �poca de " + epocaFruta + " � R$ " + media);
				System.out.println("");
				System.out.println("Conclu�do com Sucesso !!!");
			} else {
				System.out.println("---------------------------------");
				System.out.println("Nenhum registro de fruta encontrado !");
				System.out.println("---------------------------------");
			}
   		} else {
			System.out.println("ERRO! Primeiro cadastre uma fruta");
			System.out.println("---------------------------------");
		}  		
	}
	
	// 5) Mostrar fruta mais cara
	public void maior(ArrayList<Fruta> vetor){
		if(vetor.size() != 0) {
			float frutaCara = 0f;
			int mostraFruta = 0;
			System.out.println("Localizando a fruta mais cara...");
			for(int i=0; i<vetor.size(); i++) {
				Fruta aux = vetor.get(i);
				if(aux.getValUniFruta() > frutaCara) {
					frutaCara = aux.getValUniFruta();
					mostraFruta = i;
				}
			}
			System.out.println("C�digo da fruta: " + vetor.get(mostraFruta).getCodigoFruta());
			System.out.println("A fruta mais cara � " + vetor.get(mostraFruta).getNomeFruta());
			System.out.println("Data: " + vetor.get(mostraFruta).getDataFruta());
			System.out.println("�poca de comercializa��o da fruta: " + vetor.get(mostraFruta).getEpocaFruta());
			System.out.println("Valor unit�rio da fruta: " + vetor.get(mostraFruta).getValUniFruta());
			System.out.println("Peso unit�rio da fruta: " + vetor.get(mostraFruta).getPesoUniFruta());
			System.out.println("----------------------------------");
   			} else {
  				System.out.println("ERRO! Primeiro cadastre uma fruta");
   				System.out.println("---------------------------------");
		}
	}
	
	// 6) Mostrar todas as frutas de uma determinada �poca
	public void epoca(ArrayList<Fruta> vetor){
		if(vetor.size() != 0) {
			cont = 0;
			System.out.println("Informe uma �poca para a consulta:");
			epocaFruta = ler.nextLine();
			System.out.println("----------------------------");
			System.out.println("A(s) fruta(s) da �poca de " + epocaFruta + ":");
			for(int i=0; i<vetor.size(); i++) {
	   			Fruta aux = vetor.get(i);
	   			if(epocaFruta.equals(aux.getEpocaFruta())){
					nomeFruta = aux.getNomeFruta();
					System.out.println("- " + nomeFruta);
					cont++;
				}
			}
			if(cont != 0) {
				System.out.println("Conclu�do com Sucesso !!!");
			} else {
				System.out.println("---------------------------------");
				System.out.println("Nenhum registro de fruta encontrado !");
				System.out.println("---------------------------------");
			}
		} else {
			System.out.println("ERRO! Primeiro cadastre uma fruta");
			System.out.println("---------------------------------");
		}
	}
}