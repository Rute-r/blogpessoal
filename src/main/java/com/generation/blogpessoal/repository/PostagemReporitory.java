package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagens;

public interface PostagemReporitory extends JpaRepository<Postagens, Long>{
	

}
