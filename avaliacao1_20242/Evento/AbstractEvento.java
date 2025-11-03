package avaliacao1_20242.Evento;

import java.time.LocalDateTime;

public abstract class AbstractEvento implements Evento {
    
    private String descricao;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Integer prioridade;
    private boolean concluido;
    private String geolocalizacao;

    public AbstractEvento(String descricao, LocalDateTime inicio, LocalDateTime fim, Integer prioridade, boolean concluido, String geolocalizacao) {
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        this.prioridade = prioridade;
        this.concluido = concluido;
        this.geolocalizacao = geolocalizacao;
    }

    @Override
    public String getDescricao() { return this.descricao; }

    @Override
    public LocalDateTime getInicio() { return this.inicio; }

    @Override
    public LocalDateTime getFim() { return this.fim; }

    @Override
    public Integer getPrioridade() { return this.prioridade; }

    @Override
    public boolean getConcluido() { return this.concluido; }

    @Override
    public String getGeolocalizazao() { return this.geolocalizacao; }

}
