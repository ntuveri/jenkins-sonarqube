package com.example.JenkinsSonarQube;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {

	@Test
	void testToString() {
		String actual = new Rectangle(1.0, 2.0).toString();
		String expected = "Rectangle(width=1.0, height=2.0)";
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	@Disabled("getSurface() method is not covered by tests")
	void testGetSurface() {
		double actual = new Rectangle(1.0, 2.0).getSurface();
		double expected = 2.0;
		assertThat(actual).isEqualTo(expected);
	}
}