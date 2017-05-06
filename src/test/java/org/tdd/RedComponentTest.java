package org.tdd;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class RedComponentTest {

	@Test
	public void should_apply_red_magic_operation() {
		RedComponent redComponent = new RedComponent();
		assertThat(redComponent.power(1,1)).isEqualTo(2);
		assertThat(redComponent.power(1,2)).isEqualTo(3);
		assertThat(redComponent.power(2,1)).isEqualTo(3);
		assertThat(redComponent.power(2,2)).isEqualTo(3);
	}

}
