package br.inatel.yugioh.control;

import br.inatel.yugioh.model.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Deck {
    
    private ArrayList<Carta> baralho;

    // Construtor
    public Deck() {
        baralho = new ArrayList<>();
        
        try {
            FileOutputStream dck = new FileOutputStream("Deck.txt", true);
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
            fout = new FileOutputStream("Deck.txt", false);
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
            fin = new FileInputStream("Deck.txt");
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
