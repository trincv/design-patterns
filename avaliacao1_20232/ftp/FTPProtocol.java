package avaliacao1_20232.ftp;

import avaliacao1_20232.interfaces.Protocol;

public class FTPProtocol extends Protocol {
    
    @Override
    public void open() {
        System.out.println("Abrindo protocolo FTP");
    }

    @Override
    public void close() {
        System.out.println("fechando protocolo FTP");
    }

}
