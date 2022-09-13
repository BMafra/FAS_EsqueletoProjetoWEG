import Enuns.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Proposta {

    private Integer idProposta, numeroSequencial, numeroATA, numeroDGATA;
    private Date anoATA, periodoExecucaoComecoProposta, periodoExecucaoFinalProposta;
    private String escopoProposta, motivoRecusaWorkflow, linkJiraProposta, comentarioPauta;
    private Boolean workflowAprovacao, aprovadoWorkflow, ATAPublicada;
    private Double paybackProposta;
    private TabelaCusto tabelaCustoProposta;
    private List<AnalistaTI> listaResponsaveisProposta = new ArrayList<>();
    private Demanda demanda;
    private Status statusProposta;

}
