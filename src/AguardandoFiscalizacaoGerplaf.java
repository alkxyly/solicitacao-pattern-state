
public class AguardandoFiscalizacaoGerplaf extends EstagioDaSolicitacao{

	@Override
	public void executar(Solicitacao solicitacao) {
		solicitacao.setEstado(new EmFiscalizacao());
	}
	
	@Override
	public void print() {
		System.out.println("AGUARDANDO FISCALIZACAO GERPLAF");
	}
}
