/**
 * 
 */
package com.capsule.prg.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capsule.prg.cargo.Tasks;
import com.capsule.prg.repository.TaskRepository;

/**
 * @author Admin
 *
 */
@Repository
public class TaskDaoImpl implements TaskDao {

	private TaskRepository taskRepository;
	
	@Autowired
	public void setTaskRepository(TaskRepository taskRepository) {
		this.taskRepository=taskRepository;
	}

	@Override
	public List<Tasks> findAll()  throws Exception{
		return taskRepository.findAll();
	}

	@Override
	public Tasks addTasks(Tasks tasks) {
		return taskRepository.save(tasks);
	}

	@Override
	public Tasks updateTasks(Tasks tasks) {
		return taskRepository.save(tasks);
	}

	@Override
	public void deleteTasks(Integer taskId) {
		// TODO Auto-generated method stub
		 taskRepository.deleteById(taskId);
	}

	@Override
	public Optional<Tasks> findTasks(Integer tasks) {
		// TODO Auto-generated method stub
		return taskRepository.findById(tasks);
	}

}
