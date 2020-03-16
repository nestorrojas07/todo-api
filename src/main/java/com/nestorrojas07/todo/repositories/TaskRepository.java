/**
 * 
 */
package com.nestorrojas07.todo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestorrojas07.todo.models.Task;

/**
 * @author Viviana Rincon
 *
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	public List<Task> findByDescription(String description);
}
