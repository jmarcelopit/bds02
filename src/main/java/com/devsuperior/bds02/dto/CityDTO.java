package com.devsuperior.bds02.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.entities.Event;

public class CityDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private List<EventDTO> envents = new ArrayList<>();
	
	public CityDTO() {
	}

	public CityDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CityDTO(City entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	public CityDTO(City entity, Set<Event> events) {		
		this(entity);
		events.forEach(eve -> this.envents.add(new EventDTO(eve)));		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EventDTO> getEnvents() {
		return envents;
	}

	
	
	
}
