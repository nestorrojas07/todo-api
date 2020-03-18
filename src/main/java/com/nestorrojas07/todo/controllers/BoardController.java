/**
 * 
 */
package com.nestorrojas07.todo.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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

@RestController
@RequestMapping("/api/v1/boards")
public class BoardController{
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Board>> index(){
		var data =service.all();
		return ResponseEntity.ok(data);
	}
	
	@GetMapping(path = "/hola", name = "aliasfibonaci", produces = "application/json")
	public ResponseEntity<List<Integer>> fibonaci() {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(8);
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(path = "/test", name = "testboard", produces = "application/json")
	public ResponseEntity<Board> testFind() {
		var board = new Board();
		board.setId(1L);
		board.setCreated_at(new Date());
		board.setDescription("Description");
		board.setTitle("Title");
		
		return ResponseEntity.ok(board);
	}
}
