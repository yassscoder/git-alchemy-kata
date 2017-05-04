package org.tdd;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class BlueComponentTest {

	@Test
	public void should_apply_blue_magic_operation() {
		BlueComponent blueComponent = new BlueComponent();
		assertThat(blueComponent.power(1,1)).isEqualTo(1);
		assertThat(blueComponent.power(1,2)).isEqualTo(3);
		assertThat(blueComponent.power(2,1)).isEqualTo(0);
		assertThat(blueComponent.power(2,2)).isEqualTo(2);
	}

}
