package sptech.school;

public class NecessidadesEspeciais {
    private PesquisaDeSatisfacao pesquisa;
    private String possuiDeficiencia; // Enum("Nenhuma", "Deficiência Física / Motora", etc.)
    private String utilizaRecursoAssistivo; // Enum("Nenhum", "Cadeira de rodas manual", etc.)
    private String solicitouAssistenciaEspecial; // Enum("Sim: com menos de 2 dias", etc.)

    public NecessidadesEspeciais(){

    }

    public NecessidadesEspeciais(PesquisaDeSatisfacao pesquisa, String possuiDeficiencia, String utilizaRecursoAssistivo, String solicitouAssistenciaEspecial) {
        this.pesquisa = pesquisa;
        this.possuiDeficiencia = possuiDeficiencia;
        this.utilizaRecursoAssistivo = utilizaRecursoAssistivo;
        this.solicitouAssistenciaEspecial = solicitouAssistenciaEspecial;
    }

    public PesquisaDeSatisfacao getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(PesquisaDeSatisfacao pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getPossuiDeficiencia() {
        return possuiDeficiencia;
    }

    public void setPossuiDeficiencia(String possuiDeficiencia) {
        this.possuiDeficiencia = possuiDeficiencia;
    }

    public String getUtilizaRecursoAssistivo() {
        return utilizaRecursoAssistivo;
    }

    public void setUtilizaRecursoAssistivo(String utilizaRecursoAssistivo) {
        this.utilizaRecursoAssistivo = utilizaRecursoAssistivo;
    }

    public String getSolicitouAssistenciaEspecial() {
        return solicitouAssistenciaEspecial;
    }

    public void setSolicitouAssistenciaEspecial(String solicitouAssistenciaEspecial) {
        this.solicitouAssistenciaEspecial = solicitouAssistenciaEspecial;
    }
}
