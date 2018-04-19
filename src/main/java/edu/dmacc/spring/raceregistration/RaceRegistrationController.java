package edu.dmacc.spring.raceregistration;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class RaceRegistrationController {
	@Autowired ParticipantDao dao;
	@Autowired RaceInfoDao dao1;
	
	private static final String[] races = {"5k", "10k", "Half Marathon", "Full Marathon"};
	private static final String [] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY","LA", "ME", "MD", "MA", "MI", "MN", "MS","MO", "MT", "NE", "NA", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN","TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
	private static final ParticipantDao raceInfo = null;

	
	
		@RequestMapping(value = "/form") 
	public ModelAndView participant() {
		ModelAndView modelAndView = new ModelAndView();
	
		modelAndView.setViewName("/participantForm");
		modelAndView.addObject("participant", new Participant());
		modelAndView.addObject("states", states);
		return modelAndView;
		
	}
		@RequestMapping(value="/raceInfoForm")
		public ModelAndView raceInfo() {
			ModelAndView modelAndView = new ModelAndView();

			modelAndView.setViewName("raceInfoForm");
			modelAndView.addObject("raceInfo",new RaceInfo());
			modelAndView.addObject("races",races);

			return modelAndView;
		}
		@RequestMapping(value = "/registerForRaceForm") 
		public ModelAndView registerdParticipant() {
			RaceInfo race = dao.findId(Id);
			Participant participant = dao.findId(Id);
			raceInfo.getAllParticipants().add(participant);
			participant.getAllRaceInfo).add(raceInfo);
			dao.add(raceInfo);
			dao.add(participant);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("/registerForRaceForm");

			List<Participant> allParticipants = dao.getAllParticipants();
			modelAndView.addObject("all", allParticipants);
			modelAndView.addObject("registeredParticipant", new Participant());
			modelAndView.addObject("states", states);
			return modelAndView;
		}
		
				
		/*
		
		
		@RequestMapping(value = "/registerForRaceForm") 
		public ModelAndView registerForRace() {
			String act=request.getParameter("doThisToRaceInfo");
			ModelAndView modelAndView = new ModelAndView();
			if(act=("Register for Race")) {
				String checkId=request.getParameter("Id");
				if(checkId==null) {
				modelAndView.setViewName("raceNotChosen");
				return modelAndView;
				
				}
				Integer tempId=Integer.parseInt(request.getParameter("Id"));
						
				
			}
		
			modelAndView.setViewName("/registerForRaceForm");
			modelAndView.addObject("registerForRace", new Participant());
			modelAndView.addObject("states", states);
			return modelAndView;*/
		
			
		
		
		@RequestMapping(value = "/menu")
		public ModelAndView main() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("mainMenu");
			return modelAndView;

		}		
	@RequestMapping(value = "/result")
	public ModelAndView processParticipant(Participant participant) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		dao.insertParticipant(participant);
		modelAndView.setViewName("participantResult");
		modelAndView.addObject("p", participant);
		return modelAndView;
			
		}
	@RequestMapping(value = "/raceInfoResult")
	public ModelAndView processRaceInfo(RaceInfo raceInfo) {
		
		ModelAndView modelAndView = new ModelAndView();
		dao1.insertRaceInfo(raceInfo);
		
		modelAndView.setViewName("raceInfoResult");
		modelAndView.addObject("r",raceInfo);
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAllParticipants") 
	public ModelAndView viewAllParticipants() {
		ModelAndView modelAndView = new ModelAndView();
		List<Participant> allParticipants = dao.getAllParticipants();
		modelAndView.setViewName("viewAllParticipants");
		System.out.println();
		modelAndView.addObject("all", allParticipants);
		return modelAndView;
	}
	@RequestMapping(value = "/viewAllRaceInfo")
	public ModelAndView viewAllRaceInfo() {
		
		ModelAndView modelAndView = new ModelAndView();
		List<RaceInfo> allRaceInfo = dao1.getAllRaceInfo();
		modelAndView.setViewName("viewAllRaceInfo");
		modelAndView.addObject("all",allRaceInfo);
		return modelAndView;
	}
	
	@Bean
		public ParticipantDao dao() {
		ParticipantDao bean = new ParticipantDao();
			return bean;
	
	}
	@Bean
	public RaceInfoDao dao1() {
		RaceInfoDao bean = new RaceInfoDao();
		return bean;
	}
}
