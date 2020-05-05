package br.inatel.yugioh.control;

import br.inatel.yugioh.model.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe utilizada para manipulação de arquivos .txt
 * para a consistência de dados.
 * 
 * Os métodos e atributos utilizados podem servir de exemplo para o seu projeto de C206
 * @author Samuel
 */
public class Deck {
    
    private ArrayList<Carta> baralho;
    public static String nomeUsuario;

    // Construtor
    public Deck() {
        baralho = new ArrayList<>();
        
        try {
            FileOutputStream dck = new FileOutputStream( nomeUsuario + "Deck.txt", true);
            dck.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Erro ao Criar o Arquivo", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Getters e Setters
    public ArrayList<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(ArrayList<Carta> baralho) {
        this.baralho = baralho;
    }

    // Métodos
    public void salvarDeck(ArrayList<Carta> deck) {
        
        FileOutputStream fout;
        ObjectOutputStream out;
        
        try {
            fout = new FileOutputStream(nomeUsuario +"Deck.txt", false);
            out = new ObjectOutputStream(fout);

            out.writeObject(deck);

            out.close();
            fout.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Carta> lerDeck(){
        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Carta> c = new ArrayList<>();

        try {
            fin = new FileInputStream(nomeUsuario +"Deck.txt");
            in = new ObjectInputStream(fin);

            c = (ArrayList<Carta>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return c;
    }

}
