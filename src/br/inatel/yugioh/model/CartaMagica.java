package br.inatel.yugioh.model;

/**
 * Classe para cartas mágicas do tipo Magic ou Trap Card.
 * <br></br>
 * <br>String efeito - Efeito da carta Mágica</br>
 * <br>String icone - Ícone da carta (Equipamento, campo, ritual, armadilha, contínua, etc)</br>
 * <br>String tipo - Tipo da carta. Nesse caso é somente Magic Card ou Trap Card</br>
 */
public class CartaMagica extends Carta implements MagicCard {
    //Classe apenas para magic card e trap card

    /**
     * Efeito da carta
     */
    private String efeito;

    /**
     * Ícone da Carta (Equipamento, carta campo, ritual, armadilha, etc)
     */
    private String icone;

    /**
     * Tipo da carta. Só pode ser Magic ou Trap card
     */
    private String tipo;

    /**
     * Método para sobrescrever o efeito da carta magica ou trap card
     *
     * @param efeitoCarta O efeito é passado por parâmetro
     */
    @Override
    public void efeitoMagicCard(String efeitoCarta) {
        this.efeito = efeitoCarta;
    }

    // Getters e Setters
    
    /**
     * Efeito da carta
     * @return efeito da carta
     */
    public String getEfeito() {
        return efeito;
    }

    /**
     * Ícone da Carta (Equipamento, carta campo, ritual, armadilha, etc)
     * @return tipo do icone da carta
     */
    public String getIcone() {
        return icone;
    }

    /**
     * Ícone da Carta (Equipamento, carta campo, ritual, armadilha, etc)
     * @param icone tipo do icone
     */
    public void setIcone(String icone) {
        this.icone = icone;
    }

    /**
     * Tipo da carta. Só pode ser Magic ou Trap card
     * @return Magic ou Trap Card
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Tipo da carta. Só pode ser Magic ou Trap card
     * @param tipo carta do tipo Magic ou Trap Card
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void info(){
        System.out.println("\t Carta Mágica");
        super.info();
        System.out.println("Efeito: " + this.efeito);
        System.out.println("Icone: " + this.icone);
        System.out.println("Tipo: " + this.tipo);
    }
}