package avaliacao1_20232.factory;

import avaliacao1_20232.http.HTTPProtocol;
import avaliacao1_20232.http.HTTPRequest;
import avaliacao1_20232.http.HTTPResponse;

public class HTTPFactory implements Factory {
    
    public void sendMessage() {
        
        HTTPProtocol http = new HTTPProtocol();

        http.open();
        http.message(new HTTPRequest(), new HTTPResponse());
        http.close();
    }
}
