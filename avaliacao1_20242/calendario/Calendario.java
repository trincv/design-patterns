package avaliacao1_20242.calendario;

public abstract class Calendario {
    
    private short mes;
    private Integer ano;
    private boolean notificacaoHabilitada;
    private String emailProprietario;
    private String type;

    public Calendario(short mes, Integer ano, boolean notificacaoHabilitada, String emailProprietario, String type) {
        this.ano = ano;
        this.emailProprietario = emailProprietario;
        this.mes = mes;
        this.notificacaoHabilitada = notificacaoHabilitada;
        this.type = type;
    }

    public void download() {
        System.out.println("Downloading calendar: " + this.emailProprietario);
    }
}
