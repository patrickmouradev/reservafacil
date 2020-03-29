package br.com.cvc.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope
	public class IndexController {
		
		@RequestMapping("/")
		public String index() {
			return "/index.xhtml";
		}

}
