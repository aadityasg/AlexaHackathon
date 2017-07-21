package com.ninja.alexa.skill.kitchen.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alexa Intent Model
 * 
 * @author rohagraw
 * @version 2017-07-21
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlexaIntent {
	@JsonProperty("intents")
	private IntentDetails intents;

	public AlexaIntent() {
		/* Constructor */
	}

	public IntentDetails getIntents() {
		return intents;
	}

	public void setIntents(IntentDetails intents) {
		this.intents = intents;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public final class IntentDetails {
		@JsonProperty("intent")
		private String intent;

		public IntentDetails() {
			/* Constructor */
		}

		public String getIntent() {
			return intent;
		}

		public void setIntent(String intent) {
			this.intent = intent;
		}
	}
}
