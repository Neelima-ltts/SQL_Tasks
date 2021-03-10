package com.ltts.model;

public class Team {
	private int teamid;
	private String teamname;
	private String ownername;
	private String coachname;
	private int playerid;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public Team(int teamid, String teamname, String ownername, String coachname, int playerid) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.ownername = ownername;
		this.coachname = coachname;
		this.playerid = playerid;
	}
	public Team() {
		super();
	}
	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamname=" + teamname + ", ownername=" + ownername + ", coachname="
				+ coachname + ", playerid=" + playerid + "]";
	}
	
	
}
