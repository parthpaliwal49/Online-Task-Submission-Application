package com.crudMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "tasks")
public class Task {

	@Id
	private String taskId;
	private String description;
	private int severity;
	private String asignee;
	private int taskCompletetion;
	
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public String getAsignee() {
		return asignee;
	}
	public void setAsignee(String asignee) {
		this.asignee = asignee;
	}
	public int gettaskCompletetion() {
		return taskCompletetion;
	}
	public void settaskCompletetion(int taskCompletetion) {
		this.taskCompletetion = taskCompletetion;
	}
	
}
