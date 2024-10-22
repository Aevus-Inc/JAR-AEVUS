package sptech.school;

public class InspecaoSeguranca {
    private PesquisaDeSatisfacao pesquisa;
    private Integer processoInspecaoSeguranca;
    private Integer tempoEsperaFila;
    private Integer organizacaoFilas;
    private Integer atendimentoFuncionarios;


    public InspecaoSeguranca(){

    }

    public InspecaoSeguranca(PesquisaDeSatisfacao pesquisa, Integer processoInspecaoSeguranca, Integer tempoEsperaFila, Integer organizacaoFilas, Integer atendimentoFuncionarios) {
        this.pesquisa = pesquisa;
        this.processoInspecaoSeguranca = processoInspecaoSeguranca;
        this.tempoEsperaFila = tempoEsperaFila;
        this.organizacaoFilas = organizacaoFilas;
        this.atendimentoFuncionarios = atendimentoFuncionarios;
    }

    public PesquisaDeSatisfacao getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(PesquisaDeSatisfacao pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Integer getProcessoInspecaoSeguranca() {
        return processoInspecaoSeguranca;
    }

    public void setProcessoInspecaoSeguranca(Integer processoInspecaoSeguranca) {
        this.processoInspecaoSeguranca = processoInspecaoSeguranca;
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

    public Integer getAtendimentoFuncionarios() {
        return atendimentoFuncionarios;
    }

    public void setAtendimentoFuncionarios(Integer atendimentoFuncionarios) {
        this.atendimentoFuncionarios = atendimentoFuncionarios;
    }
}

