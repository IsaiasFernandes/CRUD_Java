package com.isaiasfernandes.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.isaiasfernandes.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;

	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {}

	public PagamentoComCartao(Integer id, EstadoPagamento pagamento, Pedido pedido, Integer numeroDeParcelas) {
		super(id, pagamento, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
}
