package org.example;

public abstract class Personagem {

    private String nome;
    private int nivel;
    private float forcaBase;
    private float poderMagico;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public float getForcaBase() { return forcaBase; }
    public void setForcaBase(float forca) { this.forcaBase = forca; }
    public float getPoderMagico() { return poderMagico; }
    public void setPoderMagico(float poder) { this.poderMagico = poder; }

    public float calcularDanoBase() {
        return this.forcaBase + (this.poderMagico * 0.5f);
    }

    public abstract String executarHabilidadeEspecial();

    public String getClasse() {
        return "Aventureiro";
    }

    public String getRelatorioAcao() {
        return getClasse() + " " + this.nome + " entrou em combate:\n" +
                "Dano Base: " + this.calcularDanoBase() + "\n" +
                "Ação Especial: " + this.executarHabilidadeEspecial();
    }
}
