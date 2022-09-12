import java.sql.Time;
import java.util.Date;

public class Mensagem {

    private Integer idMensagem;
    private String mensagem;
    private Date dataEnvio;
    private Time horaEnvio;
    private Solicitante remetenteMensagem;
    private Chat idChat;

}
