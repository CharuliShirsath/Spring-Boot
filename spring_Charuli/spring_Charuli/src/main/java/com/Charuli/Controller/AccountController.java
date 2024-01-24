package com.Charuli.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Charuli.Model.Account;
import com.Charuli.Service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService as;
	
	
	@PostMapping("/account-create")
	public Account createAccount(@RequestBody Account account) {
		
		return as.createAccount(account);
	}
	
	
	@PostMapping("/account-create-ah")
	public Account createAccountAh(@RequestBody Account account, @RequestParam String accountHolder) {
		return as.createAccountAh(account,accountHolder);
	}
	
	@PostMapping("/add-balance")
	public String addBalance(@RequestParam("acn") int accountNumber,@RequestParam("baln") Long balance) {
		
		return as.addBalance(accountNumber,balance);
	}
	
	@GetMapping("/check-balance")
	public String checkBalance(@RequestParam("accNum") int accountNumber) {
	
		return as.checkBalance(accountNumber);
	}	
	
	@PutMapping("/balance-transfer")
	public String balanceTransfer(@RequestParam("myaccno") int myAccNo,
								  @RequestParam("enduserno") int endUserAccNo,
								  @RequestParam("amount") Long ammount) {
		
		
		return as.balanceTransfer(myAccNo,endUserAccNo,ammount);
	}
}
