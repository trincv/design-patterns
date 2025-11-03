package avaliacao1_20242.Evento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Partida extends AbstractEvento {
    
    private Equipe equipeA;
    private Equipe equipeB;
    private Integer pontuacaoA;
    private Integer pontuacaoB;

    public Partida(String descricao, LocalDateTime inicio, LocalDateTime fim, Integer prioridade, boolean concluido, String geolocalizacao,
                   Equipe equipeA, Equipe equipeB, Integer pontuacaoA, Integer pontuacaoB) 
    {
        super(descricao, inicio, fim, prioridade, concluido, geolocalizacao);
        this.equipeA = equipeA;
        this.equipeB = equipeB;
        this.pontuacaoA = pontuacaoA;
        this.pontuacaoB = pontuacaoB;
    }

    public void display() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("inicio: " + this.getInicio().format(fmt));
        System.out.println("fim: " + this.getFim().format(fmt));
        System.out.println("equipeA: " + this.equipeA.getEquipeNome());
        System.out.println("equipeB: " + this.equipeB.getEquipeNome());
        System.out.println("concluido: " + this.getConcluido());
        System.out.println("prioridade: " + this.getPrioridade());
        System.out.println("placar (A x B): " + this.pontuacaoA + " x " + this.pontuacaoB);
    }

}
