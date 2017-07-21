package com.ninja.alexa.skill.kitchen.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input Model
 * 
 * @author rohagraw
 * @version 2017-07-21
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InputEvent {
	@JsonProperty("session")
	private Session session;

	@JsonProperty("request")
	private Request request;

	@JsonProperty("version")
	private String version;

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public final class Session {
		@JsonProperty("sessionId")
		private String sessionId;

		@JsonProperty("application")
		private Application application;

		@JsonProperty("attributes")
		private Attributes attributes;

		@JsonProperty("user")
		private User user;

		@JsonProperty("new")
		private boolean sessionType;

		public String getSessionId() {
			return sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public Application getApplication() {
			return application;
		}

		public void setApplication(Application application) {
			this.application = application;
		}

		public Attributes getAttributes() {
			return attributes;
		}

		public void setAttributes(Attributes attributes) {
			this.attributes = attributes;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public boolean isSessionType() {
			return sessionType;
		}

		public void setSessionType(boolean sessionType) {
			this.sessionType = sessionType;
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public final class Application {
			@JsonProperty("applicationId")
			private String applicationId;

			public String getApplicationId() {
				return applicationId;
			}

			public void setApplicationId(String applicationId) {
				this.applicationId = applicationId;
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public final class Attributes {
			private String attr;

			public String getAttr() {
				return attr;
			}

			public void setAttr(String attr) {
				this.attr = attr;
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public final class User {
			@JsonProperty("userId")
			private String userId;

			public String getUserId() {
				return userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public final class Request {
		@JsonProperty("type")
		private String type;

		@JsonProperty("requestId")
		private String requestId;

		@JsonProperty("locale")
		private String locale;

		@JsonProperty("timestamp")
		private String timestamp;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRequestId() {
			return requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getLocale() {
			return locale;
		}

		public void setLocale(String locale) {
			this.locale = locale;
		}

		public String getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
	}
}
