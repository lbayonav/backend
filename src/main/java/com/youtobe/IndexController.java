package com.youtobe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Anotacion Controller para que pueda ser accedido desde una aplicacion externa

@Controller
public class IndexController {
	
	// Cuando no se escriba nada vaya al index
	@RequestMapping("/")
	public String getIndexPage(){
		return "index";
	}

}
