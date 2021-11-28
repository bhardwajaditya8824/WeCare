package com.springboot.wecare.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.wecare.model.Query;

@Repository
public interface QueryRepository extends JpaRepository<Query, Long> {

	Optional<Query> findByQueryId(Long queryId);
}
