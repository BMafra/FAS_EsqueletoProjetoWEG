import Enuns.BUS;
import Enuns.SesaoTI;
import Enuns.Status;
import Enuns.TamanhoDemanda;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Demanda {

    private Integer idDemanda, etapaElaboracao, codigoPPM;
    private String tituloDemanda, objetivoDemanda, situacaoAtual, frequenciaDeUso, motivoDevolucao;
    private Status status;
    private TamanhoDemanda tamanhoDemanda;
    private List<Beneficio> listaBeneficios = new ArrayList<>();
    private SesaoTI sesaoTIResponsavel;
    private Time prazoElaboracao;
    private BUS BUSolicitante;
    private List<BUS> listaBUSBeneficiadas = new ArrayList<>();

}
