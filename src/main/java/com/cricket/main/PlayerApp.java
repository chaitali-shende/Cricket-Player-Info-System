package com.cricket.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cricket.config.AppConfig;
import com.cricket.service.PlayerService;

public class PlayerApp {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);) {

			PlayerService service = context.getBean(PlayerService.class);

			service.displayPlayerInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
