/*
 * Copyright (C) 2018 tonikelope
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.tonikelope.megabasterd;

import static com.tonikelope.megabasterd.MainPanel.DEFAULT_FONT;
import static com.tonikelope.megabasterd.MainPanel.THREAD_POOL;
import static com.tonikelope.megabasterd.MiscTools.swingInvoke;
import static com.tonikelope.megabasterd.MiscTools.translateLabels;
import static com.tonikelope.megabasterd.MiscTools.truncateText;
import static com.tonikelope.megabasterd.MiscTools.updateFonts;
import java.awt.Desktop;
import java.awt.Dialog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.Integer.MAX_VALUE;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author tonikelope
 */
public class FileMergerDialog extends javax.swing.JDialog {

    private final MainPanel _main_panel;
    private File _output_dir = null;
    private long _progress = 0L;
    private final ArrayList<String> _file_parts = new ArrayList<>();
    private String _file_name = null;
    private long _file_size = 0L;

    /**
     * Creates new form FileSplitterDialog
     */
    public FileMergerDialog(MainPanelView parent, boolean modal) {
        super(parent, modal);
        _main_panel = parent.getMain_panel();
        initComponents();
        updateFonts(this.getRootPane(), DEFAULT_FONT, _main_panel.getZoom_factor());
        translateLabels(getRootPane());
        jProgressBar2.setMinimum(0);
        jProgressBar2.setMaximum(MAX_VALUE);
        jProgressBar2.setStringPainted(true);
        jProgressBar2.setValue(0);
        jProgressBar2.setVisible(false);

        pack();
    }

    private boolean _mergeFile() throws IOException {

        try (RandomAccessFile targetFile = new RandomAccessFile(this.file_name_label.getText(), "rw")) {

            FileChannel targetChannel = targetFile.getChannel();

            for (String file_path : this._file_parts) {

                RandomAccessFile rfile = new RandomAccessFile(file_path, "r");

                targetChannel.transferFrom(rfile.getChannel(), this._progress, rfile.length());

                this._progress += rfile.length();

                swingInvoke(
                        new Runnable() {
                    @Override
                    public void run() {

                        jProgressBar2.setValue((int) Math.ceil((MAX_VALUE / (double) _file_size * _progress)));
                    }
                });
            }
        }

        return true;
    }

    private void _deleteParts() {

        for (String file_path : this._file_parts) {

            File file = new File(file_path);

            file.delete();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        file_button = new javax.swing.JButton();
        file_name_label = new javax.swing.JLabel();
        output_button = new javax.swing.JButton();
        file_size_label = new javax.swing.JLabel();
        output_folder_label = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        merge_button = new javax.swing.JButton();
        delete_parts_checkbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("File Merger");
        setResizable(false);

        file_button.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        file_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-file-30.png"))); // NOI18N
        file_button.setText("Select (any) file part");
        file_button.setDoubleBuffered(true);
        file_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_buttonActionPerformed(evt);
            }
        });

        file_name_label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        file_name_label.setDoubleBuffered(true);

        output_button.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        output_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-folder-30.png"))); // NOI18N
        output_button.setText("Change output folder");
        output_button.setDoubleBuffered(true);
        output_button.setEnabled(false);
        output_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                output_buttonActionPerformed(evt);
            }
        });

        file_size_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        file_size_label.setDoubleBuffered(true);

        output_folder_label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        output_folder_label.setDoubleBuffered(true);

        jProgressBar2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jProgressBar2.setDoubleBuffered(true);

        merge_button.setBackground(new java.awt.Color(102, 204, 255));
        merge_button.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        merge_button.setForeground(new java.awt.Color(255, 255, 255));
        merge_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-glue-30.png"))); // NOI18N
        merge_button.setText("MERGE FILE");
        merge_button.setDoubleBuffered(true);
        merge_button.setEnabled(false);
        merge_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merge_buttonActionPerformed(evt);
            }
        });

        delete_parts_checkbox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        delete_parts_checkbox.setSelected(true);
        delete_parts_checkbox.setText("Delete parts after merge");
        delete_parts_checkbox.setDoubleBuffered(true);
        delete_parts_checkbox.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete_parts_checkbox)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(file_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(file_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(output_button, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(file_size_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(output_folder_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(merge_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(file_button)
                .addGap(9, 9, 9)
                .addComponent(file_name_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(file_size_label)
                .addGap(18, 18, 18)
                .addComponent(output_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(output_folder_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(delete_parts_checkbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(merge_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void file_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_buttonActionPerformed
        // TODO add your handling code here:

        this.file_button.setText(LabelTranslatorSingleton.getInstance().translate("Selecting file..."));

        this.file_button.setEnabled(false);

        JFileChooser filechooser = new javax.swing.JFileChooser();

        updateFonts(filechooser, DEFAULT_FONT, (float) (_main_panel.getZoom_factor() * 1.25));

        filechooser.setDialogTitle("Select any part of the original file");

        filechooser.setAcceptAllFileFilterUsed(false);

        if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION && filechooser.getSelectedFile().canRead()) {

            this._file_name = MiscTools.findFirstRegex("^(.+)\\.part[0-9]+$", filechooser.getSelectedFile().getName(), 1);

            if (this._file_name != null) {

                this.file_name_label.setText(truncateText(filechooser.getSelectedFile().getParentFile().getAbsolutePath() + "/" + this._file_name, 100));

                this.file_name_label.setToolTipText(filechooser.getSelectedFile().getParentFile().getAbsolutePath() + "/" + this._file_name);

                this.output_folder_label.setText(truncateText(filechooser.getSelectedFile().getParentFile().getAbsolutePath(), 100));

                this.output_folder_label.setToolTipText(filechooser.getSelectedFile().getParentFile().getAbsolutePath());

                this._output_dir = new File(filechooser.getSelectedFile().getParentFile().getAbsolutePath());

                File directory = filechooser.getSelectedFile().getParentFile();

                File[] fList = directory.listFiles();

                _file_size = 0L;

                for (File file : fList) {

                    if (file.isFile() && file.canRead() && file.getName().startsWith(this._file_name + ".part")) {

                        this._file_parts.add(file.getAbsolutePath());

                        _file_size += file.length();

                    }
                }

                Collections.sort(this._file_parts);

                this.file_size_label.setText(MiscTools.formatBytes(_file_size));

                this.output_button.setEnabled(true);

                this.delete_parts_checkbox.setEnabled(true);

                this.merge_button.setEnabled(true);
            }

        }

        this.file_button.setText(LabelTranslatorSingleton.getInstance().translate("Select (any) file part"));

        this.file_button.setEnabled(true);

        pack();

    }//GEN-LAST:event_file_buttonActionPerformed

    private void output_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_output_buttonActionPerformed
        // TODO add your handling code here:

        this.output_button.setText(LabelTranslatorSingleton.getInstance().translate("Changing output folder..."));

        this.file_button.setEnabled(false);

        this.output_button.setEnabled(false);

        this.merge_button.setEnabled(false);

        this.delete_parts_checkbox.setEnabled(false);

        JFileChooser filechooser = new javax.swing.JFileChooser();

        updateFonts(filechooser, DEFAULT_FONT, (float) (_main_panel.getZoom_factor() * 1.25));

        filechooser.setDialogTitle("Add directory");

        filechooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        filechooser.setAcceptAllFileFilterUsed(false);

        if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION && filechooser.getSelectedFile().canRead()) {

            this._output_dir = filechooser.getSelectedFile();

            this.output_folder_label.setText(truncateText(this._output_dir.getAbsolutePath(), 100));

            this.output_folder_label.setToolTipText(this._output_dir.getAbsolutePath());
        }

        this.output_button.setText(LabelTranslatorSingleton.getInstance().translate("Change output folder"));

        this.file_button.setEnabled(true);

        this.output_button.setEnabled(true);

        this.merge_button.setEnabled(true);

        this.delete_parts_checkbox.setEnabled(true);

        pack();
    }//GEN-LAST:event_output_buttonActionPerformed

    private void merge_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merge_buttonActionPerformed
        // TODO add your handling code here:

        if (this._output_dir != null) {

            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

            this.merge_button.setText(LabelTranslatorSingleton.getInstance().translate("MERGING FILE..."));

            this.file_button.setEnabled(false);

            this.output_button.setEnabled(false);

            this.merge_button.setEnabled(false);

            this.delete_parts_checkbox.setEnabled(false);

            this.jProgressBar2.setVisible(true);

            pack();

            Dialog tthis = this;

            THREAD_POOL.execute(new Runnable() {
                @Override
                public void run() {

                    try {
                        if (_mergeFile()) {
                            if (delete_parts_checkbox.isSelected()) {
                                _deleteParts();
                            }

                            JOptionPane.showMessageDialog(tthis, LabelTranslatorSingleton.getInstance().translate("File successfully merged!"));

                            if (Desktop.isDesktopSupported()) {
                                try {
                                    Desktop.getDesktop().open(new File(file_name_label.getText()).getParentFile());
                                } catch (IOException ex) {

                                }
                            }

                            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                            setVisible(false);

                        } else {
                            _file_parts.clear();

                            file_name_label.setText("");

                            file_size_label.setText("");

                            output_folder_label.setText("");

                            _output_dir = null;

                            _file_name = null;

                            _file_size = 0L;

                            _progress = 0L;

                            jProgressBar2.setMinimum(0);
                            jProgressBar2.setMaximum(MAX_VALUE);
                            jProgressBar2.setStringPainted(true);
                            jProgressBar2.setValue(0);
                            jProgressBar2.setVisible(false);

                            merge_button.setText(LabelTranslatorSingleton.getInstance().translate("MERGE FILE"));

                            file_button.setEnabled(true);

                            output_button.setEnabled(true);

                            merge_button.setEnabled(true);

                            delete_parts_checkbox.setEnabled(true);

                            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                            pack();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(FileMergerDialog.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            });

        }
    }//GEN-LAST:event_merge_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox delete_parts_checkbox;
    private javax.swing.JButton file_button;
    private javax.swing.JLabel file_name_label;
    private javax.swing.JLabel file_size_label;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JButton merge_button;
    private javax.swing.JButton output_button;
    private javax.swing.JLabel output_folder_label;
    // End of variables declaration//GEN-END:variables
}
