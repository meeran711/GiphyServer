package com.lemon.giphy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GiphyConfig {
	
	@Value("${giphy.api}")
	private String giphyApi;
	@Value("${giphy.path.trending_gifs}")
	private String trendingGifs;
	@Value("${giphy.path.trending_stickers}")
	private String trendingStickers;
	@Value("${giphy.path.search_gifs}")
	private String searchGifs;
	@Value("${giphy.path.search_stickers}")
	private String searchStickers;
	@Value("${giphy.key}")
	private String apiKey;
	
	/**
	 * @return the giphyApi
	 */
	public String getGiphyApi() {
		return giphyApi;
	}
	/**
	 * @param giphyApi the giphyApi to set
	 */
	public void setGiphyApi(String giphyApi) {
		this.giphyApi = giphyApi;
	}
	/**
	 * @return the trendingGifs
	 */
	public String getTrendingGifs() {
		return trendingGifs;
	}
	/**
	 * @param trendingGifs the trendingGifs to set
	 */
	public void setTrendingGifs(String trendingGifs) {
		this.trendingGifs = trendingGifs;
	}
	/**
	 * @return the trendingStickers
	 */
	public String getTrendingStickers() {
		return trendingStickers;
	}
	/**
	 * @param trendingStickers the trendingStickers to set
	 */
	public void setTrendingStickers(String trendingStickers) {
		this.trendingStickers = trendingStickers;
	}
	/**
	 * @return the searchGifs
	 */
	public String getSearchGifs() {
		return searchGifs;
	}
	/**
	 * @param searchGifs the searchGifs to set
	 */
	public void setSearchGifs(String searchGifs) {
		this.searchGifs = searchGifs;
	}
	/**
	 * @return the searchStickers
	 */
	public String getSearchStickers() {
		return searchStickers;
	}
	/**
	 * @param searchStickers the searchStickers to set
	 */
	public void setSearchStickers(String searchStickers) {
		this.searchStickers = searchStickers;
	}
	/**
	 * @return the apiKey
	 */
	public String getApiKey() {
		return apiKey;
	}
	/**
	 * @param apiKey the apiKey to set
	 */
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}	

}
