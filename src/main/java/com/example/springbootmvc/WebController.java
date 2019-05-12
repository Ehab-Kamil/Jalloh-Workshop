package com.example.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 * Title: WebController.java
 * </p>
 *
 * <p>
 * Description:
 * </p>
 *
 * <p>
 * Copyright: Copyright(c) Ehab Kamil, 2019
 * </p>
 *
 * @author <a href="mailto:ehabkamil2@gmail.com">Ehab Kamil</a>
 * @version 1.0
 * @date 12/05/2019
 */
@Controller
public class WebController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
