package com.ninja.alexa.skill.kitchen.utilities;

import com.amazonaws.annotation.Immutable;

/**
 * Application Constants
 * 
 * @author rohagraw
 * @version 2017-07-21
 */
@Immutable
public final class Constants {
	/* Crypto Constants */
	public static final String API_ENDPOINT = "http://food2fork.com/api/search?";
	public static final String API_KEY = "key=b4f8a48d092e117bd2e925295ef11a0f";
	public static final String API_QUERY = "&q=";

	/********** Constructor **********/
	private Constants() {
		/* Private Constructor */
	}
}
