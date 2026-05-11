package org.example;

public class Mago extends Personagem {

    @Override
    public String executarHabilidadeEspecial() {
        if (this.getPoderMagico() > 50) {
            return "Lançou Meteoro Flamejante!";
        } else {
            return "Lançou Seta de Gelo!";
        }
    }

    @Override
    public String getClasse() {
        return "Mago";
    }
}
