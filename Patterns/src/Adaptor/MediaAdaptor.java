package Adaptor;

public class MediaAdaptor implements MediaPlayer{
private AdvanceMediaPlayer advanceMediaAdaptor;

public MediaAdaptor(String audioType) {
	if(audioType.equals("vlc")){
		advanceMediaAdaptor =  new VlcPlayer();
	}else{
		if(audioType.equals("mp4")){
			advanceMediaAdaptor = new Mp4Player();
		}
	}
}

@Override
public void play(String audioType, String fileName) {
	if(audioType.equals("vlc")){
		advanceMediaAdaptor.playVlc(fileName);
	}else{
		if(audioType.equals("mp4")){
			advanceMediaAdaptor.playMp4(fileName);
		}
	}
}

}
