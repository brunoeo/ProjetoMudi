package br.com.alura.mvc.mudi.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Pedido {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeProduto;
	private BigDecimal valorNegociado;
	private String dataDaEntrega;
	private String urlProduto;
	private String urlImagem;
	private String descricao;

	public Pedido() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Pedido(String nomeProduto, BigDecimal valorNegociado, String dataDaEntrega, String urlProduto,
			String urlImagem, String descricao) {
		super();
		this.nomeProduto = nomeProduto;
		this.valorNegociado = valorNegociado;
		this.dataDaEntrega = dataDaEntrega;
		this.urlProduto = urlProduto;
		this.urlImagem = urlImagem;
		this.descricao = descricao;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}
	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}
	public String getDataDaEntrega() {
		return dataDaEntrega;
	}
	public void setDataDaEntrega(String dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
