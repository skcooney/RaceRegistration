package edu.dmacc.spring.raceregistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RaceInfoController {

	@Autowired RaceInfoDao dao;
	private static final String[] races = {"5k", "10k", "Half Marathon", "Full Marathon"};

	@RequestMapping(value="/form")
	public ModelAndView raceInfo() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("raceInfoForm");
		modelAndView.addObject("raceInfo",new RaceInfo());
		modelAndView.addObject("races",races);

		return modelAndView;
	}
	@RequestMapping(value = "/result")
	public ModelAndView processRaceInfo(RaceInfo raceInfo) {
		
		ModelAndView modelAndView = new ModelAndView();
		dao.insertRaceInfo(raceInfo);
		
		modelAndView.setViewName("raceInfoResult");
		modelAndView.addObject("r",raceInfo);
		return modelAndView;
	}
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		
		ModelAndView modelAndView = new ModelAndView();
		List<RaceInfo> allRaceInfo = dao.getAllRaceInfo();
		modelAndView.setViewName("viewAllRaceInfo");
		modelAndView.addObject("all",allRaceInfo);
		return modelAndView;
	}
	@Bean
	public RaceInfoDao dao() {
		RaceInfoDao bean = new RaceInfoDao();
		return bean;
	}
}
