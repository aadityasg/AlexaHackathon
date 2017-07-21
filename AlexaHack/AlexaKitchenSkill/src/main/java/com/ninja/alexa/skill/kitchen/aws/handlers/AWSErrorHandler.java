package com.ninja.alexa.skill.kitchen.aws.handlers;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;

/**
 * AWS Error Handler
 * 
 * @author rohagraw
 * @version 2017-07-21
 */
public class AWSErrorHandler implements HttpResponseHandler<AmazonServiceException> {
	/************************************* Override(s) **************************************/
	@Override
	public AmazonServiceException handle(HttpResponse response) {
		AmazonServiceException amazonServiceException = new AmazonServiceException("Service Exception");
		amazonServiceException.setStatusCode(response.getStatusCode());
		amazonServiceException.setErrorCode(response.getStatusText());
		return amazonServiceException;
	}

	@Override
	public boolean needsConnectionLeftOpen() {
		return false;
	}
}
