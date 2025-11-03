package avaliacao1_20242.Evento;

import java.time.LocalDateTime;

public interface Evento {
    
    public abstract String getDescricao();
    public abstract LocalDateTime getInicio();
    public abstract LocalDateTime getFim();
    public abstract Integer getPrioridade();
    public abstract boolean getConcluido();
    public abstract String getGeolocalizazao();
}
