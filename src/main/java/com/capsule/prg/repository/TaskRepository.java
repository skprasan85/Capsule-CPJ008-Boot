/**
 * 
 */
package com.capsule.prg.repository;

/**
 * @author Admin
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.capsule.prg.cargo.Tasks;


public interface TaskRepository extends JpaRepository<Tasks, Integer>{

}