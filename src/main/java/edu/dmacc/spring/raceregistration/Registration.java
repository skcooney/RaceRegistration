package edu.dmacc.spring.raceregistration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "participant_id")
	private Participant participant;
	@ManyToOne
	@JoinColumn(name = "raceInfo_id")
	private RaceInfo raceInfo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	public RaceInfo getRaceInfo() {
		return raceInfo;
	}
	public void setRaceInfo(RaceInfo raceInfo) {
		this.raceInfo = raceInfo;
	}
}



