package com.example.sb.client.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_COMPTES")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="CPT_TYPE",discriminatorType=DiscriminatorType.STRING,length=2)
public class Compte implements Serializable {
	/**
	 * UID
	 */
	private static final long serialVersionUID = 3803993017798886285L;
	@Id
	@Column(name = "CPT_NUMERO")
	private String numero;
	@Column(name = "CPT_DATECREATION")
	private Date dateCreation;
	@Column(name = "CPT_SOLDE")
	private Double solde;
	
	@ManyToOne
	@JoinColumn(name="CPT_CLI_CODE")
	private Client client;

	public Compte() {
		super();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

}
