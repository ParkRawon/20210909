package co.micol.prj;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller   //클래스에 적용, 컨트롤 역활 
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping("/main.do")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "main/main";
	}
	
	@RequestMapping("/first.do")  //메소드위에 적용, 요청을 해석하는 역활
	public String first() {
		
		return "main/first";
	}
	
}
