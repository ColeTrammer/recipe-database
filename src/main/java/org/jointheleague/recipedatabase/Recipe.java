package org.jointheleague.recipedatabase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Recipe {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String body;
	
	public Recipe() {}
	
	Recipe(String name, String body) {
		this.name = name;
		this.body = body;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBody() {
		return body;
	}
}
