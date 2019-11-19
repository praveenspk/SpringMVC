package com.spk.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spk.model.Team;
import com.spk.service.TeamService;

public class TeamTest {

	@Autowired
	private static TeamService service;

	public static void main(String[] args) {
		//Team team = new Team(65, "jhgjcjsd", 30);
		List<Team> list = new ArrayList<Team>();
		list.add(new Team());
		// service.addTeam(team);
		System.out.println(list);

	}

}
