package com.iu.s2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.notice.NoticeService;

@Controller
@RequestMapping(value = "/notice/**") //절대경로로 적어줘야한다.
public class NoticeController {
	
	private NoticeService noticeService;
	
	public NoticeController() {
		noticeService = new NoticeService();
	}
	
	@RequestMapping(value = "noticeDelete", method = RequestMethod.GET)
	public ModelAndView noticeDelete(ModelAndView mv) {
		mv.addObject("board", "notice");
		mv.setViewName("board/boardList");
		return mv;
	}
	
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public ModelAndView noticeUpdate2(ModelAndView mv) {
		mv.addObject("board", "notice");
		mv.setViewName("board/boardList");
		return mv;
	}
	
	@RequestMapping(value = "noticeSelect")
	public ModelAndView noticeSelect(ModelAndView mv) {
		mv.addObject("board", "notice");
		mv.setViewName("board/boardSelect");
		return mv;
	}
	
	@RequestMapping(value = "noticeUpdate")
	public ModelAndView noticeUpdate(ModelAndView mv) {
		mv.addObject("board", "notice");
		mv.setViewName("board/boardUpdate");
		return mv;
	}

	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
	public ModelAndView noticeWrite2() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("board", "notice");
		mv.setViewName("board/boardList");
		return mv;
	}
	
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET)
	public ModelAndView noticeWrite(ModelAndView mv) {
		mv.addObject("board", "notice");
		mv.setViewName("board/boardWrite");
		return mv;
	}
	
	@RequestMapping(value = "noticeList")
	public ModelAndView noticeList(ModelAndView mv) {
		mv.addObject("board", "notice");
		mv.setViewName("board/boardList");
		return mv;
	}
}
