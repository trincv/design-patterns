package avaliacao1_20242.aplicacao;

import avaliacao1_20242.calendario.Calendario;
import avaliacao1_20242.calendario.CalendarioPessoal;

public class Aplicacao extends AplicacaoCalendario {
    
    @Override
    protected Calendario createCalendario() {
        return new CalendarioPessoal((short) 10, (Integer) 2025, true, "Luiz@gmail.com", "Pessoal");
    }
}
