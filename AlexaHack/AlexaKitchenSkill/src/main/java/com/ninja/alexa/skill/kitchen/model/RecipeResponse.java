package com.ninja.alexa.skill.kitchen.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recipe Model
 * 
 * @author rohagraw
 * @version 2017-07-21
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeResponse {
	@JsonProperty("count")
	private long count;

	@JsonProperty("recipes")
	private List<Recipes> recipes;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<Recipes> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipes> recipes) {
		this.recipes = recipes;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Recipes {
		@JsonProperty("title")
		private String title;

		@JsonProperty("source_url")
		private String sourceURL;

		@JsonProperty("social_rank")
		private String socialRank;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSourceURL() {
			return sourceURL;
		}

		public void setSourceURL(String sourceURL) {
			this.sourceURL = sourceURL;
		}

		public String getSocialRank() {
			return socialRank;
		}

		public void setSocialRank(String socialRank) {
			this.socialRank = socialRank;
		}
	}
}
