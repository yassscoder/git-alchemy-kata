package org.tdd;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class WhiteComponentTest {

	@Test
	public void should_apply_all_the_magic_operations() {

		WhiteComponent whiteComponent = new WhiteComponent();
		assertThat(whiteComponent.power(16,20)).isEqualTo(32);
	}

}
