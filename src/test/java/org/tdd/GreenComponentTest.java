package org.tdd;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class GreenComponentTest {

	@Test
	public void should_apply_green_magic_operation() {
		GreenComponent greenComponent = new GreenComponent();
		assertThat(greenComponent.power(19,3)).isEqualTo(16);
		assertThat(greenComponent.power(3,19)).isEqualTo(16);
	}

}
