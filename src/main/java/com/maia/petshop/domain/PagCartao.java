package com.maia.petshop.domain;

import com.maia.petshop.domain.enums.SituacaoPagamento;

import jakarta.persistence.Entity;

@Entity
public class PagCartao extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	private Integer parcelas;
	
	public PagCartao() {
		
	}

	public PagCartao(Integer id, Double valor, SituacaoPagamento situacao, Servico servico, Integer parcelas) {
		super(id, valor, situacao, servico);
		this.parcelas = parcelas;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
}
