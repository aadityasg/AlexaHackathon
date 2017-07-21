package com.ninja.alexa.skill.kitchen.api;

import java.net.URI;
import java.util.Map;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.HttpMethodName;
import com.ninja.alexa.skill.kitchen.aws.handlers.AWSErrorHandler;
import com.ninja.alexa.skill.kitchen.aws.handlers.AWSResponseHandler;

/**
 * API Caller
 * 
 * @author rohagraw
 * @version 2017-07-21
 */
public class APICaller {
	private AmazonHttpClient httpClient = new AmazonHttpClient(new ClientConfiguration());

	/**
	 * Generate Request
	 * 
	 * @param queryString
	 * @return Request<?>
	 */
	public Request<?> generateRequest(final String endpoint, final URI queryString, Map<String, String> headers) {
		Request<?> request = new DefaultRequest<>(endpoint);
		request.setHeaders(headers);
		request.setEndpoint(queryString);
		request.setHttpMethod(HttpMethodName.GET);
		return request;
	}

	/**
	 * Send Request
	 * 
	 * @param request
	 * @return Response<String>
	 */
	public Response<String> sendRequest(final Request<?> request) {
		return httpClient.requestExecutionBuilder().request(request).errorResponseHandler(new AWSErrorHandler())
				.execute(new AWSResponseHandler());
	}
}
