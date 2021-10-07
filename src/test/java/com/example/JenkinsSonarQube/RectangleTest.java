package com.example.JenkinsSonarQube;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {

	@Test
	void testToString() {
		String actual = new Rectangle(1, 2).toString();
		String expected = "Rectangle(1,2)";
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	@Disabled("getSurface() method is not covered by tests")
	void testGetSurface() {
		float actual = new Rectangle(1, 2).getSurface();
		float expected = 2;
		assertThat(actual).isEqualTo(expected);
	}
}