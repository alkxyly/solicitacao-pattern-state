
public enum Estagio {
	
	AGUARDANDO_AVALIACAO_GERPLAF(1),
	AGUARDANDO_FISCALIZACAO_GERPLAF(2),
	EM_FISCALIZACAO(3);
	
	private Integer identificacao;
	
	Estagio(Integer identificacao) {
		this.identificacao = identificacao;
	}

	public Integer getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Integer identificacao) {
		this.identificacao = identificacao;
	}
	
}
