package trabalho;

public class RoupaTamanhoUnico extends peca implements Item {

	public RoupaTamanhoUnico(String decricao, int quantidade, int estoque_min, int estoque_max) {
		super(decricao, quantidade, estoque_min, estoque_max);
	}

	@Override
	public void venda(int venda) {
		if(venda <= getQuantidade() && venda > 0) {
			setQuantidade(getQuantidade() - venda);
			System.out.println("Venda concluída");
		} else if(venda > getQuantidade()) {
			throw new QuantInvalidoException ("Estoque insuficiente");
		} else if(venda < 0) {
			throw new QuantInvalidoException ("Quantidade Invalida");
		}
	}
	@Override
	public void reposicao_estoque() {
		super.reposicao_estoque();
		}

	@Override
	public String toString() {
		return "Quantidade =" + getQuantidade()+ ", getEstoque_min =" + getEstoque_min() + ", getEstoque_max =" + getEstoque_max();
	}
	
		
	}
	
