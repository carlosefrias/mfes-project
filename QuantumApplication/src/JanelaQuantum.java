
import java.awt.Cursor;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import jp.co.csk.vdm.toolbox.VDM.CGException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaQuantum.java
 *
 * Created on 25/Nov/2011, 21:10:10
 */

/**
 *
 * @author Carlos Frias
 */
public class JanelaQuantum extends javax.swing.JFrame {

    /** Creates new form JanelaQuantum */
    public JanelaQuantum() {
        super("Quantum Board Game - Projecto de MFES");
        initComponents();
        System.out.println(imprimeTab());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTabuleiro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelJogador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ParaTextField = new javax.swing.JTextField();
        BotaoJogar = new javax.swing.JButton();
        labelAux = new javax.swing.JLabel();
        imagemTab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTabuleiro.setLayout(null);

        LabelJogador.setText("Jogador:");

        jLabel1.setText("de:");

        DeTextField.setText("A1");

        jLabel2.setText("para:");

        ParaTextField.setText("A2");
        ParaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaTextFieldActionPerformed(evt);
            }
        });

        BotaoJogar.setText("Jogar");
        BotaoJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoJogarMousePressed(evt);
            }
        });
        BotaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJogarActionPerformed(evt);
            }
        });

        labelAux.setText("Posição");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelJogador)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoJogar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ParaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelAux))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJogador)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ParaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoJogar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(labelAux)
                .addGap(22, 22, 22))
        );

        imagemTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem_tabuleiro.png"))); // NOI18N
        imagemTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagemTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagemTabMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagemTabMousePressed(evt);
            }
        });
        imagemTab.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imagemTabMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagemTab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagemTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ParaTextFieldActionPerformed


    private void BotaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJogarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoJogarActionPerformed

    private void BotaoJogarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoJogarMousePressed
        try {
            tab.jogada(leCasa(DeTextField.getText()), leCasa(ParaTextField.getText()));
            System.out.println(imprimeTab());
            System.out.println("jogou de: " + this.DeTextField.getText() + " para: " + this.ParaTextField.getText());
            this.LabelJogador.setText("" + tab.tabEstado);
        } catch (CGException ex) {
            System.out.println("Ocorreu exepção: Não pode efectuar a jogada de: " + this.DeTextField.getText() + " para: "+this.ParaTextField.getText());
        }
    }//GEN-LAST:event_BotaoJogarMousePressed

    private void imagemTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagemTabMouseEntered
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imagemTabMouseEntered

    private void imagemTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagemTabMouseExited
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imagemTabMouseExited

    private void imagemTabMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagemTabMouseMoved
        int xmin = 21;
        int xmax = 310;
        int ymin = 11;
        int comp_casa = (xmax-xmin)/8;
        int x = (evt.getX()-xmin)/comp_casa;
        int y = (evt.getY()-ymin)/comp_casa;
        char [] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        this.labelAux.setText("" + ch[x] + "" + (y+1));
        //this.labelAux.setText("x: " + evt.getX() + ", y:" + evt.getY());
    }//GEN-LAST:event_imagemTabMouseMoved

    private void imagemTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagemTabMousePressed
        int xmin = 21;
        int xmax = 310;
        int ymin = 11;
        int comp_casa = (xmax-xmin)/8;
        int x = (evt.getX()-xmin)/comp_casa;
        int y = (evt.getY()-ymin)/comp_casa;
        char [] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        if (clics == 0){
            this.DeTextField.setText("" + ch[x] + "" + (y+1));
            clics++;
        }else{
            this.ParaTextField.setText("" + ch[x] + "" + (y+1));
            BotaoJogarMousePressed(evt);
            clics = 0;
        }
    }//GEN-LAST:event_imagemTabMousePressed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    tab = new Tabuleiro();
                    JanelaQuantum j = new JanelaQuantum();
                    j.setVisible(true);
                    j.setResizable(false);
                    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } catch (CGException ex) {
                    Logger.getLogger(JanelaQuantum.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoJogar;
    private javax.swing.JTextField DeTextField;
    private javax.swing.JLabel LabelJogador;
    private javax.swing.JPanel PanelTabuleiro;
    private javax.swing.JTextField ParaTextField;
    private javax.swing.JLabel imagemTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAux;
    // End of variables declaration//GEN-END:variables
    private static Tabuleiro tab;
    private String imprimeTab(){
        char [] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String textTab = "==================================\n"+
                         " | a | b | c | d | e | f | g | h |";
        Set setcasas = tab.pecasNasCasas.keySet();//conjunto de casas
        Tabuleiro.Casa c = new Tabuleiro.Casa();
        for(int i = 1; i < 9; i++){
            textTab += "\n" + i + "|";
            for(int j = 0; j < 8; j++){
                c = new Tabuleiro.Casa(i,ch[j]);
                if(setcasas.contains(c))
                    textTab += impPeca((Tabuleiro.Peca) tab.pecasNasCasas.get(c)) + "|";
                else
                    textTab += "   |";
            }
        }
        return textTab + "\n | a | b | c | d | e | f | g | h |\n==================================";
    }
    private String impPeca(Tabuleiro.Peca p){
        if (p.tipo.toString().equals("<circle>")) return p.jogador + "o" + p.num_uelem;
        else if (p.tipo.toString().equals("<square>")) return p.jogador + "#" + p.num_uelem;
        else return "" + p.jogador + '+' + p.num_uelem;
    }
    private Tabuleiro.Casa leCasa(String s){
        s = s.toLowerCase();
        return new Tabuleiro.Casa(Integer.parseInt("" + s.charAt(1)), s.charAt(0));
    }
    private int clics = 0;
}