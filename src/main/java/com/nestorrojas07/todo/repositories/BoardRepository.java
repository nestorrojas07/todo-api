package com.nestorrojas07.todo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestorrojas07.todo.models.Board;

/***
 * 
 * @author Nestor Rojas
 *
 */

@Repository
public interface BoardRepository  extends JpaRepository<Board, Long>{
	
	/**
	 * Search by title
	 * @param title
	 * @return
	 */
	public List<Board> findByTitle(String title);
	
	/**
	 * Search by Description
	 * @param description
	 * @return
	 */
	public List<Board> findByDescription(String description);	

}
