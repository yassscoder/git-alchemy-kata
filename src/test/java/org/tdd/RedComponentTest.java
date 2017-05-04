package org.tdd;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class RedComponentTest {

	@Test
	public void should_apply_red_magic_operation() {
		RedComponent redComponent = new RedComponent();
		assertThat(redComponent.process(19,3)).isEqualTo(16);
		assertThat(redComponent.process(3,19)).isEqualTo(16);
	}

}
