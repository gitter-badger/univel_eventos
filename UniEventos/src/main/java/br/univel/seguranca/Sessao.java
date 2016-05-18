package br.univel.seguranca;

/**
 * 
 * Dados da sessão de cada Usuario
 * 
 * @author Aureo
 *
 */
public class Sessao {
	
	private String token;
	
	private EnumTipoSessao enumTipoSessao;
	
	private long validade;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public EnumTipoSessao getEnumTipoSessao() {
		return enumTipoSessao;
	}

	public void setEnumTipoSessao(EnumTipoSessao enumTipoSessao) {
		this.enumTipoSessao = enumTipoSessao;
	}

	public long getValidade() {
		return validade;
	}

	public void setValidade(long validade) {
		this.validade = validade;
	}

	
	
}
