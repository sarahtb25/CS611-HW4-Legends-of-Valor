import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/*
    To play a soundtrack while the game is being played.
    Adapted from: https://www.geeksforgeeks.org/play-audio-file-using-java/
 */
public class AudioPlayer {
    private final Clip clip;
    private static final String FILE_PATH = "src/PiratesOfTheCaribbeanSoundtrack.wav";

    public AudioPlayer() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        File musicFile = new File(FILE_PATH).getAbsoluteFile();

        // create AudioInputStream object
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);

        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void play() {
        clip.start();
    }
}
