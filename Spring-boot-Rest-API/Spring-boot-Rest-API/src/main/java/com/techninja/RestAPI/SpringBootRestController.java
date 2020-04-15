package com.techninja.RestAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootRestController
{

	@RequestMapping("/sega/sonic")
	public String sega()
	{
		return " My name is Sonic the Hedgehog and I'm the fastest thing alive!!! ";
	}

}
