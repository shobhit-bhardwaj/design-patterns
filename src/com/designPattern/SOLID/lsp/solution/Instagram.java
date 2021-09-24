package com.designPattern.SOLID.lsp.solution;

public class Instagram extends SocialMediaService implements PostMediaManager {

	@Override
	public void chatWithFriends() {
		System.out.println("Chatting is supported by Instagram");
	}

	@Override
	public void postMediaOnWall() {
		System.out.println("Post on Wall is supported by Instagram");
	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("Photoes and Videos Sending is supported by Instagram");
	}
}