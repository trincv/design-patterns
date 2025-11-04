package avaliacao1_20232.factory;

import avaliacao1_20232.ftp.FTPProtocol;
import avaliacao1_20232.ftp.FTPRequest;
import avaliacao1_20232.ftp.FTPResponse;

public class FTPFactory implements Factory {
    
    public void sendMessage() {
        
        FTPProtocol ftp = new FTPProtocol();

        ftp.open();
        ftp.message(new FTPRequest(), new FTPResponse());
        ftp.close();
    }
}
