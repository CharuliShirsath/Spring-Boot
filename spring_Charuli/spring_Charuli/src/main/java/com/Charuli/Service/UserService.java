package com.Charuli.Service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Charuli.Dao.AccountDao;
import com.Charuli.Dao.UserDao;
import com.Charuli.Model.Account;
import com.Charuli.Model.User;

@Service
public class UserService {
	
	@Autowired//
	UserDao ud;
	
	@Autowired
	AccountDao ad;
	
	public User registration (User user) {
		List<User>usr=ud.findByPanOrAdharOrEmail(user.getPan(),user.getAdhar(),user.getEmail());
		
		return usr.isEmpty()?ud.save(user):new User();
	}
	
	public String createAccount(User user) {
		List<User>usr=ud.findByPanOrAdharOrEmail(user.getPan(),
												 user.getAdhar(),
												 user.getEmail());

		if(usr.isEmpty()) {
			ud.save(user);
			
			Random rand = new Random();
			
			int acc_Num= rand.nextInt(1000);
			Account acc = new Account();
			acc.setAccountNumber(acc_Num);
			acc.setBalance(0L);
			acc.setUser(user);
			ad.save(acc);
			return "Your account has been created";
			}
		else {
			return "You can't create an account";
		}
		
	}

}
