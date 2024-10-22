package sptech.school;

public class AquisicaoPassagem {
    private PesquisaDeSatisfacao pesquisa;
    private String aquisicaoPassagem; // Enum("Pelo passageiro", "Por terceiros")
    private String meioAquisicaoPassagem; // Enum("Diretamente com a cia. aérea", etc.)
    private String meioTransporteAeroporto; // Enum("Aplicativos", "Carona", etc.)

    public AquisicaoPassagem(){

    }

    public AquisicaoPassagem(PesquisaDeSatisfacao pesquisa, String aquisicaoPassagem, String meioAquisicaoPassagem, String meioTransporteAeroporto) {
        this.pesquisa = pesquisa;
        this.aquisicaoPassagem = aquisicaoPassagem;
        this.meioAquisicaoPassagem = meioAquisicaoPassagem;
        this.meioTransporteAeroporto = meioTransporteAeroporto;
    }

    public PesquisaDeSatisfacao getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(PesquisaDeSatisfacao pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getAquisicaoPassagem() {
        return aquisicaoPassagem;
    }

    public void setAquisicaoPassagem(String aquisicaoPassagem) {
        this.aquisicaoPassagem = aquisicaoPassagem;
    }

    public String getMeioAquisicaoPassagem() {
        return meioAquisicaoPassagem;
    }

    public void setMeioAquisicaoPassagem(String meioAquisicaoPassagem) {
        this.meioAquisicaoPassagem = meioAquisicaoPassagem;
    }

    public String getMeioTransporteAeroporto() {
        return meioTransporteAeroporto;
    }

    public void setMeioTransporteAeroporto(String meioTransporteAeroporto) {
        this.meioTransporteAeroporto = meioTransporteAeroporto;
    }
}
