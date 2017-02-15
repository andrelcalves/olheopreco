package com.al.olheopreco.model;

import java.math.BigDecimal;

public class Produto {
	

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setPeso(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public Long getUnidade() {
		return unidade;
	}
	public void setUnidade(Long quantidade) {
		this.unidade = quantidade;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	private Long codigo;
	private String nome;
	private String descricao;
	private UnidadeMedida unidadeMedida;
	private Long unidade;
	private BigDecimal preco;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
