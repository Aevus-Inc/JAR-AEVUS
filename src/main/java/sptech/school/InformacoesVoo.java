package sptech.school;

public class InformacoesVoo {
    private PesquisaDeSatisfacao pesquisa;
    private String processo; // Enum("Embarque", "Desembarque")
    private String aeroporto;
    private String terminal;
    private String portao;
    private String tipoVoo; // Enum("Doméstico", "Internacional")


    public InformacoesVoo(){

    }

    public InformacoesVoo(PesquisaDeSatisfacao pesquisa, String processo, String aeroporto, String terminal, String portao, String tipoVoo, String ciaAerea, int voo, String conexao) {
        this.pesquisa = pesquisa;
        this.processo = processo;
        this.aeroporto = aeroporto;
        this.terminal = terminal;
        this.portao = portao;
        this.tipoVoo = tipoVoo;
        this.ciaAerea = ciaAerea;
        this.voo = voo;
        this.conexao = conexao;
    }

    public PesquisaDeSatisfacao getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(PesquisaDeSatisfacao pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public String getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(String aeroporto) {
        this.aeroporto = aeroporto;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getPortao() {
        return portao;
    }

    public void setPortao(String portao) {
        this.portao = portao;
    }

    public String getTipoVoo() {
        return tipoVoo;
    }

    public void setTipoVoo(String tipoVoo) {
        this.tipoVoo = tipoVoo;
    }

    public String getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(String ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public int getVoo() {
        return voo;
    }

    public void setVoo(int voo) {
        this.voo = voo;
    }

    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
    }

    private String ciaAerea; // Enum("AEROLÍNEAS ARGENTINAS", etc.)
    private int voo;
    private String conexao; // Enum("Em conexão", "Embarcado no aeroporto")
}
