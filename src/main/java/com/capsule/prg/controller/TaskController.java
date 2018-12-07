/**
 * 
 */
package com.capsule.prg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capsule.prg.cargo.Tasks;
import com.capsule.prg.service.TaskService;

/**
 * @author Admin
 *
 */
@RequestMapping("/capsuleproject")
@RestController
public class TaskController {
	
	
	TaskService taskService;
	

	/**
	 * @param taskService the taskService to set
	 */
	@Autowired
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping("/print")
	@ResponseBody
	public String printTask()
	{
		return "Yes the service is up and running";
	}

	/**
	 * find all tasks in DB
	 * @return taskList
	 */
	@GetMapping("/printalltasks")
	@ResponseBody
	public List<Tasks> printAllTasks() throws Exception {
		return taskService.findAll();
	}
	
	/**
	 * @param tasks
	 * @return
	 */
	@PostMapping(value= "/addtasks", consumes ="application/json")
	@ResponseBody
	public ResponseEntity<Tasks> addTasks(@RequestBody Tasks tasks) {
		return ResponseEntity.ok().body(taskService.addTasks(tasks));
	}
	
	
	/**
	 * 
	 * @param taskId
	 * @param taskDetails
	 * @return
	 */
	@PutMapping(value= "/updatetasks/{id}", consumes = "application/json")
	@ResponseBody
	public ResponseEntity updateTasks(@PathVariable(value = "id") Integer taskId, @RequestBody Tasks taskDetails) {
		return ResponseEntity.ok().body(taskService.updateTasks(taskDetails,taskId));
	}
	
	/**
	 * 
	 * @param taskId
	 * @return
	 */
	@DeleteMapping(value= "/deletetasks/{id}")
	@ResponseBody
	public ResponseEntity deleteTasks(@PathVariable(value = "id") Integer tasksId) {
		taskService.deleteTasks(tasksId);
		return ResponseEntity.ok().body("Tasks: "+tasksId+" delete successfully");
	}
	
	/**
	 * 
	 * @param taskId
	 * @return
	 */
	@GetMapping(value= "/findtasks/{id}")
	@ResponseBody
	public ResponseEntity findTasks(@PathVariable(value = "id") Integer tasksId) {
			return ResponseEntity.ok().body(taskService.findTasks(tasksId));
	}
	
}
