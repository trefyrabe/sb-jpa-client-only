package com.example.sb.client.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_CLIENTS")
public class Client implements Serializable{
	/**
	 * UID
	 */
	private static final long serialVersionUID = 5180994653997802204L;
	@Id
	@GeneratedValue
	@Column(name="CLI_CODE")
	private Long numCompte;
	@Column(name="CLI_NAME")
	private String name;
	@Column(name="CLI_BIRTHDAY")
	private Date birthday;
	//default value, Fetch=LAZY
	@OneToMany(mappedBy="client", fetch=FetchType.LAZY)
	private Collection<Compte> comptes;
	
	public Client() {
		super();
	}
	
	public Client(String name) {
		super();
		this.name = name;
	}

	public Client(Long numCompte, String name) {
		super();
		this.numCompte = numCompte;
		this.name = name;
	}

	public Long getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Client [numCompte=" + numCompte + ", name=" + name + ", birthday=" + birthday + "]";
	}
	
	
}
