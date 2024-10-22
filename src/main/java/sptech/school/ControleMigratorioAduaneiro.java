package sptech.school;

public class ControleMigratorioAduaneiro {
    private PesquisaDeSatisfacao pesquisa;
    private int controleMigratorio;
    private int tempoEsperaFila;
    private int organizacaoFilas;
    private int atendimentoFuncionarios;
    private int quantidadeGuiches;
    private int controleAduaneiro;

    public ControleMigratorioAduaneiro(){

    }

    public ControleMigratorioAduaneiro(PesquisaDeSatisfacao pesquisa, int controleMigratorio, int tempoEsperaFila, int organizacaoFilas, int atendimentoFuncionarios, int quantidadeGuiches, int controleAduaneiro) {
        this.pesquisa = pesquisa;
        this.controleMigratorio = controleMigratorio;
        this.tempoEsperaFila = tempoEsperaFila;
        this.organizacaoFilas = organizacaoFilas;
        this.atendimentoFuncionarios = atendimentoFuncionarios;
        this.quantidadeGuiches = quantidadeGuiches;
        this.controleAduaneiro = controleAduaneiro;
    }


    public PesquisaDeSatisfacao getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(PesquisaDeSatisfacao pesquisa) {
        this.pesquisa = pesquisa;
    }

    public int getControleMigratorio() {
        return controleMigratorio;
    }

    public void setControleMigratorio(int controleMigratorio) {
        this.controleMigratorio = controleMigratorio;
    }

    public int getTempoEsperaFila() {
        return tempoEsperaFila;
    }

    public void setTempoEsperaFila(int tempoEsperaFila) {
        this.tempoEsperaFila = tempoEsperaFila;
    }

    public int getOrganizacaoFilas() {
        return organizacaoFilas;
    }

    public void setOrganizacaoFilas(int organizacaoFilas) {
        this.organizacaoFilas = organizacaoFilas;
    }

    public int getAtendimentoFuncionarios() {
        return atendimentoFuncionarios;
    }

    public void setAtendimentoFuncionarios(int atendimentoFuncionarios) {
        this.atendimentoFuncionarios = atendimentoFuncionarios;
    }

    public int getQuantidadeGuiches() {
        return quantidadeGuiches;
    }

    public void setQuantidadeGuiches(int quantidadeGuiches) {
        this.quantidadeGuiches = quantidadeGuiches;
    }

    public int getControleAduaneiro() {
        return controleAduaneiro;
    }

    public void setControleAduaneiro(int controleAduaneiro) {
        this.controleAduaneiro = controleAduaneiro;
    }
}
