package br.inatel.yugioh.model;

/**
 * Interface para as cartas mágicas e trap cards, como todas possuem efeito
 * então será necessário Reescrever o método de efeito da carta.
 */
public interface MagicCard {

    public void efeitoMagicCard(String efeito);

}
