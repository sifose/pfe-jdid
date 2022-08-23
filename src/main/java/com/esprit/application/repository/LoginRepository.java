package com.esprit.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.EspEtudiant;
import com.esprit.application.entity.EspLogin;



	
	@Repository
	public interface LoginRepository extends JpaRepository<EspLogin, Long> {
		EspLogin findByIdlogin(String idlogin);


}
