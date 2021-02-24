package com.lemon.giphy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.lemon.giphy.config.GiphyConfig;

@Service
public class GiphyService {
	@Autowired
	GiphyConfig giphyConfig;
	@Autowired
	RestTemplate restTemplate;

	public String getAllTrendingGiphy(int offset) {
		return restTemplate.getForObject("http://" + giphyConfig.getGiphyApi() + "/" + giphyConfig.getTrendingGifs()
				+ "?api_key=" + giphyConfig.getApiKey() + "&limit=20&offset=" + offset, String.class);
	}

	public String getAllTrendingStickers(int offset) {
		return restTemplate.getForObject("http://" + giphyConfig.getGiphyApi() + "/" + giphyConfig.getTrendingStickers()
				+ "?api_key=" + giphyConfig.getApiKey() + "&limit=20&offset=" + offset, String.class);
	}

	public String getSearchedForGiphy(String q, int offset) {
		return restTemplate.getForObject("http://" + giphyConfig.getGiphyApi() + "/" + giphyConfig.getSearchGifs()
				+ "?api_key=" + giphyConfig.getApiKey() + "&limit=20&offset=" + offset + "&q=" + q, String.class);
	}

	public String getSearchedForStickers(String q, int offset) {
		return restTemplate.getForObject("http://" + giphyConfig.getGiphyApi() + "/" + giphyConfig.getSearchStickers()
				+ "?api_key=" + giphyConfig.getApiKey() + "&limit=20&offset=" + offset + "&q=" + q, String.class);
	}

}
