package avaliacao1_20242.builder;

import java.time.LocalDateTime;

import avaliacao1_20242.Evento.AbstractEvento;
import avaliacao1_20242.Evento.Equipe;
import avaliacao1_20242.Evento.Partida;

public class PartidaBuilder implements Builder {
    
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Integer prioridade;
    private boolean concluido;
    private String geolocalizacao;
    private Integer pontuacaoA;
    private Integer pontuacaoB;

    public PartidaBuilder init() {

        this.pontuacaoA = 0;
		this.pontuacaoB = 0;
		
		this.inicio = LocalDateTime.now();
		this.fim = null;
		this.geolocalizacao = "Salvador";
		this.concluido = false;

		this.prioridade = 5;
		
		return this;
    }

    public PartidaBuilder setInicio(LocalDateTime inicio) { 
        this.inicio = inicio; 
        return this;
    }
    public PartidaBuilder setFim(LocalDateTime fim) { 
        this.fim = fim; 
        return this;
    }
    public PartidaBuilder setPrioridade(Integer prioridade) { 
        this.prioridade = prioridade; 
        return this;
    }
    public PartidaBuilder setConcluido(boolean concluido) { 
        this.concluido = concluido; 
        return this;
    }
    public PartidaBuilder setGeolocalizazao(String geolocalizacao) { 
        this.geolocalizacao = geolocalizacao; 
        return this;
    }
    public PartidaBuilder setPontuacao(Integer pontuacaoA, Integer pontuacaoB) {
        this.pontuacaoA = pontuacaoA; 
        this.pontuacaoB = pontuacaoB; 
        return this;
    }

    public Partida build(String descricao, Equipe equipeA, Equipe equipeB) {
        return new Partida(descricao, inicio, fim, prioridade, concluido, descricao, equipeA, equipeB, pontuacaoA, pontuacaoB);
    }
    
}
