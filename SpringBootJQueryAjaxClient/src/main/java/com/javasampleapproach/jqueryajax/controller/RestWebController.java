package com.javasampleapproach.jqueryajax.controller;

import java.util.ArrayList;
import java.util.List;

import com.javasampleapproach.jqueryajax.Crypto;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.Customer;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/customer")
public class RestWebController {

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody String postEncryption(@RequestParam("textToEncrypt") String textToEncrypt) {
		// Create Response Object
		String crypto = new Crypto().encrypt(textToEncrypt);
		return crypto;
	}
}