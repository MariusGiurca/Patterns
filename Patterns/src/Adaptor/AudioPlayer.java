package Adaptor;

public class AudioPlayer implements MediaPlayer {
	private MediaAdaptor mediaAdaptor;
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("mp3")){
			System.out.println("Playing mp3 file. Name: "+ fileName);
		}else{
			if(audioType.equals("vlc") || audioType.equals("mp4")){
				mediaAdaptor =  new MediaAdaptor(audioType);
				mediaAdaptor.play(audioType, fileName);
			}else{
				System.out.println("Invalid media " + audioType + " not supported");
			}
		}
	}
}
