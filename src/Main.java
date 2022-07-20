
public class Main {

	public static void main(String[] args) {
		var solicitacaoFactory = new SolicitacaoFactory();
		
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setEstado(solicitacaoFactory.getEstagioSolicitacao(2));
		
		solicitacao.atender();
	}
}
