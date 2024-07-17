package trabalho;
public class RoupaPMG implements Item {
	private String descricao;
	private int quant_p;
	private int quant_m;
	private int quant_g;
	private int estoque_min;
	private int estoque_max;
	
	public RoupaPMG(String descricao, int quant_p, int quant_m, int quant_g, int estoque_min, int estoque_max) {
		this.descricao = descricao;
		this.quant_p = quant_p;
		this.quant_m = quant_m;
		this.quant_g = quant_g;
		this.estoque_min = estoque_min;
		this.estoque_max = estoque_max;
	}
	@Override
	public void venda(int tamanho) {
	    if (tamanho == 1) {
	        if (getQuant_p() > 0) {
	        	System.out.println("Venda concluída");
	            setQuant_p(getQuant_p() - 1);
	        }
	    } else if (tamanho == 2) {
	        if (getQuant_m() > 0) {
	        	System.out.println("Venda concluída");
	            setQuant_m(getQuant_m() - 1);
	        } 
	    } else if (tamanho == 3) {
	        if (getQuant_g() > 0) {
	        	System.out.println("Venda concluída");
	            setQuant_g(getQuant_g() - 1);
	        } 
	    } else if(tamanho < 1 || tamanho > 3) {
	        throw new TamanhoInvalidoException("Tamanho Inválido");
	    }
	}
		
		@Override
		public String toString() {
			return "Quant_P = " + quant_p + ", Quant_M = " + quant_m + ", Quant_G = " + quant_g + ", Estoque_min = "+ estoque_min + ", Estoque_max = " + estoque_max;
		}
		@Override
		public void reposicao_estoque() {
		    if (getQuant_p() < getEstoque_min()) {
		    	System.out.println("Estoque adicionado");
		    	setQuant_p(getEstoque_max());
		    } else if (getQuant_m() < getEstoque_min()) {
		    	System.out.println("Estoque adicionado");
		    	setQuant_m(getEstoque_max());
		    } else if (getQuant_g() < getEstoque_min()) {
		    	System.out.println("Estoque adicionado");
		    	setQuant_g(getEstoque_max());
		    } else if (getQuant_p() <= 0 || getQuant_m() <= 0 || getQuant_g() <= 0) {
		        throw new QuantInvalidoException("Quantidade Inválida");
		    }
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public int getQuant_p() {
			return quant_p;
		}
		public void setQuant_p(int quant_p) {
			this.quant_p = quant_p;
		}
		public int getQuant_m() {
			return quant_m;
		}
		public void setQuant_m(int quant_m) {
			this.quant_m = quant_m;
		}
		public int getQuant_g() {
			return quant_g;
		}
		public void setQuant_g(int quant_g) {
			this.quant_g = quant_g;
		}
		public int getEstoque_min() {
			return estoque_min;
		}
		public void setEstoque_min(int estoque_min) {
			this.estoque_min = estoque_min;
		}
		public int getEstoque_max() {
			return estoque_max;
		}
		public void setEstoque_max(int estoque_max) {
			this.estoque_max = estoque_max;
		}
		
		
	}

	
