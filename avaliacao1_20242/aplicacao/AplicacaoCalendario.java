package avaliacao1_20242.aplicacao;

import java.time.LocalDateTime;

import avaliacao1_20242.Evento.Equipe;
import avaliacao1_20242.Evento.Partida;
import avaliacao1_20242.builder.PartidaBuilder;
import avaliacao1_20242.calendario.Calendario;

public abstract class AplicacaoCalendario {
    
    public void run1() {

        Calendario calendario = createCalendario();
        calendario.download();

    }

    public void run2() {
        Partida partida = new PartidaBuilder().init()
                                     .setConcluido(true)
                                     .setInicio(LocalDateTime.of(1970, 6, 21, 12, 00))
                                     .setFim(LocalDateTime.of(1970, 6, 21, 14, 00))
                                     .setGeolocalizazao("Cidade México")
                                     .setPontuacao(4,1)
                                     .build("Final da Copa do Mundo de 1970", new Equipe("Brasil"), new Equipe("Itália"));

        partida.display();
    }

    public void run() {
        this.run1();
        this.run2();
    }

    protected abstract Calendario createCalendario();

}
