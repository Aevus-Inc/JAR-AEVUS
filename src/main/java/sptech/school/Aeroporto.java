package sptech.school;

public class Aeroporto {
    private String siglaAeroporto; // Enum("SBBE", "SBBR", "SBCF", etc.);

    public Aeroporto(){

    }

    public Aeroporto(String siglaAeroporto) {
        this.siglaAeroporto = siglaAeroporto;
    }

    public String getSiglaAeroporto() {
        return siglaAeroporto;
    }

    public void setSiglaAeroporto(String siglaAeroporto) {
        this.siglaAeroporto = siglaAeroporto;
    }

}


