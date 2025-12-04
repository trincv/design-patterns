package avaliacao2_20241;

import java.time.LocalDateTime;

import avaliacao2_20241.interfaces.Component;
import avaliacao2_20241.models.Credential;
import avaliacao2_20241.models.File;
import avaliacao2_20241.models.Folder;
import avaliacao2_20241.proxy.ProxyFile;

public class Main {
    
    public static void main(String[] args) {
        
        Component file1 = new ProxyFile(new File("Settings", (long) 30, LocalDateTime.now()));
        Component file2 = new ProxyFile(new File("Config", (long) 20, LocalDateTime.now()));
        Component file3 = new ProxyFile(new File("Mp3", (long) 15, LocalDateTime.now()));

        Component folder1 = new Folder("Configurations");
        Component folder2 = new Folder("Music");

        Component folder3 = new Folder("System");

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        folder3.add(folder1);
        folder3.add(folder2);

        folder3.showDetails("");
        System.out.println(folder3.getSize() + " " + folder1.getSize() + " " + folder2.getSize());
        
        Credential c1 = new Credential("1234");
        Credential c2 = new Credential("5678");

        file1.ler(c1);
        file1.ler(c1);
        file1.ler(c2);
        file1.ler(c1);
        file1.ler(c1);

        file3.ler(c1);

    }

}
