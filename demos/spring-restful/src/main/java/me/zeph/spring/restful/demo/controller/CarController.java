package me.zeph.spring.restful.demo.controller;

import me.zeph.spring.restful.demo.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "car", method = GET)
public class CarController {

	public static final String VIEW_NAME = "car";

	@RequestMapping
	public String getCarByView() {
		return VIEW_NAME;
	}

	@RequestMapping(produces = {APPLICATION_JSON_VALUE})
	@ResponseBody
	public Car getCarByJSON() {
		return getCar();
	}

	private Car getCar() {
		Car car = new Car();
		car.setName("BenZ");
		car.setPrice(300000);
		return car;
	}
}
