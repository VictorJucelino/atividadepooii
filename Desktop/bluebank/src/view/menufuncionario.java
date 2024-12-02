
package view;

import DAO.ContasDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Contas;
public class menufuncionario extends javax.swing.JFrame implements ActionListener{
    public menufuncionario() {
        initComponents();
        readJTable();
    }
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        ContasDAO contaDao = new ContasDAO();
        modelo.setNumRows(0);  // Limpa a tabela antes de preencher
        for (Contas c : contaDao.read(ftNome.getText())) {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getNumero(),
                c.getTipo(),
                c.getSaldo(),
                c.getLimite(),
                c.getRendimento()
            });
        }
    }
    
    public void jTable1KeyReleased(java.awt.event.KeyEvent evt){
        // Recuperar os dados da linha selecionada
        String nome = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        String numero = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tipo = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String saldo = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String limite = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String rendimento = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();

        // Preencher os campos de texto com os dados da linha selecionada
        ftNome.setText(nome);
        ftNumero.setText(numero);
        
        // Se você tiver um campo de ComboBox para o tipo de conta
        ftTipo.setSelectedItem(tipo);
        
        // Preencher os campos de texto com valores numéricos
        ftSaldo.setText(saldo);
        ftLimite.setText(limite);
        ftRendimento.setText(rendimento);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        flNome = new javax.swing.JLabel();
        ftNome = new javax.swing.JFormattedTextField();
        ftSaldo = new javax.swing.JFormattedTextField();
        flSaldoInicial = new javax.swing.JLabel();
        flTipo = new javax.swing.JLabel();
        ftNumero = new javax.swing.JFormattedTextField();
        flNumero = new javax.swing.JLabel();
        ftTipo = new javax.swing.JComboBox<>();
        flLimite = new javax.swing.JLabel();
        ftLimite = new javax.swing.JFormattedTextField();
        flRendimento = new javax.swing.JLabel();
        ftRendimento = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        ftPesquisa = new javax.swing.JFormattedTextField();
        bPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bAtualizar = new javax.swing.JButton();
        bInserir = new javax.swing.JButton();
        bDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do Funcionario");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(130, 205, 255));

        flNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        flNome.setText("Nome do Cliente:");

        ftNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftNomeActionPerformed(evt);
            }
        });

        ftSaldo.setText("0");

        flSaldoInicial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        flSaldoInicial.setText("Saldo Inicial da Conta:");

        flTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        flTipo.setText("Tipo da Conta:");

        ftNumero.setText("numero preenchido automticamente");
        ftNumero.setEnabled(false);
        ftNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftNumeroActionPerformed(evt);
            }
        });

        flNumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        flNumero.setText("Numero da Conta:");

        ftTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Corrente", "Conta Poupança", "Conta Especial" }));

        flLimite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        flLimite.setText("Valor do Limite:");

        ftLimite.setText("0");
        ftLimite.setEnabled(false);

        flRendimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        flRendimento.setText("Valor do Rendimento (%):");

        ftRendimento.setText("0");
        ftRendimento.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(flNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(flTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ftNome)
                        .addComponent(ftNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flRendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flLimite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flSaldoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(ftLimite, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ftRendimento))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flNome)
                    .addComponent(ftNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flSaldoInicial)
                    .addComponent(ftSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flNumero)
                    .addComponent(ftNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flLimite)
                    .addComponent(ftLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(flRendimento)
                        .addComponent(ftRendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(flTipo)
                        .addComponent(ftTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ftTipo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                String tipoSelecionado = (String) ftTipo.getSelectedItem();
                if (tipoSelecionado == ("Conta Corrente")) {
                    ftLimite.setEnabled(false);
                    ftLimite.setValue(0);
                    ftRendimento.setEnabled(false);
                    ftRendimento.setValue(0);
                } else if (tipoSelecionado == ("Conta Especial")) {
                    ftLimite.setEnabled(true);
                    ftRendimento.setEnabled(false);
                    ftRendimento.setValue(0);
                } else if (tipoSelecionado == ("Conta Poupança")) {
                    ftLimite.setEnabled(false);
                    ftLimite.setValue(0);
                    ftRendimento.setEnabled(true);
                }
            }
        });

        jPanel2.setBackground(new java.awt.Color(130, 205, 255));

        bPesquisar.setText("PESQUISAR");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ftPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ftPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(130, 205, 255));

        bAtualizar.setText("ATUALIZAR");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bInserir.setText("INSERIR");
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        bDeletar.setText("DELETAR");
        bDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(bInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setBackground(new java.awt.Color(164, 218, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Numero", "Tipo", "Saldo", "Limite", "Rendimento"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("CLIQUE AQUI PARA VOLTAR PARA O MENU INICIAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed
        
        Contas conta = new Contas();
        ContasDAO contasDao = new ContasDAO();
        
        conta.setNome(this.ftNome.getText());
        if (this.ftTipo.getSelectedItem().equals("Conta Corrente")) {
            conta.setTipo("corrente");
            conta.setRendimento(0);
            conta.setLimite(0);
        } else if (this.ftTipo.getSelectedItem().equals("Conta Especial")) {
            conta.setTipo("especial");
            conta.setLimite( Double.parseDouble(ftLimite.getText()));
            conta.setRendimento(Double.parseDouble(ftRendimento.getText()));
        } else if (this.ftTipo.getSelectedItem().equals("Conta Poupança")) {
            conta.setTipo("poupanca");
            conta.setRendimento(Double.parseDouble(ftRendimento.getText()));
            conta.setLimite(Double.parseDouble(ftLimite.getText()));
        }
        conta.setSaldo(Double.parseDouble(ftSaldo.getText()));
        contasDao.create(conta);

        // Limpar campos após inserir
        ftNome.setText("");
        ftSaldo.setText("0");
        ftLimite.setText("0");
        ftRendimento.setText("0");
        readJTable();
    }//GEN-LAST:event_bInserirActionPerformed

    private void ftNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftNumeroActionPerformed

    private void ftNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftNomeActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        
        if (jTable1.getSelectedRow() != -1){
            Contas conta = new Contas();
            ContasDAO contaDao = new ContasDAO();
            conta.setNome(this.ftNome.getText());
            conta.setNumero((int) jTable1.getValueAt(jTable1.getSelectedRow(),1));
            if (this.ftTipo.getSelectedItem().equals("Conta Corrente")) {
                conta.setTipo("corrente");
                conta.setRendimento(0);
                conta.setLimite(0);
            } else if (this.ftTipo.getSelectedItem().equals("Conta Especial")) {
                conta.setTipo("especial");
                conta.setLimite( Double.parseDouble(ftLimite.getText()));
                conta.setRendimento(Double.parseDouble(ftRendimento.getText()));
            } else if (this.ftTipo.getSelectedItem().equals("Conta Poupança")) {
                conta.setTipo("poupanca");
                conta.setRendimento(Double.parseDouble(ftRendimento.getText()));
                conta.setLimite(Double.parseDouble(ftLimite.getText()));
            }
            conta.setSaldo(Double.parseDouble(ftSaldo.getText()));
            contaDao.update(conta);
            ftNome.setText("");
            ftSaldo.setText("0");
            ftLimite.setText("0");
            ftRendimento.setText("0");
            readJTable();
        }
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletarActionPerformed
        if (jTable1.getSelectedRow() != -1){
            Contas conta = new Contas();
            ContasDAO contaDao = new ContasDAO();
            conta.setNome(this.ftNome.getText());
            conta.setNumero((int) jTable1.getValueAt(jTable1.getSelectedRow(),1));
            if (this.ftTipo.getSelectedItem().equals("Conta Corrente")) {
                conta.setTipo("corrente");
                conta.setRendimento(0);
                conta.setLimite(0);
            } else if (this.ftTipo.getSelectedItem().equals("Conta Especial")) {
                conta.setTipo("especial");
                conta.setLimite( Double.parseDouble(ftLimite.getText()));
                conta.setRendimento(Double.parseDouble(ftRendimento.getText()));
            } else if (this.ftTipo.getSelectedItem().equals("Conta Poupança")) {
                conta.setTipo("poupanca");
                conta.setRendimento(Double.parseDouble(ftRendimento.getText()));
                conta.setLimite(Double.parseDouble(ftLimite.getText()));
            }
            conta.setSaldo(Double.parseDouble(ftSaldo.getText()));
          
            contaDao.delete(conta);
            ftNome.setText("");
            ftSaldo.setText("0");
            ftLimite.setText("0");
            ftRendimento.setText("0");
             readJTable();
        }
    }//GEN-LAST:event_bDeletarActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        /*ContasDAO cdao = new ContasDAO();
        cdao.read(this.ftPesquisa.getText());*/
        DefaultTableModel ob = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(ftPesquisa.getText()));
        readJTable();
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String nome = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        String numero = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tipo = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String saldo = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String limite = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String rendimento = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();

        // Preencher os campos de texto com os dados da linha selecionada
        ftNome.setText(nome);
        ftNumero.setText(numero);
        
        // Se você tiver um campo de ComboBox para o tipo de conta
        ftTipo.setSelectedItem(tipo);
        
        // Preencher os campos de texto com valores numéricos
        ftSaldo.setText(saldo);
        ftLimite.setText(limite);
        ftRendimento.setText(rendimento);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MenuInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bDeletar;
    private javax.swing.JButton bInserir;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JLabel flLimite;
    private javax.swing.JLabel flNome;
    private javax.swing.JLabel flNumero;
    private javax.swing.JLabel flRendimento;
    private javax.swing.JLabel flSaldoInicial;
    private javax.swing.JLabel flTipo;
    private javax.swing.JFormattedTextField ftLimite;
    private javax.swing.JFormattedTextField ftNome;
    private javax.swing.JFormattedTextField ftNumero;
    private javax.swing.JFormattedTextField ftPesquisa;
    private javax.swing.JFormattedTextField ftRendimento;
    private javax.swing.JFormattedTextField ftSaldo;
    private javax.swing.JComboBox<String> ftTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}