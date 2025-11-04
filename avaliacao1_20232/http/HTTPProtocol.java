package avaliacao1_20232.http;

import avaliacao1_20232.interfaces.Protocol;

public class HTTPProtocol extends Protocol {
    
    @Override
    public void open() {
        System.out.println("Abrindo protocolo HTTP");
    }

    @Override
    public void close() {
        System.out.println("fechando protocolo HTTP");
    }

}
