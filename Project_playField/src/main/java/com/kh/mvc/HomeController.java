package com.kh.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
//	@RequestMapping("/board/boardList.do")
//	public String boardList() {
//		
//		return "board/boardList";
//	}
//	
//	@RequestMapping("/board/boardView.do")
//	public String boardView() {
//		
//		return "board/boardView";
//	}
//	
//	@RequestMapping("/board_trade/tradeList.do")
//	public String tradeList() {
//		
//		return "board_trade/tradeList";
//	}
//	
//	@RequestMapping("/board_trade/tradeView.do")
//	public String tradeView() {
//		
//		return "board_trade/tradeView";
//	}
//	
//	
//	@RequestMapping("/search/searchList.do")
//	public String searchList() {
//		
//		return "search/searchList";
//	}
//	
//	@RequestMapping("/search/searchView.do")
//	public String searchView() {
//		
//		return "search/searchView";
//	}
//	
//	@RequestMapping("/match/matchList.do")
//	public String matchList() {
//		
//		return "match/matchList";
//	}
//	
//	@RequestMapping("/match/matchView.do")
//	public String matchView() {
//		
//		return "match/matchView";
//	}
	
	
}
