package com.shrajan.structural.facade;

public class MultimediaFacade {
	
	private AudioPlayer audioService;
	private VideoPlayer videoService;
	private DisplaySystem display;
	
	
	public MultimediaFacade() {
		audioService = new AudioPlayer();
		videoService = new VideoPlayer();
		display =  new DisplaySystem();
	}

	
	public void playAudio() {
		audioService.playAudio();
	}

	
	public void playVideo() {
		videoService.playVideo();
	}
	
	public void display() {
		display.display();
	}
}
