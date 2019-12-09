package com.collabera.day40.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.collabera.day40.enumTypes.AccountType;

@Entity
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column(columnDefinition = "integer default 0")
	private Integer balance;
	
	@Enumerated(EnumType.STRING)
	private AccountType type;
	
	@ManyToOne
	@JoinColumn
	private Customer customer;
	
	public Account() {
		this(-1L, 0, AccountType.UNKNOWN);
	}

	public Account(Long id, @NotNull Integer balance, AccountType type) {
		super();
		this.id = id;
		this.balance = balance;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", type=" + type + "]";
	}
}
