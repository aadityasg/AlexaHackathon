package com.ninja.alexa.skill.kitchen.aws.services;

import java.util.List;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.ninja.alexa.skill.kitchen.model.AlexaSessionInfo;

/**
 * DynamoDB Service
 * 
 * @author rohagraw
 * @version 2017-07-11
 */
public class DynamoDBService {
	private DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(
			AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_EAST_1).build());

	/**
	 * Insert Entry Into DynamoDB Table
	 * 
	 * @param creativeEventLogDetails
	 */
	public void insertEntry(final AlexaSessionInfo alexaSessionInfo) {
		dynamoDBMapper.save(alexaSessionInfo);
	}

	/**
	 * Get Entry From DynamoDB Table
	 * 
	 * @param tableName
	 * @return item
	 */
	public List<AlexaSessionInfo> getEntry(final AlexaSessionInfo alexaSessionInfo) {
		return dynamoDBMapper.query(AlexaSessionInfo.class,
				new DynamoDBQueryExpression<AlexaSessionInfo>().withHashKeyValues(alexaSessionInfo));
	}
}
