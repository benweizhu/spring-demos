package me.zeph.spring.restful.demo.controller;

import me.zeph.spring.restful.demo.model.Car;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class CarControllerTest {

	private CarController carController;

	@Before
	public void setUp() throws Exception {
		carController = new CarController();
	}

	@Test
	public void shouldReturnCar() {
		//when
		Car car = carController.getCarByJSON();

		//then
		assertThat(car, is(notNullValue()));
	}

	@Test
	public void shouldReturnCarView() {
		//when
		String viewName = carController.getCarByView();

		//then
		assertThat(viewName, is("car"));
	}
}
