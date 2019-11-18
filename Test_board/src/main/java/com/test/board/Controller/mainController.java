package com.test.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {

	@RequestMapping(value="main.do")
	public String mainView(ModelAndView mv) {
		mv.setViewName("main/main");
		return mv.getViewName();
	}
}
