package bomberman;

import javafx.scene.media.*;
import javafx.scene.shape.Path;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

public class Sound  {

    public static void playSound(String fileName) {
        String path = (System.getProperty("user.dir") + "\\src\\bomberman\\sound\\" + fileName + ".wav");

        try {
            File file = new File(path);
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
            clip.open(inputStream);
            clip.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loopSound(String fileName) {
        String path = (System.getProperty("user.dir") + "\\src\\bomberman\\sound\\" + fileName + ".wav");

        try {
            File file = new File(path);
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
            clip.open(inputStream);

            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopSound() {
        
    }

    public static void ThemeSound() { loopSound("StageTheme"); }
    public static void PlayerDead() { playSound("GameOver"); }
    public static void Walking() { playSound("Walk");}
    public static void PlaceBomb() { playSound("PlacedBomb");}
    public static void Explode() { playSound("Explode");}
    public static void PowerUp() { playSound("PowerUp");}
    public static void EnemyKill() { playSound("EnemyKill");}
}
