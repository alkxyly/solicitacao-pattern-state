
public class SolicitacaoFactory {

	
	public EstagioDaSolicitacao getEstagioSolicitacao(Integer identificacaoEstagio) {
		
		switch (identificacaoEstagio) {
			case 1:
				return new AguardandoAvaliacaoGerplaf();
			case 2:
				return new AguardandoFiscalizacaoGerplaf();
			case 3:
				return new EmFiscalizacao();
			default:
				throw new  RuntimeException("Estágio não encontrado");
		}
	}
}
