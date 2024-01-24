package com.Charuli.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long Acc_id;
	private int accountNumber;
	private Long balance;
	private Long u_Id;
	
	@OneToOne
	private User user;

	public Long getAcc_id() {
		return Acc_id;
	}

	public void setAcc_id(Long acc_id) {
		Acc_id = acc_id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getUserId() {
		return u_Id;
	}

	public void setUserId(Long u_Id) {
		this.u_Id = u_Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
}
