package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ltts.config.MyConnection;
import com.ltts.model.Team;

public class TeamDao {
	//Connection con= MyConnection.getConnection();
	
	public void showTeam() throws SQLException
	{
		
		Connection mc= MyConnection.getConnection();
		Statement st=mc.createStatement();
		ResultSet rs=st.executeQuery("select * from team");
		System.out.println("TeamId\tTeamName\tOwnerName\tCoachName\tPlayerId");

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
		}
mc.close();
		
	}
	
	public void insertTeam(Team t) throws SQLException
	{
		Connection mc= MyConnection.getConnection();
		//Statement st=mc.createStatement();
		PreparedStatement ps=mc.prepareStatement("insert into team values(?,?,?,?,?)");
		ps.setInt(1,t.getTeamid());
		ps.setString(2,t.getTeamname());
		ps.setString(3,t.getOwnername());
		ps.setString(4,t.getCoachname());
		ps.setInt(5, t.getPlayerid());
		int i=ps.executeUpdate();
		System.out.println("No of rows effected - "+i);
	}
	public void updateTeam(String sql) throws SQLException
	{
		Connection mc= MyConnection.getConnection();
		Statement st=mc.createStatement();
		int count=st.executeUpdate(sql);
		System.out.println("no of rows updated - "+count);
	}
	public void deleteTeam(String sql) throws SQLException
	{
		Connection mc= MyConnection.getConnection();
		Statement st=mc.createStatement();
		int count=st.executeUpdate(sql);
		System.out.println("no of rows deleted - "+count);
	}

}