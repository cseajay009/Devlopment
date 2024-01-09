package com.shrajan.structural.proxy;

public class ImageViewer {

	public static void main(String[] args) {
		  // Using proxy to load and display images
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image1 will be loaded from disk
        image1.display();
        // Image2 will be loaded from disk
        image2.display();
        // Image1 won't be loaded again, already cached by the proxy
        image1.display();

	}

}
