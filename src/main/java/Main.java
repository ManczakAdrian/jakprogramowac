import file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {

        MP3MusicFile mp3MusicFile = new MP3MusicFile("plik.mp3", 20,"Cool Kids","Butelki",20  );

        System.out.println(mp3MusicFile.getName());
    }

}
