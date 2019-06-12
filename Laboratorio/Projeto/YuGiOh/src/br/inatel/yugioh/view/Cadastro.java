/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.yugioh.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Cadastro extends javax.swing.JFrame {

    private String usuario = null;
    private String senha = null;
    private String[] linha = new String[1000];

    public Cadastro() {
        initComponents();
        this.setLocationRelativeTo(null);           // Centralizar a Tela
        getRootPane().setDefaultButton(btn_cadastro); // Botão Pré-Selecionado
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txt_senhaConfirm = new javax.swing.JPasswordField();
        btn_cadastro = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Usuário");

        txt_usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Senha");

        txt_senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Confirmar Senha");

        txt_senhaConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_cadastro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_cadastro.setText("Cadastrar");
        btn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Novo Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario)
                            .addComponent(txt_senha)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_senhaConfirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cadastro)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_senhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastro)
                    .addComponent(btn_cancel))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/yugioh/img/wallpaper_35.png"))); // NOI18N
        getContentPane().add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroActionPerformed
        cadastro();
    }//GEN-LAST:event_btn_cadastroActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        cancel();
    }//GEN-LAST:event_btn_cancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastro;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JPasswordField txt_senhaConfirm;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void cadastro() {
        usuario = txt_usuario.getText();
        senha = txt_senha.getText();
        String senha2 = txt_senhaConfirm.getText();
        
        if ( senha.equals(senha2) ) {   // Confirmação de senha
            try {
                lerDados();
            } catch (Exception e) {
                System.out.println("Criando aquivo usuarios.txt ...");
                try {
                    OutputStream os = new FileOutputStream("usuarios.txt", true);
                } catch (FileNotFoundException ex) {
                    System.out.println("Erro no lerdados de novo" + ex.toString());
                }
            }

            // Verifica se já existe tal usuario
            if (!verificaDados()) {
                // se nao existir cai aqui
                // salva os dados
                salvarDados();
                limparCampos();
                sair();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,"As senhas não conhecidem!", "Senha inválida", JOptionPane.ERROR_MESSAGE);
            txt_senha.setText("");
            txt_senhaConfirm.setText("");
        }
        
        
    }

    private void salvarDados() {
        OutputStream fluxoSaida;                // Fluxo de Saida de dados
        OutputStreamWriter geradorFluxoSaida;   // Gerador do Fluxo de Saida
        BufferedWriter bufferSaida = null;      // Buffer da saida

        try {
            fluxoSaida = new FileOutputStream("usuarios.txt", true);   // Cria o arquivo "usuarios.txt" na pasta do projeto
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida); // Todo o fluxo de dados será armazenado neste arquivo
            bufferSaida = new BufferedWriter(geradorFluxoSaida);    // Buffer para o gerador de fluxo

            bufferSaida.write(usuario);     // Escreve na primeira linha
            bufferSaida.newLine();                          // Insere uma nova linha no arquivo
            bufferSaida.write(senha);     // Escreve na segunda linha
            bufferSaida.newLine();                          // Insere uma nova linha

            // Tratamento de Erros
        } catch (FileNotFoundException ex) {
            System.err.println("Arquivo não encontrado ! método salvarDados()");
        } catch (IOException ex) {
            System.out.println("Erro de Entrada e Saida de dados no arquivo");
        } finally {

            // Sempre fechar o arquivo após ler/gravar !!
            try {
                bufferSaida.close();    // Fecha o arquivo
            } catch (IOException ex) {
                System.err.println("Deu ruim ao fechar o arquivo");
                ex.printStackTrace();
            }
        }

        // Se deu tudo certo cai aqui
        JOptionPane.showMessageDialog(rootPane, "Usuario cadastrado com Sucesso!");
    }

    private void lerDados() {
        InputStream fluxoEntrada;               // Fluxo de entrada
        InputStreamReader leitorFluxoEntrada;   // Leitor do fluxo de entrada
        BufferedReader bufferEntrada = null;    // Buffer da entrada
        int i = 0;

        try {
            fluxoEntrada = new FileInputStream("usuarios.txt");           // Abre o arquivo "aula12.txt"
            leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);   // Faz a leitura do arquivo
            bufferEntrada = new BufferedReader(leitorFluxoEntrada);     // Buffer de entrada
            linha[0] = bufferEntrada.readLine();                           // Lê a linha e armazena na variavel auxiliar
            i++;
            while (i != 1000) {                 // Enquanto não chegar no final do arquivo
                linha[i] = bufferEntrada.readLine();   // Pula para a próxima linha
                i++;
                if (linha[i] == null) {
                    break;
                }
            }

            // Tratamento de Erros
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado! Método lerDados()");
        } catch (IOException ex) {
            System.out.println("IOException");
        } finally {
            // Sempre fechar o arquivo após ler/gravar !!
            try {
                bufferEntrada.close();      // Fecha o arquivo
            } catch (IOException ex) {
                System.out.println("IOException !");
                ex.printStackTrace();
            }
        }
    }

    private boolean verificaDados() {
        for (int i = 0; i < linha.length; i++) {
            if (linha[i] == null) {
                break;
            }
            if (linha[i].equals(usuario)) {
                JOptionPane.showMessageDialog(rootPane, "Usuario ja cadastrado");
                limparCampos();
                return true;
            }
        }
        return false;
    }

    private void limparCampos() {
        txt_senha.setText("");
        txt_senhaConfirm.setText("");
        txt_usuario.setText("");
    }

    private void sair() {
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }

    private void cancel() {
        sair();
    }
}
