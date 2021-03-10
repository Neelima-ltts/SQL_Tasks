package com.ltts.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.config.MyConnection;
import com.ltts.model.Player;

public class PlayerDao {
	
	public List<Player> getAllPlayers() throws SQLException
	{
		List<Player> li=new ArrayList<Player>(); 
		@SuppressWarnings("unused")
		Connection mc= MyConnection.getConnection();
		
		return li;
		
	}
	public Player getPlayerById(int id)
	{
		Player p=new Player();
		
		return p;
		
	}
	public void showPlayer() throws SQLException
	{
		    Connection mc=MyConnection.getConnection();
			Statement st=mc.createStatement();
			ResultSet rs=st.executeQuery("select * from player");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDate(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t"+rs.getInt(10)+"\t"+rs.getInt(11)+"\t"+rs.getInt(12));
			}

			mc.close();
	}
	public boolean insertPlayer(Player p) throws SQLException
	{
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayerid());
		ps.setString(2, p.getPlayername());
		ps.setDate(3,(Date)p.getDob());
		ps.setInt(4,p.getAge());
		ps.setString(5,p.getEmailid());
		ps.setString(6,p.getCountry());
		ps.setString(7,p.getSkill());
		ps.setString(8,p.getBatStyle());
		ps.setString(9,p.getBowlStyle());
		ps.setInt(10,p.getMatches());
		ps.setInt(11,p.getRuns());
		ps.setInt(12,p.getWickets());
		return ps.execute();
		
	}
	public void updatePlayer(String sql) throws SQLException
	{
		Connection mc= MyConnection.getConnection();
		PreparedStatement ps= mc.prepareStatement("UPDATE player SET playername=? WHERE player_id=?");
		int count=ps.executeUpdate(sql);
	}
	public void deletePlayer(String sql) throws SQLException
	{
		Connection mc= MyConnection.getConnection();
		Statement st=mc.createStatement();
		int count=st.executeUpdate(sql);
	}
}
