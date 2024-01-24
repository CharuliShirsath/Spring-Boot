package com.Charuli.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Charuli.Model.Account;


@Repository
public interface AccountDao extends JpaRepository<Account, Long>{
		Optional<Account>findByAccountNumber(int accountNumber);
}
