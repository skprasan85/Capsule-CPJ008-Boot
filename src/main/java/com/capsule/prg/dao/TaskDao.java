/**
 * 
 */
package com.capsule.prg.dao;

import java.util.List;
import java.util.Optional;

import com.capsule.prg.cargo.Tasks;

/**
 * @author Admin
 *
 */
public interface TaskDao {

	public List<Tasks>findAll()  throws Exception;
	
	public Tasks addTasks(Tasks tasks);
	
	public Tasks updateTasks(Tasks tasks);
	
	public void deleteTasks(Integer taskId);
	
	public Optional<Tasks> findTasks(Integer tasks);
}
