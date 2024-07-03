/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import Model.NguoiDung;
import Service.NguoiDungService;
import Utils.XDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class NguoiDungForm extends javax.swing.JPanel {

    private DefaultTableModel dtm = new DefaultTableModel();
    private NguoiDungService service = new NguoiDungService();

    /**
     * Creates new form NguoiDungForm
     */
    public NguoiDungForm() {
        initComponents();
        fillTable(service.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        lblidnguoidung = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txttendangnhap = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        rdonv = new javax.swing.JRadioButton();
        rdochucuahang = new javax.swing.JRadioButton();
        txtngay = new com.toedter.calendar.JDateChooser();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblnd = new javax.swing.JTable();
        jLabel104 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Quản lý người dùng");

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin người dùng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel95.setText("Tên người dùng:");

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel96.setText("ID người dùng:");

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel97.setText("Giới tính");

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel98.setText("Ngày sinh");

        jLabel99.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel99.setText("Số ĐT");

        txthoten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtsdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel105.setText("Vai trò:");

        txtdiachi.setColumns(20);
        txtdiachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtdiachi.setRows(5);
        jScrollPane13.setViewportView(txtdiachi);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Email");

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        lblidnguoidung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblidnguoidung.setText("jLabel3");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel100.setText("Tên đăng nhập:");

        txttendangnhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel106.setText("Địa chỉ :");

        buttonGroup2.add(rdonv);
        rdonv.setSelected(true);
        rdonv.setText("Nhân viên");

        buttonGroup2.add(rdochucuahang);
        rdochucuahang.setText("Chủ cửa hàng");
        rdochucuahang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdochucuahangActionPerformed(evt);
            }
        });

        txtngay.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblidnguoidung, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txttendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addComponent(rdoNam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdoNu))
                                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(12, 12, 12)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel105)
                                .addGap(24, 24, 24)
                                .addComponent(rdonv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdochucuahang)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(lblidnguoidung))
                .addGap(26, 26, 26)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel98)
                        .addComponent(jLabel2)
                        .addComponent(jLabel100)
                        .addComponent(txttendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105)
                        .addComponent(rdonv)
                        .addComponent(rdochucuahang))
                    .addComponent(txtngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)
                            .addComponent(jLabel9)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách người dùng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        tblnd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên đăng nhập", "Tên người dùng", "Giới tính", "Ngày sinh", "Số ĐT", "Email", "Vai trò", "Địa chỉ"
            }
        ));
        tblnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblndMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblnd);

        jLabel104.setText("-");

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Ẩn");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnmoi.setText("Mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane12))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnmoi)
                        .addGap(48, 48, 48)
                        .addComponent(btnthem)
                        .addGap(47, 47, 47)
                        .addComponent(btnsua)
                        .addGap(43, 43, 43)
                        .addComponent(btnxoa)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnmoi))
                .addGap(68, 68, 68)
                .addComponent(jLabel104)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(432, 432, 432))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblndMouseClicked
        int i = tblnd.getSelectedRow();
        Show(i);
    }//GEN-LAST:event_tblndMouseClicked

    private void rdochucuahangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdochucuahangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdochucuahangActionPerformed

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        if (service.addNguoiDung(readForm()) > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            fillTable(service.getAll());
        }
        
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        if(service.updateNguoiDung(readForm())>0){
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            fillTable(service.getAll());
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int i = tblnd.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this,"Bạn có muốn ẩn?","Xác nhận",JOptionPane.YES_NO_OPTION);
        if(chon ==0){
            if(service.anNguoiDung(tblnd.getValueAt(i, 0).toString())>0){
                JOptionPane.showMessageDialog(this, "Ẩn thành công");
                fillTable(service.getAll());
            }
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    public void fillTable(List<NguoiDung> l) {
        dtm = (DefaultTableModel) tblnd.getModel();
        dtm.setRowCount(0);
        for (NguoiDung x : service.getAll()) {
            dtm.addRow(new Object[]{
                x.getID(), x.getTenDangNhap(), x.getHoTen(), x.getGioiTinh(), x.getNgaySinh(), x.getSDT(), x.getEmail(), x.getVaiTro()?"Chủ cửa hàng":"Nhân viên", x.getDiaChi()
            });
        }
    }

    public void clear() {
        lblidnguoidung.setText("");
        txttendangnhap.setText("");
        txthoten.setText("");
        rdoNam.setSelected(true);
        rdonv.setSelected(true);
        txtdiachi.setText("");
        txtemail.setText("");
        txtngay.setToolTipText("");
        txtsdt.setText("");
        txtngay.setDate(XDate.toDate("14/11/2004", "dd/MM/yyyy"));
    }

    public void Show(int i) {
        lblidnguoidung.setText(tblnd.getValueAt(i, 0).toString());
        txttendangnhap.setText(tblnd.getValueAt(i, 1).toString());
        txthoten.setText(tblnd.getValueAt(i, 2).toString());
        if (tblnd.getValueAt(i, 3).toString().equalsIgnoreCase("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtngay.setDate(XDate.toDate(tblnd.getValueAt(i, 4).toString(), "dd/MM/yyyy"));

        txtdiachi.setText(tblnd.getValueAt(i, 8).toString());
        txtemail.setText(tblnd.getValueAt(i, 6).toString());
        if (tblnd.getValueAt(i, 7).toString().equalsIgnoreCase("Nhân viên")) {
            rdonv.setSelected(true);
        } else {
            rdochucuahang.setSelected(true);
        }
        txtsdt.setText(tblnd.getValueAt(i, 5).toString());
    }

    private NguoiDung readForm() {
        NguoiDung n = new NguoiDung();
        n.setID(lblidnguoidung.getText());
        n.setTenDangNhap(txttendangnhap.getText());
        n.setHoTen(txthoten.getText());
        if (rdoNam.isSelected()) {
            n.setGioiTinh("Nam");
        } else {
            n.setGioiTinh("Nữ");
        }
        n.setNgaySinh(XDate.toString(txtngay.getDate(), "yyyy/MM/dd"));
        n.setSDT(txtsdt.getText());
        n.setEmail(txtemail.getText());
        if (rdochucuahang.isSelected()) {
            n.setVaiTro(true);
        } else {
            n.setVaiTro(false);
        }
        n.setDiaChi(txtdiachi.getText());
        return n;
    }
    public boolean Check() {
        Boolean check = true;
        if (txttendangnhap.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã khách hàng không trống");
            check = false;
        }
        if (txthoten.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên khách hàng không trống");
            check = false;
        }
        if (txtngay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được trống");
            check = false;
        } else {

            if (!txtngay.getDateFormatString().equalsIgnoreCase("dd/MM/yyyy")) {
                JOptionPane.showMessageDialog(this, "Ngày sinh sai định dạng");
                check = false;
            }
        }
        if (txtsdt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không trống");
            check = false;
        } else {
            if (!txtsdt.getText().trim().matches("^0\\d{9,10}$")) {
                JOptionPane.showMessageDialog(this, "Số điện thoại phải là số độ dài 9-10");
                check = false;
            }
        }
        
        if (!txtemail.getText().isEmpty()) {
            if (!txtemail.getText().trim().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                JOptionPane.showMessageDialog(this, "Địa chỉ email không đúng định dạng");
                check = false;
            }
        }

        return check;
    }
    
    public boolean CheckT() {
        Boolean check = true;
        if (txttendangnhap.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không trống");
            check = false;
        }
        if (txthoten.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên không trống");
            check = false;
        }
        if (txtngay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được trống");
            check = false;
        } else {

            if (!txtngay.getDateFormatString().equalsIgnoreCase("dd/MM/yyyy")) {
                JOptionPane.showMessageDialog(this, "Ngày sinh sai định dạng");
                check = false;
            }
        }
        if (txtsdt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không trống");
            check = false;
        } else {
            if (!txtsdt.getText().trim().matches("^0\\d{9,10}$")) {
                JOptionPane.showMessageDialog(this, "Số điện thoại phải là số độ dài 9-10");
                check = false;
            }
        }
        
        if (!txtemail.getText().isEmpty()) {
            if (!txtemail.getText().trim().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                JOptionPane.showMessageDialog(this, "Địa chỉ email không đúng định dạng");
                check = false;
            }
        }

        return check;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JLabel lblidnguoidung;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdochucuahang;
    private javax.swing.JRadioButton rdonv;
    private javax.swing.JTable tblnd;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private com.toedter.calendar.JDateChooser txtngay;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttendangnhap;
    // End of variables declaration//GEN-END:variables
}
