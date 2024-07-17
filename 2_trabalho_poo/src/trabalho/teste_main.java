package trabalho;
import java.util.*;

public class teste_main {

	public static void main(String[] args) {
		Item cc[] = new Item[5];
		Scanner ler = new Scanner(System.in);
		
		  	cc[0] = new RoupaPMG("Camisa", 80, 93, 33, 30, 40);
	        cc[1] = new RoupaTamanhoUnico("Saia", 31, 20, 40);
	        cc[2] = new Acessório("Cinto", 40, 18, 25);
	        cc[3] = new Acessório("Pulseira", 20, 10, 30);
	        cc[4] = new RoupaTamanhoUnico("Saída de praia", 80, 40, 50);
		
		int opc = 0;

		while(opc != 6) {
			  System.out.println("Escolha uma opção:");
	          System.out.println("1 – Camisa");
	          System.out.println("2 – Saia");
	          System.out.println("3 – Cinto");
	          System.out.println("4 – Pulseira");
	          System.out.println("5 – Saída de praia");
	          System.out.println("6 – Sair do sistema");
	          
	          opc = ler.nextInt();     
	          
	          switch(opc) {
	          case 1:
	        	  System.out.println("Tamanho desejado: ");
	                System.out.println("1- P: ");
	                System.out.println("2- M: ");
	                System.out.println("3- G: ");
	                int tamanho = ler.nextInt();
	        	  
	        	  try {
	        	  cc[0].venda(tamanho);
	        	  } catch(QuantInvalidoException | TamanhoInvalidoException e) {
	        		  System.out.println(e.getMessage());
	        	  }
	        	 
	        	  cc[0].reposicao_estoque();
	        	  
	        	  System.out.println(cc[0].toString());
	        	  
	        	  break;
	        	  
	          case 2:
	        	  int venda0 = 1;
              	try {
              		cc[1].venda(venda0);
              	} catch(QuantInvalidoException e) {
              		System.out.println(e.getMessage());
              	}
              	
              	
    	        cc[1].reposicao_estoque();
    	        	  
              	System.out.println(cc[1].toString());
              	
              	break;
              	
	          case 3:
	        	  
	        	  System.out.println("Digite a quantidade: ");
              	int venda1 = ler.nextInt();
              	try {
              		cc[2].venda(venda1);
              	}catch(QuantInvalidoException e){
              		System.out.println(e.getMessage());
              	}
              	
              	
    	         cc[2].reposicao_estoque();
    	        	 
              	System.out.println(cc[2].toString());
              	
              	break;
              	
	          case 4:
	        	  System.out.println("Digite a quantidade: ");
	              	int venda2 = ler.nextInt();
	              	try {
	              		cc[3].venda(venda2);
	              	}catch(QuantInvalidoException e){
	              		System.out.println(e.getMessage());
	              	}
	              	
	              	
	    	        cc[3].reposicao_estoque();
	    	        	  
	              	System.out.println(cc[3].toString());
	              	
	              	break;
	              	
	          case 5:
	        	  int venda3 = 1;
	              	try {
	              		cc[4].venda(venda3);
	              	} catch(QuantInvalidoException e) {
	              		System.out.println(e.getMessage());
	              	}
	              	
	              	
	    	        cc[4].reposicao_estoque();
	    	        	 
	              	System.out.println(cc[4].toString());
	              	
	              	break;
	              	
	          case 6:
	        	  System.out.println("Saindo do sistema...");
	        	  break;
	        	  
	          default:
	        	  System.out.println("Digite a opção correta:");
		          }  
	                
	            }
		}
	}
	
	


