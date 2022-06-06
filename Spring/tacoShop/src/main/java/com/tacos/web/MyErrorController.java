package com.tacos.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MyErrorController implements ErrorController {
	
	@Autowired
	ErrorAttributes errorAttributes;

	/*
	 * @RequestMapping("/error") public String handleError() {
	 * log.error("Algo ha fallado"); return "error"; }
	 */
	@RequestMapping("/error")
	public String handleError(Model model, WebRequest webRequest) {
		Map<String, Object>errorMap = errorAttributes.getErrorAttributes(webRequest, ErrorAttributeOptions.of(ErrorAttributeOptions.Include.MESSAGE));
		log.error("Algo ha fallado...."); //Se muestra en el server que algo ha fallado
		model.addAttribute("msg",errorMap.get("error"));
		model.addAttribute("path",errorMap.get("path"));
		return "error"; //Nos remite a la pagina de error
	}

}
