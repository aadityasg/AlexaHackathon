package com.ninja.alexa.skill.kitchen.aws.handlers;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.util.IOUtils;

/**
 * AWS Response Handler
 * 
 * @author rohagraw
 * @version 2017-07-21
 */
public class AWSResponseHandler implements HttpResponseHandler<String> {
	/************************************* Override(s) **************************************/
	@Override
	public String handle(HttpResponse response) throws Exception {
		try (InputStream responseStream = response.getContent()) {
			return IOUtils.toString(responseStream);
		} catch (IOException ex) {
			throw new IOException(ex);
		}
	}

	@Override
	public boolean needsConnectionLeftOpen() {
		return true;
	}
}