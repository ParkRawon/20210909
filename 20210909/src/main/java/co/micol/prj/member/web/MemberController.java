package co.micol.prj.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.micol.prj.member.vo.MemberVO;

@Controller
public class MemberController { 
	
	@RequestMapping("/loginForm.do")
	public String loginForm() {
		
		return "member/loginForm";
	}
	
//	@RequestMapping(value="/login.do",method = RequestMethod.POST)	
//	@GetMapping("/login.do")  //get방식만 허용
	@PostMapping("/login.do")  //postmapping=전달되는 값은 무조건 post방식만 허용
	public ModelAndView login(MemberVO vo, ModelAndView mv) {  //db값을 모델에 실어보낸다  membervo vo- form에서전달된 값을 자동으로 담아준다 model-값을실어서 전달해준다
		//리턴타입이 ModelAndView
		if(vo.getId().equals("micol")) {
			mv.addObject("member", vo);   //모델객체에 넘어온 vo 객체를 담는다. =request.setattribute와 같다
			mv.setViewName("member/loginResult");
		}else {
			mv.addObject("member", vo);  //값을 싣는 방법
			mv.setViewName("member/loginFail");  //viewPage 싣기
		}
		
		return mv;
	}
	
//	@PostMapping("/login.do")
	public String login(MemberVO vo, Model model) {  //리턴타입은 String 
		String viewPage = null;   //viewPage 전달
		
		if(vo.getId().equals("micol")) {
			model.addAttribute("member", vo);  //값을 싣는 방법
			viewPage = "member/loginResult";    //viewPage 싣기
			
		}else {
			model.addAttribute("member", vo);
			viewPage = "member/loginFail";
		}
		
		return viewPage;   //리턴시 viewPage 리턴
	}
}
