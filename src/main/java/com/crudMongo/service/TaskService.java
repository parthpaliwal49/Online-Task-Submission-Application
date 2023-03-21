package com.crudMongo.service;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.crudMongo.model.Task;
import com.crudMongo.repository.taskRepository;

@Service
public class TaskService {

	@Autowired
	private taskRepository repository;
	
	public Task addTask(Task task) {
		task.setTaskId(UUID.randomUUID().toString().split("-")[0]);  
		return repository.save(task);
	}
	public List<Task> findAllList(){
		return repository.findAll();	
	}
	public Task getTaskByTaskId(String taskId) {
		return repository.findById(taskId).get() ;
		
	}
    public List<Task> getTaskBySeverity(int severity){
        return  repository.findBySeverity(severity);
    }

    public Task updateTask(Task taskRequest){
        //get the existing document from DB
        // populate new value from request to existing object/entity/document
        Task existingTask = repository.findById(taskRequest.getTaskId()).get();
        existingTask.setDescription(taskRequest.getDescription());
        existingTask.setSeverity(taskRequest.getSeverity());
        existingTask.setAsignee(taskRequest.getAsignee());
        existingTask.settaskCompletetion(taskRequest.gettaskCompletetion());
        return repository.save(existingTask);
    }

    public String deleteTask(String taskId){
        repository.deleteById(taskId);
        return taskId+" task deleted from dashboard ";
    }
	
	
}
 