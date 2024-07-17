package trabalho;

public abstract class peca{
	private String descricao;
	private int quantidade;
	private int estoque_min;
	private int estoque_max;
	
	public peca(String descricao, int quantidade, int estoque_min, int estoque_max) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoque_min = estoque_min;
		this.estoque_max = estoque_max;
		
	}
	
	public abstract void venda(int venda);
	
	public void reposicao_estoque() {
		if(quantidade < estoque_min) {
			System.out.println("Estoque adicionado");
			quantidade = this.estoque_max;
		}
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
