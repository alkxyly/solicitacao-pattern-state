
public class AguardandoAvaliacaoGerplaf extends EstagioDaSolicitacao{
	
	@Override
	public void executar(Solicitacao solicitacao) {
		solicitacao.setEstado(new AguardandoFiscalizacaoGerplaf());
	}

	@Override
	public void print() {
		System.out.println("AGUARDANDO AVALIACAO GERPLAF");
	}
}
