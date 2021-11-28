package com.springboot.wecare.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.wecare.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	Optional<Login> findByLoginId(Long loginId);

	Optional<Login> findByUsername(String username);

}
