package com.cricket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.config.PlayerConfig;
import com.cricket.model.Player;

@Service
public class PlayerService {
	@Autowired
	private PlayerConfig playerConfig;

	public void displayPlayerInfo() {
		Player player = new Player(playerConfig.getPlayerId(), playerConfig.getPlayerName(),
				playerConfig.getYearsNumber(), playerConfig.getTeamName());
		String validationResult = player.validate();

		if (!validationResult.equals("OK")) {
			System.out.println("⚠ Validation Failed: " + validationResult);
			return;
		}
		System.out.println("Player Information:");
		System.out.println("Player ID      : " + playerConfig.getPlayerId());
		System.out.println("Player Name    : " + playerConfig.getPlayerName());
		System.out.println("Years Number   : " + playerConfig.getYearsNumber());
		System.out.println("Team Name      : " + playerConfig.getTeamName());
	}
}
