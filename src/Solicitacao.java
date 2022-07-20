
public class Solicitacao {
	
	private EstagioDaSolicitacao estado = new AguardandoAvaliacaoGerplaf();
	
	public void atender() {
		System.out.print("ANTES -> ");
		estado.print();
		estado.executar(this);
		System.out.print("DEPOIS -> ");
		estado.print();
	}
	
	public EstagioDaSolicitacao getEstado() {
		return estado;
	}

	public void setEstado(EstagioDaSolicitacao estado) {
		this.estado = estado;
	}
}
