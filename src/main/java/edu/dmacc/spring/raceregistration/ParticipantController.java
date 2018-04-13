package edu.dmacc.spring.raceregistration;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParticipantController {
	@Autowired ParticipantDao dao;
	
	private static final String [] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY","LA", "ME", "MD", "MA", "MI", "MN", "MS","MO", "MT", "NE", "NA", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN","TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};

	
	
		@RequestMapping(value = "/form") 
	public ModelAndView participant() {
		ModelAndView modelAndView = new ModelAndView();
	
		modelAndView.setViewName("participantForm");
		modelAndView.addObject("participant", new Participant());
		modelAndView.addObject("states", states);
		return modelAndView;
		
	}
				
	@RequestMapping(value = "/result")
	public ModelAndView processParticipant(Participant participant) {
		System.out.println("In processParticipant");
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Value in getLastName" +participant.getLastName());
		dao.insertParticipant(participant);
		modelAndView.setViewName("participantResult");
		modelAndView.addObject("p", participant);
		return modelAndView;
			
		}
	
	
	@RequestMapping(value = "/viewAll") 
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Participant> allParticipants = dao.getAllParticipants();
		modelAndView.setViewName("viewAllParticipants");
		System.out.println();
		modelAndView.addObject("all", allParticipants);
		return modelAndView;
	}
	
	
	@Bean
		public ParticipantDao dao() {
		ParticipantDao bean = new ParticipantDao();
			return bean;
	
	}
}
