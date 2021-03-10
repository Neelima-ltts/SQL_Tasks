package com.ltts.model;

import java.sql.Date;

public class Player {
	private int playerid;
	private String playername;
	private Date dob;
	private int age;
	private String emailid;
	private String country;
	private String skill;
	private String batStyle;
	private String bowlStyle;
	private int matches;
	private int runs;
	private int wickets;
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getBatStyle() {
		return batStyle;
	}
	public void setBatStyle(String batStyle) {
		this.batStyle = batStyle;
	}
	public String getBowlStyle() {
		return bowlStyle;
	}
	public void setBowlStyle(String bowlStyle) {
		this.bowlStyle = bowlStyle;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public Player(int playerid, String playername, Date dob, int age, String emailid, String country, String skill,
			String batStyle, String bowlStyle, int matches, int runs, int wickets) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.dob = dob;
		this.age = age;
		this.emailid = emailid;
		this.country = country;
		this.skill = skill;
		this.batStyle = batStyle;
		this.bowlStyle = bowlStyle;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}
	public Player() {
		super();
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", dob=" + dob + ", age=" + age
				+ ", emailid=" + emailid + ", country=" + country + ", skill=" + skill + ", batStyle=" + batStyle
				+ ", bowlStyle=" + bowlStyle + ", matches=" + matches + ", runs=" + runs + ", wickets=" + wickets + "]";
	}
	
}
