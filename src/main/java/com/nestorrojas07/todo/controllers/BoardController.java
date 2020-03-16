/**
 * 
 */
package com.nestorrojas07.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestorrojas07.todo.models.Board;
import com.nestorrojas07.todo.services.BoardService;

/**
 * @author Nestor Rojas
 *
 */

@RestController()
@RequestMapping("/api/v1/boards")
public class BoardController{
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Board>> index(){
		return ResponseEntity.ok(service.all());
	}
}
