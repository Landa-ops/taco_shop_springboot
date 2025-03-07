package com.lm2a.model;

import java.util.List;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
	@Size(min=5, message="El nombre debe tgener almenos 5 caracteres")
	private String name;
	private List<String> ingredients;
}
