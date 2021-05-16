package drive;

import file.imagefile.GIFImageFile;
import file.imagefile.JPGImageFile;
import file.musicfile.MP3MusicFile;

import java.io.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);


}
