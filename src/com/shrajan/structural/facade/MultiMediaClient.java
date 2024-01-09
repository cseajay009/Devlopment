package com.shrajan.structural.facade;

public class MultiMediaClient {

	public static void main(String[] args) {
		
		MultimediaFacade facade = new MultimediaFacade();
		facade.playAudio();
		facade.playVideo();
		facade.display();

	}

}
