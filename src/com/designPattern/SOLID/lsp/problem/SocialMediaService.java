package com.designPattern.SOLID.lsp.problem;

public abstract class SocialMediaService {

	//	WhatsApp, Facebook, Instagram
	public abstract void chatWithFriends();

	//	Facebook, Instagram
	public abstract void postMediaOnWall();

	//	WhatsApp, Facebook, Instagram
	public abstract void sendPhotosAndVideos();

	//	WhatsApp, Facebook
	public abstract void audioCalling();

	//	WhatsApp, Facebook
	public abstract void videoCalling();
}