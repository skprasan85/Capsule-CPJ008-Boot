/**
 * 
 */
package com.capsule.prg.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Admin
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class TasksNotFoundException extends RuntimeException{

	
	public TasksNotFoundException(String exception) {
	    super(exception);
	  }
}
