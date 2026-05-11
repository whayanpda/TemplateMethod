package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonagemTest {

    @Test
    void deveCalcularDanoBaseSomandoForcaComMetadeDoPoderMagico() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setForcaBase(20.0f);
        guerreiro.setPoderMagico(10.0f);

        assertEquals(25.0f, guerreiro.calcularDanoBase(), 0.001f);
    }

    @Test
    void deveExecutarGolpeEsmagadorQuandoGuerreiroTemForcaMaiorQueVinte() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setForcaBase(21.0f);

        assertEquals("Usou Golpe Esmagador! (Dano Crítico)", guerreiro.executarHabilidadeEspecial());
    }

    @Test
    void deveExecutarAtaqueComEscudoQuandoGuerreiroTemForcaAteVinte() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setForcaBase(20.0f);

        assertEquals("Usou Ataque com Escudo!", guerreiro.executarHabilidadeEspecial());
    }

    @Test
    void deveLancarMeteoroQuandoMagoTemPoderMagicoMaiorQueCinquenta() {
        Mago mago = new Mago();
        mago.setPoderMagico(51.0f);

        assertEquals("Lançou Meteoro Flamejante!", mago.executarHabilidadeEspecial());
    }

    @Test
    void deveLancarSetaDeGeloQuandoMagoTemPoderMagicoAteCinquenta() {
        Mago mago = new Mago();
        mago.setPoderMagico(50.0f);

        assertEquals("Lançou Seta de Gelo!", mago.executarHabilidadeEspecial());
    }

    @Test
    void deveMontarRelatorioUsandoTemplateMethodDaClasseConcreta() {
        Mago mago = new Mago();
        mago.setNome("Merlin");
        mago.setForcaBase(10.0f);
        mago.setPoderMagico(60.0f);

        assertEquals(
                "Mago Merlin entrou em combate:\n" +
                        "Dano Base: 40.0\n" +
                        "Ação Especial: Lançou Meteoro Flamejante!",
                mago.getRelatorioAcao()
        );
    }
}
