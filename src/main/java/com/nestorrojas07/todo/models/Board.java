/**
 * 
 */
package com.nestorrojas07.todo.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Nestor Rojas
 *
 */
@Data
@Getter
@Setter

@Entity
@Table(name = "boards")
@JsonSerialize
public class Board implements Serializable
{
	private static final long serialVersionUID = 6650327405376806128L;

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
