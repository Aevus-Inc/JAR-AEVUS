package sptech.school;

public class Estacionamento {
    private Integer estacionamentoId;
    private Integer pesquisaId;
    private Integer qualidadeInstalacoesEstacionamento;
    private Integer facilidadeEncontrarVagas;
    private Integer facilidadeAcessoTerminal;
    private Integer relacaoCustoBeneficio;

    // Getters e Setters

    public Integer getEstacionamentoId() {
        return estacionamentoId;
    }

    public void setEstacionamentoId(Integer estacionamentoId) {
        this.estacionamentoId = estacionamentoId;
    }

    public Integer getPesquisaId() {
        return pesquisaId;
    }

    public void setPesquisaId(Integer pesquisaId) {
        this.pesquisaId = pesquisaId;
    }

    public Integer getQualidadeInstalacoesEstacionamento() {
        return qualidadeInstalacoesEstacionamento;
    }

    public void setQualidadeInstalacoesEstacionamento(Integer qualidadeInstalacoesEstacionamento) {
        if (qualidadeInstalacoesEstacionamento >= 1 && qualidadeInstalacoesEstacionamento <= 5) {
            this.qualidadeInstalacoesEstacionamento = qualidadeInstalacoesEstacionamento;
        }
    }

    public Integer getFacilidadeEncontrarVagas() {
        return facilidadeEncontrarVagas;
    }

    public void setFacilidadeEncontrarVagas(Integer facilidadeEncontrarVagas) {
        if (facilidadeEncontrarVagas >= 1 && facilidadeEncontrarVagas <= 5) {
            this.facilidadeEncontrarVagas = facilidadeEncontrarVagas;
        }
    }

    public Integer getFacilidadeAcessoTerminal() {
        return facilidadeAcessoTerminal;
    }

    public void setFacilidadeAcessoTerminal(Integer facilidadeAcessoTerminal) {
        if (facilidadeAcessoTerminal >= 1 && facilidadeAcessoTerminal <= 5) {
            this.facilidadeAcessoTerminal = facilidadeAcessoTerminal;
        }
    }

    public Integer getRelacaoCustoBeneficio() {
        return relacaoCustoBeneficio;
    }

    public void setRelacaoCustoBeneficio(Integer relacaoCustoBeneficio) {
        if (relacaoCustoBeneficio >= 1 && relacaoCustoBeneficio <= 5) {
            this.relacaoCustoBeneficio = relacaoCustoBeneficio;
        }
    }
}

