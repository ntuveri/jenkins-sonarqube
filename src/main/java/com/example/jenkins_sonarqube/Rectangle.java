package com.example.jenkins_sonarqube;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Rectangle {
	private double width;
	private double height;

	public double getSurface() {
		return this.width * this.height;
	}
}
