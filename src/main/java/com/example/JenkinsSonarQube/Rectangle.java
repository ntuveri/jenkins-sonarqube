package com.example.JenkinsSonarQube;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Rectangle {
	private float width;
	private float height;

	public float getSurface() {
		return this.width * this.height;
	}
}
