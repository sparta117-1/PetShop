/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import Controle.Animal;
import DAO.DaoAnimal;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAnimal extends javax.swing.JFrame {

    /**
     * Creates new form AnimalForm
     */
    public FormAnimal() {
        initComponents();

        preenchertabela();

        //Metodo para incluir o icone
        CriarIcone();

        //Validações - Desabilitando os botoes e campos de textos
        BloquarCamposIniciar();

        //Iniciar o sistema com apenas uma guia
        this.jTabbedPaneGuias.setSelectedIndex(1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneGuias = new javax.swing.JTabbedPane();
        jPanelCadastro = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        lblExpecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanelConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbTodos = new javax.swing.JTable();
        bttNovo = new javax.swing.JButton();
        txtConsulta = new java.awt.TextField();
        chmodelo = new java.awt.Choice();
        chtabela1 = new java.awt.Choice();
        lblCampoPesquisa = new java.awt.Label();
        lblCampoPesquisa1 = new java.awt.Label();
        lblCampoPesquisa2 = new java.awt.Label();
        bttSair = new javax.swing.JButton();
        bttExcluir = new javax.swing.JButton();
        bttEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Animal");
        setMinimumSize(new java.awt.Dimension(560, 328));
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPaneGuias.setMaximumSize(new java.awt.Dimension(550, 330));
        jTabbedPaneGuias.setMinimumSize(new java.awt.Dimension(550, 330));
        jTabbedPaneGuias.setPreferredSize(new java.awt.Dimension(550, 330));

        jPanelCadastro.setName("FormAnimal"); // NOI18N
        jPanelCadastro.setLayout(null);

        lblCodigo.setText("Código");
        jPanelCadastro.add(lblCodigo);
        lblCodigo.setBounds(40, 30, 60, 15);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(txtCodigo);
        txtCodigo.setBounds(40, 50, 90, 25);

        lblNome.setText("Nome");
        jPanelCadastro.add(lblNome);
        lblNome.setBounds(140, 30, 50, 15);
        jPanelCadastro.add(txtNome);
        txtNome.setBounds(140, 50, 389, 25);

        lblRaca.setText("Raça");
        jPanelCadastro.add(lblRaca);
        lblRaca.setBounds(40, 80, 50, 15);
        jPanelCadastro.add(txtRaca);
        txtRaca.setBounds(40, 100, 490, 25);

        lblExpecie.setText("Espécie");
        jPanelCadastro.add(lblExpecie);
        lblExpecie.setBounds(40, 130, 60, 15);
        jPanelCadastro.add(txtEspecie);
        txtEspecie.setBounds(40, 150, 490, 25);

        btnNovo.setText("Novo");
        btnNovo.setMaximumSize(new java.awt.Dimension(63, 23));
        btnNovo.setMinimumSize(new java.awt.Dimension(63, 23));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnNovo);
        btnNovo.setBounds(60, 210, 80, 31);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnSalvar);
        btnSalvar.setBounds(150, 210, 80, 31);

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(63, 23));
        btnCancelar.setMinimumSize(new java.awt.Dimension(63, 23));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnCancelar);
        btnCancelar.setBounds(240, 210, 100, 31);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnExcluir);
        btnExcluir.setBounds(350, 210, 100, 31);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanelCadastro.add(btnSair);
        btnSair.setBounds(460, 210, 70, 31);

        jTabbedPaneGuias.addTab("Cadastro", jPanelCadastro);

        jPanelConsultar.setLayout(null);

        TbTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Raça", "Especie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbTodosMouseClicked(evt);
            }
        });
        TbTodos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TbTodosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TbTodos);

        jPanelConsultar.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 520, 150);

        bttNovo.setText("Novo");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        jPanelConsultar.add(bttNovo);
        bttNovo.setBounds(20, 250, 80, 31);
        jPanelConsultar.add(txtConsulta);
        txtConsulta.setBounds(240, 30, 290, 25);
        jPanelConsultar.add(chmodelo);
        chmodelo.setBounds(130, 30, 100, 25);

        chtabela1.setName(""); // NOI18N
        chtabela1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chtabela1ItemStateChanged(evt);
            }
        });
        jPanelConsultar.add(chtabela1);
        chtabela1.setBounds(10, 30, 110, 25);

        lblCampoPesquisa.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblCampoPesquisa.setText("Dados a pesquisar");
        jPanelConsultar.add(lblCampoPesquisa);
        lblCampoPesquisa.setBounds(240, 10, 100, 20);

        lblCampoPesquisa1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblCampoPesquisa1.setText("Campo de Pesquisa");
        jPanelConsultar.add(lblCampoPesquisa1);
        lblCampoPesquisa1.setBounds(10, 10, 120, 17);

        lblCampoPesquisa2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblCampoPesquisa2.setText("Modelo");
        jPanelConsultar.add(lblCampoPesquisa2);
        lblCampoPesquisa2.setBounds(130, 10, 100, 20);

        bttSair.setText("Sair");
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });
        jPanelConsultar.add(bttSair);
        bttSair.setBounds(300, 250, 70, 31);

        bttExcluir.setText("Excluir");
        bttExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttExcluirMouseClicked(evt);
            }
        });
        bttExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttExcluirActionPerformed(evt);
            }
        });
        bttExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bttExcluirKeyPressed(evt);
            }
        });
        jPanelConsultar.add(bttExcluir);
        bttExcluir.setBounds(200, 250, 90, 31);

        bttEditar.setText("Editar");
        bttEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEditarActionPerformed(evt);
            }
        });
        jPanelConsultar.add(bttEditar);
        bttEditar.setBounds(110, 250, 80, 31);

        jTabbedPaneGuias.addTab("Consultar", jPanelConsultar);

        getContentPane().add(jTabbedPaneGuias);
        jTabbedPaneGuias.setBounds(0, 0, 560, 320);

        setSize(new java.awt.Dimension(574, 355));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimparCamposAnimalNovoCadastro();

        BloquarCamposCancelarCadastro();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        Excluir();

        //Zerar valores contidos na variavel
        LimparCamposAnimalNovoCadastro();

        //Bloquear os campos para salvar
        BloquarCamposNovoCadastro();

        //Prencher a tabela ao carregar
        preenchertabela();


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        //Validações - Habilitando os botoes e campos de textos
        LiberarCamposNovoCadastro();


    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if ("".equals(txtNome.getText())) {

            JOptionPane.showMessageDialog(null, "Por favor prencher o Nome do Animal!");

        } else if ("".equals(txtRaca.getText())) {

            JOptionPane.showMessageDialog(null, "Por favor prencher a Raça do Animal !");

        } else if ("".equals(txtEspecie.getText())) {

            JOptionPane.showMessageDialog(null, "Por favor prencher a Espécie do Animal!");
        } else if ("".equals(txtCodigo.getText())) {

            // Salvar as informações no banco de dados
            Salvar();

            //Zerar valores contidos na variavel
            LimparCamposAnimalNovoCadastro();

            //Bloquear os campos para salvar
            BloquarCamposNovoCadastro();

            //Prencher a tabela ao carregar
            preenchertabela();

            this.jTabbedPaneGuias.setSelectedIndex(1);

        } else {

            Atualizar();

            //Zerar valores contidos na variavel
            LimparCamposAnimalNovoCadastro();

            //Bloquear os campos para salvar
            BloquarCamposNovoCadastro();

            //Prencher a tabela ao carregar
            preenchertabela();

            this.jTabbedPaneGuias.setSelectedIndex(1);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed

        dispose();
    }//GEN-LAST:event_bttSairActionPerformed

    private void chtabela1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chtabela1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_chtabela1ItemStateChanged

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed

        this.jTabbedPaneGuias.setSelectedIndex(0);
        //Validações - Habilitando os botoes e campos de textos

        LiberarCamposNovoConsulta();

        LimparCamposAnimalNovoConsulta();

    }//GEN-LAST:event_bttNovoActionPerformed

    private void bttExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bttExcluirKeyPressed

        Vinculando_txt_jtable();
    }//GEN-LAST:event_bttExcluirKeyPressed

    private void bttExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttExcluirMouseClicked

        Vinculando_txt_jtable();
    }//GEN-LAST:event_bttExcluirMouseClicked

    private void TbTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbTodosMouseClicked

        Vinculando_txt_jtable();

        if (evt.getClickCount() == 2) {

            Vinculando_txt_jtable();

            //Ao clicar no botão voltar a tela
            this.jTabbedPaneGuias.setSelectedIndex(0);

            //Liberar o botão excluir
            LiberarBotõesDuploClickCombo();

            LiberarcamposDuploClickCombo();

        }
    }//GEN-LAST:event_TbTodosMouseClicked

    private void TbTodosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TbTodosKeyPressed

        Vinculando_txt_jtable();

        //Ao clicar no botão voltar a tela
        this.jTabbedPaneGuias.setSelectedIndex(0);


    }//GEN-LAST:event_TbTodosKeyPressed

    private void bttExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttExcluirActionPerformed

        
        Excluir();

        //Zerar valores contidos na variavel
        LimparCamposAnimalNovoCadastro();

        //Bloquear os campos para salvar
        BloquarCamposNovoCadastro();

        //Prencher a tabela ao carregar
        preenchertabela();

    }//GEN-LAST:event_bttExcluirActionPerformed

    private void bttEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEditarActionPerformed

        //Ao clicar no botão voltar a tela
        this.jTabbedPaneGuias.setSelectedIndex(0);

        LiberarcamposUmClickCombo();
    }//GEN-LAST:event_bttEditarActionPerformed

    // <editor-fold desc="Metodos">
    //Metodo de salvar no banco de dados 
    private boolean Salvar() {

        //Classe Controlle get e set
        Animal animal = new Animal();
        animal.setNome(txtNome.getText());
        animal.setRaca(txtRaca.getText());
        animal.setEspecie(txtEspecie.getText());
        
        

        // Classe DAO metodo de salvar
        DaoAnimal daoAnimal = new DaoAnimal();
        daoAnimal.Salvar(animal);
        return true;

    }

    //Metodo de Excluir o registro
    private boolean Excluir() {

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o animal selecionado?", "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            //cria objeto do tipo cliente control
            Animal animal = new Animal();

            animal.setCodigoAnimal(Integer.parseInt(txtCodigo.getText()));

            DaoAnimal DAOanimal = new DaoAnimal();
            DAOanimal.ExcluirAnimal(animal);
            
            JOptionPane.showMessageDialog(this, "Animal excluido com sucesso!");
        } else {
            
            JOptionPane.showMessageDialog(this, "Não foi possivel excluir o animal selecionado!");
        }
        
        //Apos excluir liberar botoes
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(false);

        return true;

    }

    //Metodo para Atualizar o registro
    private boolean Atualizar() {

        //Classe controle animal
        Animal animal = new Animal();
        animal.setCodigoAnimal(Integer.parseInt(txtCodigo.getText()));
        animal.setNome((txtNome.getText()));
        animal.setRaca((txtRaca.getText()));
        animal.setEspecie((txtEspecie.getText()));
        
        
        //Classe DAOAnimal
        DaoAnimal daoAnimal = new DaoAnimal();
        daoAnimal.Atualizar(animal);
        return true;
    }

    //Metodo de prencher a tabela
    private void preenchertabela() {

        DefaultTableModel modelo = (DefaultTableModel) TbTodos.getModel();
        modelo.setNumRows(0);
        DaoAnimal daoAnimal = new DaoAnimal();
        //Percorre a lista copiando os dados para a tabela
        for (Animal p : daoAnimal.listaAnimais()) {

            modelo.addRow(new Object[]{
                p.getCodigoAnimal(),
                p.getNome(),
                p.getRaca(),
                p.getEspecie()
                
            }
            );
        }
    }

    //Metodo de vincular um registro na tabela
    private boolean Vinculando_txt_jtable() {

        if (TbTodos.getSelectedRow() != -1) {

            txtCodigo.setText(TbTodos.getValueAt(TbTodos.getSelectedRow(), 0).toString());
            txtNome.setText(TbTodos.getValueAt(TbTodos.getSelectedRow(), 1).toString());
            txtRaca.setText(TbTodos.getValueAt(TbTodos.getSelectedRow(), 2).toString());
            txtEspecie.setText(TbTodos.getValueAt(TbTodos.getSelectedRow(), 3).toString());

        }
        return true;
    }

    //Metodo para limpar os campos
    public void LimparCamposAnimalNovoConsulta() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtEspecie.setText("");
        txtRaca.setText("");
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(true);
    }

    //Metodo para limpar os campos
    public void LimparCamposAnimalNovoCadastro() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtEspecie.setText("");
        txtRaca.setText("");
    }

    //Metodo para bloquear quando o usuario Iniciar o sistema
    private void BloquarCamposIniciar() {

        txtCodigo.setEnabled(false);
        txtEspecie.setEnabled(false);
        txtNome.setEnabled(false);
        txtRaca.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);

    }

    //Metodo para bloquear quando salvar o novo cadastro
    private void BloquarCamposNovoCadastro() {

        txtCodigo.setEnabled(false);
        txtEspecie.setEnabled(false);
        txtNome.setEnabled(false);
        txtRaca.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);

    }

    //Metodo para bloquear quando o usuario clica em Cancelar
    private void BloquarCamposCancelarCadastro() {

        txtCodigo.setEnabled(false);
        txtEspecie.setEnabled(false);
        txtNome.setEnabled(false);
        txtRaca.setEnabled(false);

        btnCancelar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
    }

    //Metodo para liberar os campos
    private void LiberarCamposNovoConsulta() {

        //Metodo de liberar o campo
        txtEspecie.setEnabled(true);
        txtNome.setEnabled(true);
        txtRaca.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnCancelar.setEnabled(false);

    }

    //Metodo para liberar os campos
    private void LiberarCamposNovoCadastro() {

        //Metodo de liberar o campo
        txtEspecie.setEnabled(true);
        txtNome.setEnabled(true);
        txtRaca.setEnabled(true);

        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);

    }

    //Metodo para liberar os campos ao editar no duplo click
    private void LiberarBotõesDuploClickCombo() {

        btnExcluir.setEnabled(true);
        btnNovo.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);

    }

    private void LiberarcamposDuploClickCombo() {

        //Metodo de liberar o campo
        txtEspecie.setEnabled(true);
        txtNome.setEnabled(true);
        txtRaca.setEnabled(true);

    }

    private void LiberarcamposUmClickCombo() {

        //Metodo de liberar o campo
        txtEspecie.setEnabled(true);
        txtNome.setEnabled(true);
        txtRaca.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);

    }

    //Metodo para criar o icone
    public void CriarIcone() {
        //Adicionar icone no programa
        URL url = this.getClass().getResource("/Img/favicon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }
    // </editor-fold>

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAnimal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnimal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnimal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnimal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbTodos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton bttEditar;
    private javax.swing.JButton bttExcluir;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSair;
    private java.awt.Choice chmodelo;
    private java.awt.Choice chtabela1;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelConsultar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneGuias;
    private java.awt.Label lblCampoPesquisa;
    private java.awt.Label lblCampoPesquisa1;
    private java.awt.Label lblCampoPesquisa2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblExpecie;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JTextField txtCodigo;
    private java.awt.TextField txtConsulta;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}