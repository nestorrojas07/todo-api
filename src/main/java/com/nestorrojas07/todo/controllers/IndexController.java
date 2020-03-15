/**
 * 
 */
package com.nestorrojas07.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller to present project
 * @author nrojas
 *
 */

@Controller
public class IndexController {

	@RequestMapping("/hola")
	@ResponseBody()
	public String index() {
		return "Hola Mundo";
	}
	
	@GetMapping("/")
	@ResponseBody()
	public String index2() {
		return "Hola Mundo2";
	}
}
