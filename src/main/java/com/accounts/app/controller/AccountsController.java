package com.accounts.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class AccountsController {

	@Value("${build.version:default_version}")
	private String version;

	@GetMapping("/getAppVersion")
	public String getAppVersion() {
		System.out.println("Inside accounts method."+version);
		return version;
	}
}
