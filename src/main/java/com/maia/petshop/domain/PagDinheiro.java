package com.maia.petshop.domain;

import java.util.Date;

import com.maia.petshop.domain.enums.SituacaoPagamento;

import jakarta.persistence.Entity;

@Entity
public class PagDinheiro extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento;
	private Double desconto;
	
	public PagDinheiro() {
		
	}

	public PagDinheiro(Integer id, Double valor, SituacaoPagamento situacao, Servico servico, Date dataVencimento, Double desconto) {
		super(id, valor, situacao, servico);
		this.dataVencimento = dataVencimento;
		this.desconto = desconto;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
}