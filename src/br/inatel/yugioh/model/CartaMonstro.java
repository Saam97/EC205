package br.inatel.yugioh.model;

/**
 * Classe para as cartas somente do tipo monstro (inclui Fusão, Monstros com e
 * sem efeitos, Deuses e etc). 
 * <br></br>
 * <br> String tipo - Tipo do monstro (Ex: Mago, Dragão, Zumbi, etc) </br>
 * <br>Int atk e def - Ataque e defesa do Monstro </br>
 * <br>Int nivel - Número de estrelas do Monstro </br>
 * <br>String efeito - Efeito especial do monstro</br>
 */
public class CartaMonstro extends Carta implements Efeito {

    /**
     * Tipo do monstro (Ex: Mago, Dragão, Zumbi, etc).
     */
    private String tipo;

    /**
     * Ataque do monstro
     */
    private int atk;

    /**
     * Defesa do monstro
     */
    private int def;

    /**
     * Número de estrelas do monstro (nível do monstro)
     */
    private int nivel;

    /**
     * Efeito do monstro
     */
    private String efeito = null;

    /**
     * Efeito especial do monstro, se houver.
     *
     * @param txtEfeito O efeito é passado por parâmetro
     */
    @Override
    public void efeitoMonstro(String txtEfeito) {
        this.efeito = txtEfeito;
    }

    // Getters e Setters
    
    /**
     * Tipo do monstro (Ex: Mago, Dragão, Zumbi, etc).
     * @return tipo do monstro
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Tipo do monstro (Ex: Mago, Dragão, Zumbi, etc).
     * @param tipo tipo do monstro 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Ataque do monstro
     * @return atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * Ataque do monstro
     * @param pontosAtk pontos de ataque do monstro
     */
    public void setAtk(int pontosAtk) {
        this.atk = pontosAtk;
    }

    /**
     * Defesa do monstro
     * @return pontos de defesa do monstro
     */
    public int getDef() {
        return def;
    }

    /**
     * Defesa do monstro
     * @param pontosDef Pontos de defesa do monstro
     */
    public void setDef(int pontosDef) {
        this.def = pontosDef;
    }

    /**
     * Número de estrelas do monstro (nível do monstro)
     * @return número de estrelas do monstro
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Número de estrelas do monstro (nível do monstro)
     * @param nivel Número de estrelas do monstro
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Efeito especial do monstro, se houver
     * @return efeito do monstro
     */
    public String getEfeito() {
        return efeito;
    }

    /**
     * Efeito especial do monstro, se houver
     * @param efeito efeito do monstro passado por parametro
     */
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    @Override
    public void info(){
        System.out.println("\t Carta Monstro");
        super.info();
        System.out.println("Tipo de Monstro: " + this.tipo);
        System.out.println("Nível (estrelas): " + this.nivel);
        System.out.println("ATK: " + this.atk);
        System.out.println("DEF: " + this.def);
        if ( this.efeito != null ) {
            System.out.println("Efeito do monstro: " + this.efeito);
        }
    }
}
