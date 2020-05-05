package br.inatel.yugioh.model;

import java.io.Serializable;
import javax.swing.Icon;

/**
 * Classe mãe de todos os objetos do projeto. A classe Carta servirá mais para
 * auxiliar na hora de armazenar os dados no ArrayList. Aqui serão colocados
 * todos os atributos e métodos que as cartas têm em comum.
 */
public abstract class Carta implements Serializable {

    /**
     * Tipo de carta, se sé ou não monstro
     */
    private boolean eMonstro;

    /**
     * ID da carta
     */
    private String ID;

    /**
     * Nome da carta
     */
    private String nome;

    /**
     * Atributo da carta (Pode ser Magic ou Trap Card, ou um Elemento do tipo
     * Dark por exemplo).
     */
    private String atributo;

    /**
     * Descrição do Card, se houver
     */
    private String descricao = null;

    /**
     * Icone da carta
     */
    private Icon img;

    public Icon getImg() {
        return img;
    }

    public void setImg(Icon img) {
        this.img = img;
    }

    //Getters e Setters
    /**
     * Verifica se a carta é do tipo monstro ou não
     *
     * @return verdadeiro para monstro e falso para nao monstro
     */
    public boolean iseMonstro() {
        return eMonstro;
    }

    /**
     * Edita se é ou não uma carta do tipo monstro
     *
     * @param eMonstro verdadeiro para monstro e falso para não monstro
     */
    public void seteMonstro(boolean eMonstro) {
        this.eMonstro = eMonstro;
    }

    /**
     * pega o ID da carta
     *
     * @return ID da carta
     */
    public String getID() {
        return ID;
    }

    /**
     * Adiciona um ID à carta
     *
     * @param ID somente números inteiros
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Pega o nome da carta
     *
     * @return nome da carta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Muda o nome da carta
     *
     * @param nome nome da carta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Pega o atributo da carta.
     *
     * @return Magic ou Trap Card para cartas mágicas; Vento, Trevas, Fogo, Água
     * e etc para monstros
     */
    public String getAtributo() {
        return atributo;
    }

    /**
     * Define o atributo da carta
     *
     * @param atributo Tipo do elemento para monstros ou Magic/Trap Card para
     * não monstros
     */
    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    /**
     * Pega a descrição da carta
     *
     * @return descrição da carta
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define uma descrição para a carta
     *
     * @param descricao a descrição é passada por parâmetro
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void info() {
        System.out.println("Nome da Carta: " + this.nome);
        System.out.println("Atributo: " + this.atributo);
        System.out.println("Descrição: " + this.descricao);
    }   

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
