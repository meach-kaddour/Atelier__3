package Atelier_2;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AudioRunner {
	public void playAudio(String cheminAudio) {
		try {
			File musicPath = new File(cheminAudio);
			if(musicPath.exists()) {
				AudioInputStream audioInput =AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				JOptionPane.showMessageDialog(null, "click to stop audio");
				
			}else {
				System.out.println("can't be find file");
			}
			
		}catch(Exception ex ){
			ex.printStackTrace(); 
		}
	}

	
}
