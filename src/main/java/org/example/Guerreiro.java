package org.example;

public class Guerreiro extends Personagem {

    @Override
    public String executarHabilidadeEspecial() {
        if (this.getForcaBase() > 20) {
            return "Usou Golpe Esmagador! (Dano Crítico)";
        } else {
            return "Usou Ataque com Escudo!";
        }
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }
}
