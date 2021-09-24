package com.designPattern.SOLID.lsp.problem;

public class WhatsApp extends SocialMediaService {

	@Override
	public void chatWithFriends() {
		System.out.println("Chatting is supported by WhatsApp");
	}

	@Override
	public void postMediaOnWall() {
		// NOT SUPPORTED
	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("Photoes and Videos Sending is supported by WhatsApp");
	}

	@Override
	public void audioCalling() {
		System.out.println("Audio Calling is supported by WhatsApp");
	}

	@Override
	public void videoCalling() {
		System.out.println("Video Calling is supported by WhatsApp");
	}
}