package org.tdd;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class GreenComponentTest {

	@Test
	public void should_apply_green_magic_operation() {
		GreenComponent greenComponent = new GreenComponent();
		assertThat(greenComponent.power(1,1)).isEqualTo(0);
		assertThat(greenComponent.power(1,2)).isEqualTo(1);
		assertThat(greenComponent.power(2,1)).isEqualTo(3);
		assertThat(greenComponent.power(2,2)).isEqualTo(2);
	}

}
