package file.imagefile;

import file.File;
import file.FileType;

public class JPGImageFile extends AbstractImageFile {

   private int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name,size);// jeżeli odwołujemy się do konstruktora klasy bazowej to musi to być pierwsza instrukcja w konstruktorze

        this.compression = compression;
    }

    public int getCompression() {

        return compression;
    }
    public void displayImage() {
        System.out.println("Displaying JPG");

    }
}
