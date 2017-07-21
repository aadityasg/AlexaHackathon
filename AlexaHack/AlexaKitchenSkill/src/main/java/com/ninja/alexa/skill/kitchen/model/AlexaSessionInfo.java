package com.ninja.alexa.skill.kitchen.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Alexa DynamoDB Model
 * 
 * @author rohagraw
 * @version 2017-07-21
 */
@DynamoDBTable(tableName = "ALEXA_SESSION_INFO")
public class AlexaSessionInfo {
	private String sessionId;
	private String stateType;
	private String stateInput;

	@DynamoDBHashKey(attributeName = "session_id")
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@DynamoDBAttribute(attributeName = "state_type")
	public String getStateType() {
		return stateType;
	}

	public void setStateType(String stateType) {
		this.stateType = stateType;
	}

	@DynamoDBAttribute(attributeName = "state_input")
	public String getStateInput() {
		return stateInput;
	}

	public void setStateInput(String stateInput) {
		this.stateInput = stateInput;
	}
}
