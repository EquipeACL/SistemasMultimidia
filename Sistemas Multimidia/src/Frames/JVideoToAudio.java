package Frames;

import Metodos.VideoToAudio;
import Objetos.Audio;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JVideoToAudio extends javax.swing.JDialog {

    private static String NAME_ARCHIVE_INPUT = "";
    private static String NAME_ADDRESS_ARCHIVE_INPUT = "";
    private static String NAME_ARCHIVE_OUTPUT = "";
    private static String NAME_ADDRESS_ARCHIVE_OUTPUT = "";
    private String extensao = "";
    private boolean confirma = false;
    private File video;
    private Audio sound;

    public JVideoToAudio(java.awt.Frame parent, boolean modal, String extensao, String output) {
        super(parent, modal);
        initComponents();
        this.extensao = extensao;
        NAME_ADDRESS_ARCHIVE_OUTPUT = output;
        textoOutput.setText(NAME_ADDRESS_ARCHIVE_OUTPUT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        textoInput = new javax.swing.JTextField();
        inputNome = new javax.swing.JLabel();
        outputNome = new javax.swing.JLabel();
        textoOutput = new javax.swing.JTextField();
        botaoInput = new javax.swing.JButton();
        taxaBitsSeletor = new javax.swing.JComboBox<>();
        taxBitsNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        taxaCanaisSeletor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        taxaSamplingSeletor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        textoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoInputActionPerformed(evt);
            }
        });

        inputNome.setText("Input:");

        outputNome.setText("Output:");

        textoOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoOutputActionPerformed(evt);
            }
        });

        botaoInput.setBackground(new java.awt.Color(255, 255, 255));
        botaoInput.setText("Selecionar");
        botaoInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInputActionPerformed(evt);
            }
        });

        taxaBitsSeletor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "128", "256" }));
        taxaBitsSeletor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        taxBitsNome.setText("Taxa de Bits:");

        jLabel1.setText("Bits");

        jLabel2.setText("CONVERTER VÍDEO PARA ÁUDIO");

        jLabel3.setText("Canais:");

        taxaCanaisSeletor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        taxaCanaisSeletor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Canais");

        jLabel5.setText("Sampling Rate:");

        taxaSamplingSeletor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8000", "11025", "16000", "22050", "32000", "37800", "44056", "44100", "47250", "48000", "50000", "50400", "88200", "96000", "176400", "192000", "352800", "2822400", "5644800", "11289600", "22579200" }));
        taxaSamplingSeletor.setSelectedIndex(7);
        taxaSamplingSeletor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setText("Hertz");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ok.png"))); // NOI18N
        jButton1.setText("Iniciar Conversão");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancel.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(taxBitsNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(outputNome)
                                .addComponent(inputNome))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textoInput)
                                            .addComponent(textoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoInput))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(taxaCanaisSeletor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(taxaBitsSeletor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4))))
                                .addGap(59, 59, 59))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(taxaSamplingSeletor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(105, 105, 105))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputNome)
                    .addComponent(textoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taxaBitsSeletor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(taxBitsNome)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(taxaCanaisSeletor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(taxaSamplingSeletor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoInputActionPerformed

    private void botaoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInputActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            JFileChooser j = new JFileChooser(System.getProperty("user.home") + "\\Desktop");
            j.setApproveButtonText("Selecionar");
            j.setFileFilter(new FileNameExtensionFilter("Videos", "avi", "3gp", "mp4", "flv"));
            j.setAcceptAllFileFilterUsed(false);
            Appearance.appearance(j);
            j.showOpenDialog(this);
            NAME_ADDRESS_ARCHIVE_INPUT = j.getCurrentDirectory().toString();
            String fileSelected = j.getSelectedFile().getAbsoluteFile().getName();
            NAME_ARCHIVE_INPUT = NAME_ARCHIVE_OUTPUT = "\\" + fileSelected.substring(0, fileSelected.indexOf("."));
            textoInput.setText(j.getCurrentDirectory().toString() + "\\" + fileSelected);
            textoOutput.setText(NAME_ADDRESS_ARCHIVE_OUTPUT + NAME_ARCHIVE_INPUT + "." + extensao);
            
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VideoToAudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_botaoInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!(textoInput.getText().isEmpty() || textoInput.getText()=="")){
            confirma = true;

            //String formato, String input, String output, int taxaBits, int canais, int samplingRate
            video = new File(textoInput.getText());

            sound = new Audio(
                    extensao,
                    Integer.parseInt(taxaBitsSeletor.getSelectedItem().toString()) * 1000,
                    Integer.parseInt(taxaCanaisSeletor.getSelectedItem().toString()),
                    Integer.parseInt(taxaSamplingSeletor.getSelectedItem().toString()), ""
            );
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um arquivo de entrada!", "Aviso", 2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoOutputActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInput;
    private javax.swing.JLabel inputNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel outputNome;
    private javax.swing.JLabel taxBitsNome;
    private javax.swing.JComboBox<String> taxaBitsSeletor;
    private javax.swing.JComboBox<String> taxaCanaisSeletor;
    private javax.swing.JComboBox<String> taxaSamplingSeletor;
    private javax.swing.JTextField textoInput;
    private javax.swing.JTextField textoOutput;
    // End of variables declaration//GEN-END:variables

    public boolean getConfirmacao() {
        return this.confirma;
    }

    public File getVideo() {
        return this.video;
    }

    public Audio getAudio() {
        return this.sound;
    }

    public String getOutput() {
        return textoOutput.getText();
    }
}
