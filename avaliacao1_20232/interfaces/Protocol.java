package avaliacao1_20232.interfaces;

public abstract class Protocol {
    
   public void message(Request request, Response response) {
        System.out.println(request.toString() + response.toString());
    }

    public abstract void open();
    public abstract void close();

}
