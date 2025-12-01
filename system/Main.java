package system;

import system.implementations.File;
import system.implementations.Folder;
import system.interfaces.FileSystemComponent;

public class Main {
    public static void main(String[] args) {
        
        FileSystemComponent file1 = new File("Settings.txt");
        FileSystemComponent file2 = new File("Logo.png");
        FileSystemComponent file3 = new File("Music.mp3");

        FileSystemComponent mediaFolder = new Folder("Media");
        mediaFolder.addChild(file2);
        mediaFolder.addChild(file3);

        FileSystemComponent rootFolder = new Folder("Root");
        rootFolder.addChild(file1);
        rootFolder.addChild(mediaFolder);

        rootFolder.showDetails("");

    }
}
