package com.designPattern.SOLID.lsp.problem;

public class Facebook extends SocialMediaService {

	@Override
	public void chatWithFriends() {
		System.out.println("Chatting is supported by Facebook");
	}

	@Override
	public void postMediaOnWall() {
		System.out.println("Post on Wall is supported by Facebook");
	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("Photoes and Videos Sending is supported by Facebook");
	}

	@Override
	public void audioCalling() {
		System.out.println("Audio Calling is supported by Facebook");
	}

	@Override
	public void videoCalling() {
		System.out.println("Video Calling is supported by Facebook");
	}
}