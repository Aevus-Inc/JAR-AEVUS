package sptech.school;

public class Desembarque {
    private PesquisaDeSatisfacao pesquisa;
    private String formaDesembarque; // Enum("Ponte", "Ambulift", etc.)
    private int avaliacaoMetodoDesembarque;
    private boolean utilizouEstacionamento;
    private int facilidadeDesembarqueMeioFio;
    private int opcoesTransporteAeroporto;

    public Desembarque(){

    }

    public Desembarque(PesquisaDeSatisfacao pesquisa, String formaDesembarque, int avaliacaoMetodoDesembarque, boolean utilizouEstacionamento, int facilidadeDesembarqueMeioFio, int opcoesTransporteAeroporto) {
        this.pesquisa = pesquisa;
        this.formaDesembarque = formaDesembarque;
        this.avaliacaoMetodoDesembarque = avaliacaoMetodoDesembarque;
        this.utilizouEstacionamento = utilizouEstacionamento;
        this.facilidadeDesembarqueMeioFio = facilidadeDesembarqueMeioFio;
        this.opcoesTransporteAeroporto = opcoesTransporteAeroporto;
    }

    public PesquisaDeSatisfacao getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(PesquisaDeSatisfacao pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getFormaDesembarque() {
        return formaDesembarque;
    }

    public void setFormaDesembarque(String formaDesembarque) {
        this.formaDesembarque = formaDesembarque;
    }

    public int getAvaliacaoMetodoDesembarque() {
        return avaliacaoMetodoDesembarque;
    }

    public void setAvaliacaoMetodoDesembarque(int avaliacaoMetodoDesembarque) {
        this.avaliacaoMetodoDesembarque = avaliacaoMetodoDesembarque;
    }

    public boolean isUtilizouEstacionamento() {
        return utilizouEstacionamento;
    }

    public void setUtilizouEstacionamento(boolean utilizouEstacionamento) {
        this.utilizouEstacionamento = utilizouEstacionamento;
    }

    public int getFacilidadeDesembarqueMeioFio() {
        return facilidadeDesembarqueMeioFio;
    }

    public void setFacilidadeDesembarqueMeioFio(int facilidadeDesembarqueMeioFio) {
        this.facilidadeDesembarqueMeioFio = facilidadeDesembarqueMeioFio;
    }

    public int getOpcoesTransporteAeroporto() {
        return opcoesTransporteAeroporto;
    }

    public void setOpcoesTransporteAeroporto(int opcoesTransporteAeroporto) {
        this.opcoesTransporteAeroporto = opcoesTransporteAeroporto;
    }
}
