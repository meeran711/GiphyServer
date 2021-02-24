package com.lemon.giphy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.giphy.service.GiphyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/giphylookup")
class GiphyController {
	@Autowired
	private GiphyService giphyService;

	@GetMapping(path = "/gifs/trending")
	public String getAllTrendingGiphy(@RequestParam("offset") int offset) {
		return giphyService.getAllTrendingGiphy(offset);
	}

	@GetMapping(path = "/gifs/search")
	public String getAllSearchGiphy(@RequestParam("offset") int offset, @RequestParam("q") String searchString) {
		return giphyService.getSearchedForGiphy(searchString, offset);
	}
	
	@GetMapping(path = "/stickers/trending")
	public String getAllTrendingStickers(@RequestParam("offset") int offset) {
		return giphyService.getAllTrendingGiphy(offset);
	}

	@GetMapping(path = "/stickers/search")
	public String getAllSearchStickers(@RequestParam("offset") int offset, @RequestParam("q") String searchString) {
		return giphyService.getSearchedForStickers(searchString, offset);
	}

}
