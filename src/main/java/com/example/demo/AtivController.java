package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtivController {
	
	@GetMapping("/")
	public String index () {
		return "index";
	}
	
	@GetMapping("/compras")
	public String compras() {
		return "compras";
	}

	@GetMapping("/vendas")
	public String vendas() {
		return "vendas";
	}
	

	@GetMapping("/estoque")
	public String estoque() {
		return "estoque";
	}

}
