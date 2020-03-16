/**
 * 
 */
package com.nestorrojas07.todo.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Nestor Rojas
 *
 */
@Data
@Entity
@Table(name = "boards")
public class Board {
	@Id()
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title", length = 120)
	private String title;
	
	@Column(name="description", length = 255)
	private String description;
	
	@Column(name = "created_at")
	private Date created_at;
	
	@OneToMany(mappedBy = "board")
	private Set<Task> tasks;
}
