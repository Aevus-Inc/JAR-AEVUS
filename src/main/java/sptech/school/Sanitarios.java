package sptech.school;

public class Sanitarios {
    private int quantidadeBanheiros;
    private int limpezaBanheiros;
    private int manutencaoGeralSanitarios;
    private int limpezaGeralAeroporto;

    public Sanitarios(){

    }

    public Sanitarios(int quantidadeBanheiros, int limpezaBanheiros, int manutencaoGeralSanitarios, int limpezaGeralAeroporto) {
        this.quantidadeBanheiros = quantidadeBanheiros;
        this.limpezaBanheiros = limpezaBanheiros;
        this.manutencaoGeralSanitarios = manutencaoGeralSanitarios;
        this.limpezaGeralAeroporto = limpezaGeralAeroporto;
    }

    public int getQuantidadeBanheiros() {
        return quantidadeBanheiros;
    }

    public void setQuantidadeBanheiros(int quantidadeBanheiros) {
        this.quantidadeBanheiros = quantidadeBanheiros;
    }

    public int getLimpezaBanheiros() {
        return limpezaBanheiros;
    }

    public void setLimpezaBanheiros(int limpezaBanheiros) {
        this.limpezaBanheiros = limpezaBanheiros;
    }

    public int getManutencaoGeralSanitarios() {
        return manutencaoGeralSanitarios;
    }

    public void setManutencaoGeralSanitarios(int manutencaoGeralSanitarios) {
        this.manutencaoGeralSanitarios = manutencaoGeralSanitarios;
    }

    public int getLimpezaGeralAeroporto() {
        return limpezaGeralAeroporto;
    }

    public void setLimpezaGeralAeroporto(int limpezaGeralAeroporto) {
        this.limpezaGeralAeroporto = limpezaGeralAeroporto;
    }
}
