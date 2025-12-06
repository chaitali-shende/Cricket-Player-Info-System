package com.cricket.model;

public class Player {

	private int id;
	private String name;
	private int yearsNumber;
	private String teamName;

	public Player(int id, String name, int yearsNumber, String teamName) {
		this.id = id;
		this.name = name;
		this.yearsNumber = yearsNumber;
		this.teamName = teamName;
	}

	// VALIDATION LOGIC
	public String validate() {
		if (id <= 0)
			return "❌ Player ID must be positive!";
		if (name == null || name.trim().isEmpty())
			return "❌ Player Name cannot be empty!";
		if (yearsNumber < 0)
			return "❌ Years Number cannot be negative!";
		if (teamName == null || teamName.trim().isEmpty())
			return "❌ Team Name cannot be empty!";
		return "OK";
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYearsNumber() {
		return yearsNumber;
	}

	public String getTeamName() {
		return teamName;
	}
}
