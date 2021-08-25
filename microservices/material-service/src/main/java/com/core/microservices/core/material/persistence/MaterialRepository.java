package com.core.microservices.core.material.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MaterialRepository extends CrudRepository<MaterialEntity, Integer> {


	List<MaterialEntity> findAllByToId(@Param("toId") int toId);
}
