import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

// The game launcher
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();

        LoVBoardGame loVBoardGame = LoVBoardGame.getLoVBoardInstance();
        loVBoardGame.playGame();
    }
}