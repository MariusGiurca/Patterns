package Adaptor;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String filename) {
		System.out.println("Playing vlc file. Name: "+ filename);		
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		
	}
	
}
