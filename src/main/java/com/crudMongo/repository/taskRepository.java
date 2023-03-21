package com.crudMongo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crudMongo.model.Task;

public interface taskRepository extends MongoRepository<Task,String> {

	List<Task> findBySeverity(int severity);

}
