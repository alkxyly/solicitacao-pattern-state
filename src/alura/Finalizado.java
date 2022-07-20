package alura;

import java.math.BigDecimal;


public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento)  throws DomainException{
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
