package Adaptor;

public class AdaptorPatternDemo {
	public static void main(String[] args) {
		// Adapt AdvanceMediaPlayer to  MediaPlayer
		
		AudioPlayer audioPlayer =  new AudioPlayer();
		audioPlayer.play("vlc", "tune1");
		audioPlayer.play("mp3", "tune2");
		audioPlayer.play("mp4", "tune3");
		audioPlayer.play("mp5", "tune4");
	}
}
