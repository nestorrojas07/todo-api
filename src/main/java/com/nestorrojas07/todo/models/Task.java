/**
 * 
 */
package com.nestorrojas07.todo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Nestor Rojas
 *
 */

@Data
@Entity
@Table(name = "tasks")
public class Task implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "created_at", nullable = false)
	private Date created_at;
	
	@Column(name = "done_at", nullable = true)
	private Date done_at;
	
	@ManyToOne
	@JoinColumn(name = "board_id", nullable = false, updatable = true)
	private Board board;
}
