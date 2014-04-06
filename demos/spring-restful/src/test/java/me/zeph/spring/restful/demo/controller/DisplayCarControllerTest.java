package me.zeph.spring.restful.demo.controller;

import me.zeph.spring.restful.demo.model.Car;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DisplayCarControllerTest {

	@Test
	public void shouldGoToPageAndDisplayCarValue() {
		//given
		Car car = new Car();
		RestTemplate mockRestTemplate = mock(RestTemplate.class);
		when(mockRestTemplate.getForObject(anyString(), (Class) anyObject())).thenReturn(car);
		DisplayCarController displayCarController = new DisplayCarController(mockRestTemplate);

		//when
		ExtendedModelMap model = new ExtendedModelMap();
		String viewName = displayCarController.getCar(model);

		//then
		assertThat(viewName, is("displayCarJson"));
		assertThat((Car) model.get("car"), is(car));
	}
}
