package com.Charuli.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Charuli.Model.User;



@Repository
public interface UserDao extends JpaRepository<User, Long> {
	Optional<User>findByPan(String pan);
	List<User> findByPanOrAdharOrEmail(String pan, String adhar, String email);
	Optional <User >findByEmail(String accountHolderEmail);

}
