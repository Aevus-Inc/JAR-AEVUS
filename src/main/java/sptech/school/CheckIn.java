package sptech.school;

public class CheckIn {
    private PesquisaDeSatisfacao pesquisa;
    private String formaCheckIn; // Enum("Balcão", "Totem AA", etc.)
    private Integer processoCheckIn;
    private Integer tempoEsperaFila;
    private Integer organizacaoFilas;
    private Integer quantidadeTotensAA;
    private Integer quantidadeBalcoes;
    private Integer cordialidadeFuncionarios;
    private Integer tempoAtendimento;

    public CheckIn(){

    }

    public CheckIn(PesquisaDeSatisfacao pesquisa, String formaCheckIn, Integer processoCheckIn, Integer tempoEsperaFila, Integer organizacaoFilas, Integer quantidadeTotensAA, Integer quantidadeBalcoes, Integer cordialidadeFuncionarios, Integer tempoAtendimento) {
        this.pesquisa = pesquisa;
        this.formaCheckIn = formaCheckIn;
        this.processoCheckIn = processoCheckIn;
        this.tempoEsperaFila = tempoEsperaFila;
        this.organizacaoFilas = organizacaoFilas;
        this.quantidadeTotensAA = quantidadeTotensAA;
        this.quantidadeBalcoes = quantidadeBalcoes;
        this.cordialidadeFuncionarios = cordialidadeFuncionarios;
        this.tempoAtendimento = tempoAtendimento;
    }

    public PesquisaDeSatisfacao getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(PesquisaDeSatisfacao pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getFormaCheckIn() {
        return formaCheckIn;
    }

    public void setFormaCheckIn(String formaCheckIn) {
        this.formaCheckIn = formaCheckIn;
    }

    public Integer getProcessoCheckIn() {
        return processoCheckIn;
    }

    public void setProcessoCheckIn(Integer processoCheckIn) {
        this.processoCheckIn = processoCheckIn;
    }

    public Integer getTempoEsperaFila() {
        return tempoEsperaFila;
    }

    public void setTempoEsperaFila(Integer tempoEsperaFila) {
        this.tempoEsperaFila = tempoEsperaFila;
    }

    public Integer getOrganizacaoFilas() {
        return organizacaoFilas;
    }

    public void setOrganizacaoFilas(Integer organizacaoFilas) {
        this.organizacaoFilas = organizacaoFilas;
    }

    public Integer getQuantidadeTotensAA() {
        return quantidadeTotensAA;
    }

    public void setQuantidadeTotensAA(Integer quantidadeTotensAA) {
        this.quantidadeTotensAA = quantidadeTotensAA;
    }

    public Integer getQuantidadeBalcoes() {
        return quantidadeBalcoes;
    }

    public void setQuantidadeBalcoes(Integer quantidadeBalcoes) {
        this.quantidadeBalcoes = quantidadeBalcoes;
    }

    public Integer getCordialidadeFuncionarios() {
        return cordialidadeFuncionarios;
    }

    public void setCordialidadeFuncionarios(Integer cordialidadeFuncionarios) {
        this.cordialidadeFuncionarios = cordialidadeFuncionarios;
    }

    public Integer getTempoAtendimento() {
        return tempoAtendimento;
    }

    public void setTempoAtendimento(Integer tempoAtendimento) {
        this.tempoAtendimento = tempoAtendimento;
    }
}
