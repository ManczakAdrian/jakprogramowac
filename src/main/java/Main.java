import drive.Drive;
import drive.HDDDrive;
import drive.SSDDrive;
import file.imagefile.GIFImageFile;
import file.imagefile.JPGImageFile;
import file.musicfile.MP3MusicFile;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File gif1 = new File("nazwa1.gif", String.valueOf(100));
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marelin Manson", "Broken", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);

    drive.listFiles();
       // File file = drive.findFile("nazwa1.gif");

    }

}
