package me.zeph.spring.restful.demo.controller;

import me.zeph.spring.restful.demo.common.URLs;
import me.zeph.spring.restful.demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class DisplayCarController {

	public static final String VIEW_NAME = "displayCarJson";
	private RestTemplate restTemplate;

	@Autowired
	public DisplayCarController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@RequestMapping(value = VIEW_NAME)
	public String getCar(Model model) {
		model.addAttribute("car", getCarByJson());
		return VIEW_NAME;
	}

	private Car getCarByJson() {
		return restTemplate.getForObject(URLs.REST_CAR_URL, Car.class);
	}

}
