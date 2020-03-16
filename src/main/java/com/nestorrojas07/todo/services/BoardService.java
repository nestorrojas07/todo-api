/**
 * 
 */
package com.nestorrojas07.todo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nestorrojas07.todo.models.Board;
import com.nestorrojas07.todo.repositories.BoardRepository;

/**
 * @author Nestor Rojas
 *
 */
public class BoardService {
	
	@Autowired
	private BoardRepository repository;
	
	@Transactional
	public Board create(Board board) {
		return this.repository.save(board);
	}
	
	public List<Board> all(){
		return this.repository.findAll();
	}
	
	@Transactional
	public Board update(Board board) {
		return this.repository.save(board);
	}
}
