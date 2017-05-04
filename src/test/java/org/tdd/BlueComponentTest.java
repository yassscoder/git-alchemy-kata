package org.tdd;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class BlueComponentTest {

	@Test
	public void should_apply_blue_magic_operation() {
		BlueComponent blueComponent = new BlueComponent();
		assertThat(blueComponent.process(19,3)).isEqualTo(16);
		assertThat(blueComponent.process(3,19)).isEqualTo(16);
	}

}
