
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author fedem
 */
public class TabellaDati extends javax.swing.JFrame {

    /**
     * Creates new form TabellaDati
     */
    public TabellaDati() {
        Richiamabile();
    }

    public final void Richiamabile() {
        initComponents();
        ImpostaIcona();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        VisualizzaDati = new javax.swing.JButton();
        ChiavePrimaria = new javax.swing.JTextField();
        Argomento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Categoria = new javax.swing.JTextField();
        Autore = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Titolo = new javax.swing.JTextField();
        Editore = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Luogo = new javax.swing.JTextField();
        Anno = new javax.swing.JTextField();
        Inserisci = new javax.swing.JButton();
        Modifica = new javax.swing.JButton();
        Cancella = new javax.swing.JButton();
        Ricerca = new javax.swing.JTextField();
        PulsantePerRicerca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina di ricerca - Documentazione Vittorio Gandolfi");
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Argomento", "Categoria", "Autore", "Titolo", "Editore", "Luogo", "Data "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setEnabled(false);
        jTable1.setFillsViewportHeight(true);
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(91);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }
        int LarghezzaTabella = jTable1.getWidth();
        jTable1.getColumnModel().getColumn(0).setMaxWidth(23);
        jTable1.getColumnModel().getColumn(0).setMinWidth(23);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(90);
        jTable1.getColumnModel().getColumn(1).setMinWidth(90);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(97);
        jTable1.getColumnModel().getColumn(2).setMinWidth(97);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(121);
        jTable1.getColumnModel().getColumn(3).setMinWidth(121);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(2000);
        jTable1.getColumnModel().getColumn(4).setMinWidth(160);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(89);
        jTable1.getColumnModel().getColumn(5).setMinWidth(89);
        jTable1.getColumnModel().getColumn(6).setMaxWidth(77);
        jTable1.getColumnModel().getColumn(6).setMinWidth(77);
        jTable1.getColumnModel().getColumn(7).setMaxWidth(31);
        jTable1.getColumnModel().getColumn(7).setMinWidth(31);

        VisualizzaDati.setText("visualizza dati");
        VisualizzaDati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizzaDatiActionPerformed(evt);
            }
        });

        ChiavePrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiavePrimariaActionPerformed(evt);
            }
        });

        Argomento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArgomentoActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText(" Chiave primaria ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Argomento ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Categoria ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Autore ");

        Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActionPerformed(evt);
            }
        });

        Autore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoreActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Titolo ");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Editore ");

        Titolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitoloActionPerformed(evt);
            }
        });

        Editore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditoreActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Luogo ");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Anno ");

        Anno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnoActionPerformed(evt);
            }
        });

        Inserisci.setText("Inserisci");
        Inserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserisciActionPerformed(evt);
            }
        });

        Modifica.setText("Modifica");
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });

        Cancella.setText("Cancella");
        Cancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancellaActionPerformed(evt);
            }
        });

        Ricerca.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        Ricerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RicercaActionPerformed(evt);
            }
        });

        PulsantePerRicerca.setText("Cerca...");
        PulsantePerRicerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PulsantePerRicercaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ChiavePrimaria, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(Argomento))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Autore, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, 0)
                                        .addComponent(Editore, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, 0)
                                        .addComponent(Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Anno, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Luogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Inserisci, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cancella, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(VisualizzaDati, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                        .addComponent(Ricerca, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PulsantePerRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChiavePrimaria)
                        .addComponent(Categoria)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Luogo)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Argomento)
                    .addComponent(Autore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inserisci)
                    .addComponent(Modifica)
                    .addComponent(Cancella))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VisualizzaDati, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ricerca, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PulsantePerRicerca))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisualizzaDatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizzaDatiActionPerformed
        // TODO add your handling code here:
        try {

            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();

            String sql = "select * from  VittorioDATI01";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                String chiaveprimaria = "<html><center><p>" + String.valueOf(rs.getInt("Chiave primaria")) + "</p></center></html>";
                String argomento = "<html><p>" + rs.getString("argomento") + "</p></html>";
                String categoria = rs.getString("categoria");
                String autore = "<html><p>" + rs.getString("autore") + "</p></html>";
                String titolo = "<html><p>" + rs.getString("titolo") + "</p></html>";
                String editore = "<html><p>" + rs.getString("editore") + "</p></html>";
                String luogo = "<html><p>" + rs.getString("luogo") + "</p></html>";
                String data = "<html><p>" + rs.getString("data") + "</p></html>";

                String tbData[] = {chiaveprimaria, argomento, categoria, autore, titolo, editore, luogo, data};
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

                tblModel.addRow(tbData);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            evt.equals(2);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TabellaDati.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VisualizzaDatiActionPerformed

    private void ChiavePrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiavePrimariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChiavePrimariaActionPerformed

    private void ArgomentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArgomentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArgomentoActionPerformed

    private void EditoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditoreActionPerformed

    private void InserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserisciActionPerformed
        // TODO add your handling code here:
        try {

            if ((ChiavePrimaria.getText().isEmpty()) || (Argomento.getText().isEmpty())
                    || (Autore.getText().isEmpty()) || (Titolo.getText().isEmpty())
                    || (Editore.getText().isEmpty()) || (Luogo.getText().isEmpty())
                    || (Anno.getText().isEmpty())) {
                throw new SQLException("I valori di CHIAVE PRIMARIA, ARGOMENTO, AUTORE, TITOLO, "
                        + "EDITORE, LUOGO e ANNO non possono essere vuoti.");
            }

            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            boolean inserisci = st.execute("INSERT INTO VittorioDati VALUES ('"
                    + ChiavePrimaria.getText() + "', '"
                    + Argomento.getText() + "', '"
                    + Categoria.getText() + "', '"
                    + Autore.getText() + "', '"
                    + Titolo.getText() + "', '"
                    + Editore.getText() + "', '"
                    + Luogo.getText() + "', '"
                    + Anno.getText() + "')");

            if (!inserisci) {
                JOptionPane.showMessageDialog(this, "La riga " + ChiavePrimaria.getText()
                        + " è stata inserita correttamente.",
                        "Inserimento effettuato", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, """
                Errore! Si ricordi che: il valore inserito in CHIAVE
                PRIMARIA deve essere diverso in ogni riga,
                i parametri ARGOMENTO, AUTORE, TITOLO, 
                EDITORE, LUOGO e ANNO sono obbligatori.""",
                    "Errore di inserimento", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_InserisciActionPerformed

    private void RicercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RicercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RicercaActionPerformed

    private void TitoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitoloActionPerformed

    private void AnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnoActionPerformed

    private void CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaActionPerformed

    private void AutoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutoreActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            ResultSet risultato = st.executeQuery("SELECT * FROM VittorioDati");
            while (risultato.next()) {
                ChiavePrimaria.setText(risultato.getString("[Chiave_primaria]"));
                Argomento.setText(risultato.getString("Argomento"));
                Categoria.setText(risultato.getString("Categoria"));
                Autore.setText(risultato.getString("Autore"));
                Titolo.setText(risultato.getString("Titolo"));
                Editore.setText(risultato.getString("Editore"));
                Luogo.setText(risultato.getString("Luogo"));
                Anno.setText(risultato.getString("Anno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void PulsantePerRicercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PulsantePerRicercaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modello = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> selettore = new TableRowSorter<>(modello);
        jTable1.setRowSorter(selettore);
        selettore.setRowFilter(RowFilter.regexFilter("(?i)" + Ricerca.getText()));
    }//GEN-LAST:event_PulsantePerRicercaActionPerformed

    private void CancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancellaActionPerformed
        // TODO add your handling code here:
        try {

            if (ChiavePrimaria.getText().isEmpty()) {
                throw new SQLException("Il valore di CHIAVE PRIMARIA non può essere vuoto.");
            }
            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            int elimina = JOptionPane.showOptionDialog(null,
                    "Si conferma la cancellazione della riga " + ChiavePrimaria.getText() + "?",
                    "Conferma di cancellazione",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Sì", "No", "Annulla"},
                    "Sì");
            ResultSet SelezioneTrovata = st.executeQuery("SELECT * FROM VittorioDati "
                    + "WHERE [Chiave primaria] = " + ChiavePrimaria.getText());
            if (!SelezioneTrovata.next()) {
                throw new SQLException("La CHIAVE PRIMARIA inserita non corrisponde "
                        + "a una riga esistente.");
            }
            if (elimina == 0) {
                if (!st.execute("DELETE FROM VittorioDati WHERE [Chiave primaria] = " + ChiavePrimaria.getText())) {
                    formWindowOpened(null);
                    JOptionPane.showMessageDialog(this, "La riga " + ChiavePrimaria.getText()
                            + " è stata cancellata correttamente.",
                            "Cancellazione effettuata", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, """
                Errore! Si ricordi che il valore inserito in CHIAVE
                PRIMARIA deve corrispondere a una riga esistente.""",
                    "Errore di cancellazione", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CancellaActionPerformed

    private void ModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaActionPerformed
        // TODO add your handling code here:
        try {

            if ((ChiavePrimaria.getText().isEmpty()) || (Argomento.getText().isEmpty())
                    || (Autore.getText().isEmpty()) || (Titolo.getText().isEmpty())
                    || (Editore.getText().isEmpty()) || (Luogo.getText().isEmpty())
                    || (Anno.getText().isEmpty())) {
                throw new SQLException("I valori di CHIAVE PRIMARIA, ARGOMENTO, AUTORE, TITOLO, "
                        + "EDITORE, LUOGO e ANNO non possono essere vuoti.");
            }

            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            ResultSet RigaEsistente = st.executeQuery("SELECT * FROM VittorioDati "
                    + "WHERE [Chiave primaria] = " + ChiavePrimaria.getText());
            if (!RigaEsistente.next()) {
                throw new SQLException("La CHIAVE PRIMARIA inserita non corrisponde "
                        + "a una riga esistente.");
            }
            boolean modifica = st.execute("UPDATE VittorioDati "
                    + "SET Argomento = '" + Argomento.getText() + "', "
                    + "Categoria = '" + Categoria.getText() + "', "
                    + "Autore = '" + Autore.getText() + "', "
                    + "Titolo = '" + Titolo.getText() + "', "
                    + "Editore = '" + Editore.getText() + "', "
                    + "Luogo = '" + Luogo.getText() + "', "
                    + "Data = '" + Anno.getText() + "' "
                    + "WHERE [Chiave primaria] = " + ChiavePrimaria.getText());
            if (!modifica) {
                formWindowOpened(null);
                JOptionPane.showMessageDialog(this, "La riga " + ChiavePrimaria.getText()
                        + " è stata modificata correttamente.",
                        "Modifica effettuata", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, """
                Errore! Si ricordi che: il valore inserito in CHIAVE
                PRIMARIA deve corrispondere a una riga esistente,
                i parametri ARGOMENTO, AUTORE, TITOLO, 
                EDITORE, LUOGO e ANNO sono obbligatori.""",
                    "Errore di modifica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ModificaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        /**
         * try { collegamento Connessione = new collegamento(); Statement st =
         * Connessione.ottieniConnessione(); ResultSet RisultatiCercati =
         * st.executeQuery("SELECT * FROM VittorioDati");
         * RisultatiCercati.last(); ResultSetMetaData DatiOttenuti =
         * RisultatiCercati.getMetaData(); int riga = RisultatiCercati.getRow();
         * int colonna = DatiOttenuti.getColumnCount(); /
         * RisultatiCercati.beforeFirst(); String RigaDati[][] = new
         * String[riga][colonna]; int progressivo = 0; while
         * (RisultatiCercati.next()) { for (int i = 0; i < colonna; i++) {
         * RigaDati[progressivo][i] = RisultatiCercati.getString(i + 1); }
         *
         * progressivo++; }
         *
         * String[] NomeColonna = {"[Chiave_primaria]", "Argomento",
         * "Categoria", "Autore", "Titolo", "Editore", "Luogo", "Anno"};
         * DefaultTableModel modello = (DefaultTableModel) jTable1.getModel();
         * modello.setDataVector(RigaDati, NomeColonna);
         *
         * } catch (Exception e) { e.printStackTrace(); }
         */
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Anno;
    private javax.swing.JTextField Argomento;
    private javax.swing.JTextField Autore;
    private javax.swing.JButton Cancella;
    private javax.swing.JTextField Categoria;
    private javax.swing.JTextField ChiavePrimaria;
    private javax.swing.JTextField Editore;
    private javax.swing.JButton Inserisci;
    private javax.swing.JTextField Luogo;
    private javax.swing.JButton Modifica;
    private javax.swing.JButton PulsantePerRicerca;
    private javax.swing.JTextField Ricerca;
    private javax.swing.JTextField Titolo;
    private javax.swing.JButton VisualizzaDati;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void ImpostaIcona() {
        Image immagine = Toolkit.getDefaultToolkit().getImage("test/IconaProgramma.jpeg");
        setIconImage(immagine);
    }

}
