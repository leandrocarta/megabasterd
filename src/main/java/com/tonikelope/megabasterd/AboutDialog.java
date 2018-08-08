package com.tonikelope.megabasterd;

import java.awt.Dialog;
import javax.swing.JOptionPane;
import static com.tonikelope.megabasterd.MiscTools.*;
import static com.tonikelope.megabasterd.MainPanel.*;
import java.awt.Color;

/**
 *
 * @author tonikelope
 */
public final class AboutDialog extends javax.swing.JDialog {

    public static final String MEGA_URL = "https://mega.nz/";
    public static final String MEGABASTERD_URL = "https://mega.nz/#F!lYsRWaQB!uVhntmyKcVECRaOxAbcL4A";
    public static final String TONIKELOPE_URL = "https://github.com/tonikelope/";
    public static final String MEGACRYPTER_URL = "https://tonikelope.github.io/megacrypter/";
    public static final String SPAIN_URL = "https://en.wikipedia.org/wiki/Spain";
    public static final String MEGABASTERD_GITHUB_URL = "https://tonikelope.github.io/megabasterd/";
    public static final String KIM_URL = "http://www.kim.com/";

    public AboutDialog(MainPanelView parent, boolean modal) {

        super(parent, modal);

        initComponents();

        updateFonts(this.getRootPane(), DEFAULT_FONT, parent.getMain_panel().getZoom_factor());

        translateLabels(getRootPane());

        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_label = new javax.swing.JLabel();
        made_in_spain_label = new javax.swing.JLabel();
        subtitle_label = new javax.swing.JLabel();
        mc_logo_label = new javax.swing.JLabel();
        mcdown_url_button = new javax.swing.JButton();
        author_webpage_label = new javax.swing.JLabel();
        mb_label = new javax.swing.JLabel();
        check_version_button = new javax.swing.JButton();
        dot_com_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setIconImage(null);
        setResizable(false);

        title_label.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        title_label.setText("MegaBasterd " + VERSION);
        title_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        title_label.setDoubleBuffered(true);
        title_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                title_labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                title_labelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                title_labelMouseEntered(evt);
            }
        });

        made_in_spain_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/made_in_spain.jpg"))); // NOI18N
        made_in_spain_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        made_in_spain_label.setDoubleBuffered(true);
        made_in_spain_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                made_in_spain_labelMouseReleased(evt);
            }
        });

        subtitle_label.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        subtitle_label.setForeground(new java.awt.Color(102, 102, 102));
        subtitle_label.setText("Yet another (unofficial) cross-platform MEGA downloader/uploader/streaming suite.");
        subtitle_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtitle_label.setDoubleBuffered(true);
        subtitle_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subtitle_labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subtitle_labelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subtitle_labelMouseEntered(evt);
            }
        });

        mc_logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mega_crypter.png"))); // NOI18N
        mc_logo_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mc_logo_label.setDoubleBuffered(true);
        mc_logo_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mc_logo_labelMouseReleased(evt);
            }
        });

        mcdown_url_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mcdown_url_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-copy-to-clipboard-30.png"))); // NOI18N
        mcdown_url_button.setText("Copy MegaBasterd download URL");
        mcdown_url_button.setDoubleBuffered(true);
        mcdown_url_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcdown_url_buttonActionPerformed(evt);
            }
        });

        author_webpage_label.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        author_webpage_label.setForeground(new java.awt.Color(102, 102, 102));
        author_webpage_label.setText("Made with love (and with no warranty) by tonikelope.");
        author_webpage_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        author_webpage_label.setDoubleBuffered(true);
        author_webpage_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                author_webpage_labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                author_webpage_labelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                author_webpage_labelMouseEntered(evt);
            }
        });

        mb_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mbasterd_logo_nuevo.png"))); // NOI18N
        mb_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mb_label.setDoubleBuffered(true);
        mb_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mb_labelMouseReleased(evt);
            }
        });

        check_version_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        check_version_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-restart-30.png"))); // NOI18N
        check_version_button.setText("Check version");
        check_version_button.setDoubleBuffered(true);
        check_version_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_version_buttonActionPerformed(evt);
            }
        });

        dot_com_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dot_com2.png"))); // NOI18N
        dot_com_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dot_com_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dot_com_labelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(made_in_spain_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dot_com_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(mb_label)
                                .addGap(18, 18, 18)
                                .addComponent(mc_logo_label))
                            .addComponent(author_webpage_label, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(subtitle_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mcdown_url_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_version_button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_label)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mcdown_url_button)
                            .addComponent(check_version_button))))
                .addGap(18, 18, 18)
                .addComponent(subtitle_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(made_in_spain_label)
                    .addComponent(dot_com_label)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mb_label)
                            .addComponent(mc_logo_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(author_webpage_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcdown_url_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcdown_url_buttonActionPerformed

        copyTextToClipboard(MEGABASTERD_URL);

        JOptionPane.showMessageDialog(this, LabelTranslatorSingleton.getInstance().translate("MEGA URL was copied to clipboard!"));
    }//GEN-LAST:event_mcdown_url_buttonActionPerformed

    private void check_version_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_version_buttonActionPerformed

        String old_check_version_button_text = check_version_button.getText();

        check_version_button.setEnabled(false);

        check_version_button.setText(LabelTranslatorSingleton.getInstance().translate("Checking, please wait..."));

        pack();

        final Dialog tthis = this;

        swingInvoke(new Runnable() {
            @Override
            public void run() {

                String[] mega_url_parts = MEGABASTERD_URL.split("!");

                String new_version = checkNewVersion(mega_url_parts[1], mega_url_parts[2]);

                if (new_version != null) {

                    JOptionPane.showMessageDialog(tthis, LabelTranslatorSingleton.getInstance().translate("MegaBasterd NEW VERSION is available! -> ") + new_version);

                } else {

                    JOptionPane.showMessageDialog(tthis, LabelTranslatorSingleton.getInstance().translate("You have the latest version ;)"));
                }

                check_version_button.setText(old_check_version_button_text);

                check_version_button.setEnabled(true);

                pack();

            }
        });

    }//GEN-LAST:event_check_version_buttonActionPerformed

    private void mb_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mb_labelMouseReleased

        openBrowserURL(MEGABASTERD_GITHUB_URL);
    }//GEN-LAST:event_mb_labelMouseReleased

    private void author_webpage_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_author_webpage_labelMouseReleased

        openBrowserURL(TONIKELOPE_URL);
    }//GEN-LAST:event_author_webpage_labelMouseReleased

    private void mc_logo_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mc_logo_labelMouseReleased

        openBrowserURL(MEGACRYPTER_URL);
    }//GEN-LAST:event_mc_logo_labelMouseReleased

    private void made_in_spain_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_made_in_spain_labelMouseReleased

        openBrowserURL(SPAIN_URL);
    }//GEN-LAST:event_made_in_spain_labelMouseReleased

    private void title_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_labelMouseReleased
        openBrowserURL(MEGABASTERD_GITHUB_URL);
    }//GEN-LAST:event_title_labelMouseReleased

    private void author_webpage_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_author_webpage_labelMouseEntered
        author_webpage_label.setForeground(Color.blue);
    }//GEN-LAST:event_author_webpage_labelMouseEntered

    private void author_webpage_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_author_webpage_labelMouseExited
        author_webpage_label.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_author_webpage_labelMouseExited

    private void title_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_labelMouseEntered
        title_label.setForeground(Color.blue);
    }//GEN-LAST:event_title_labelMouseEntered

    private void title_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_labelMouseExited
        title_label.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_title_labelMouseExited

    private void subtitle_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle_labelMouseReleased
        // TODO add your handling code here:
        openBrowserURL(MEGA_URL);
    }//GEN-LAST:event_subtitle_labelMouseReleased

    private void dot_com_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dot_com_labelMouseReleased
        // TODO add your handling code here:
        openBrowserURL(KIM_URL);
    }//GEN-LAST:event_dot_com_labelMouseReleased

    private void subtitle_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle_labelMouseEntered
        // TODO add your handling code here:
        subtitle_label.setForeground(Color.blue);
    }//GEN-LAST:event_subtitle_labelMouseEntered

    private void subtitle_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle_labelMouseExited
        // TODO add your handling code here:
        subtitle_label.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_subtitle_labelMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author_webpage_label;
    private javax.swing.JButton check_version_button;
    private javax.swing.JLabel dot_com_label;
    private javax.swing.JLabel made_in_spain_label;
    private javax.swing.JLabel mb_label;
    private javax.swing.JLabel mc_logo_label;
    private javax.swing.JButton mcdown_url_button;
    private javax.swing.JLabel subtitle_label;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
