
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class AnaSayfa extends javax.swing.JFrame {

    /**
     * Creates new form AnaSayfa
     */
    public AnaSayfa() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
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
        jPanel2 = new javax.swing.JPanel();
        btn_google = new javax.swing.JButton();
        btn_twitter = new javax.swing.JButton();
        btn_youtube = new javax.swing.JButton();
        btn_facebook = new javax.swing.JButton();
        btn_wikipedia = new javax.swing.JButton();
        btn_yahoo = new javax.swing.JButton();
        btn_amazon = new javax.swing.JButton();
        btn_instagram = new javax.swing.JButton();
        btn_yandex = new javax.swing.JButton();
        btn_reddit = new javax.swing.JButton();
        btn_whatsapp = new javax.swing.JButton();
        btn_github = new javax.swing.JButton();
        btn_yemeksepeti = new javax.swing.JButton();
        btn_hepsiburada = new javax.swing.JButton();
        btn_getir = new javax.swing.JButton();
        btn_letgo = new javax.swing.JButton();
        btn_trendyol = new javax.swing.JButton();
        btn_sahibinden = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Google.png"))); // NOI18N
        btn_google.setText("Google");
        btn_google.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_googleActionPerformed(evt);
            }
        });

        btn_twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Twitter.png"))); // NOI18N
        btn_twitter.setText("Twitter");
        btn_twitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_twitterActionPerformed(evt);
            }
        });

        btn_youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Youtube.png"))); // NOI18N
        btn_youtube.setText("Youtube");
        btn_youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_youtubeActionPerformed(evt);
            }
        });

        btn_facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/facebook.png"))); // NOI18N
        btn_facebook.setText("Facebook");
        btn_facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facebookActionPerformed(evt);
            }
        });

        btn_wikipedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wikipedia.png"))); // NOI18N
        btn_wikipedia.setText("Wikipedia");
        btn_wikipedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_wikipediaActionPerformed(evt);
            }
        });

        btn_yahoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yahooo.png"))); // NOI18N
        btn_yahoo.setText("Yahoo");
        btn_yahoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yahooActionPerformed(evt);
            }
        });

        btn_amazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amazon.png"))); // NOI18N
        btn_amazon.setText("Amazon");
        btn_amazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_amazonActionPerformed(evt);
            }
        });

        btn_instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Instagram.png"))); // NOI18N
        btn_instagram.setText("Instagram");
        btn_instagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_instagramActionPerformed(evt);
            }
        });

        btn_yandex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yandex.png"))); // NOI18N
        btn_yandex.setText("Yandex");
        btn_yandex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yandexActionPerformed(evt);
            }
        });

        btn_reddit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reddit.png"))); // NOI18N
        btn_reddit.setText("Reddit");
        btn_reddit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_redditActionPerformed(evt);
            }
        });

        btn_whatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Whatsapp.png"))); // NOI18N
        btn_whatsapp.setText("Whatsapp");
        btn_whatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_whatsappActionPerformed(evt);
            }
        });

        btn_github.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Github.png"))); // NOI18N
        btn_github.setText("Github");
        btn_github.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_githubActionPerformed(evt);
            }
        });

        btn_yemeksepeti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yemeksepeti.png"))); // NOI18N
        btn_yemeksepeti.setText("Yemeksepeti");
        btn_yemeksepeti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yemeksepetiActionPerformed(evt);
            }
        });

        btn_hepsiburada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hepsiburada.png"))); // NOI18N
        btn_hepsiburada.setText("hepsiburada");
        btn_hepsiburada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hepsiburadaActionPerformed(evt);
            }
        });

        btn_getir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/getir.png"))); // NOI18N
        btn_getir.setText("Getir");
        btn_getir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getirActionPerformed(evt);
            }
        });

        btn_letgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/letgo.png"))); // NOI18N
        btn_letgo.setText("Letgo");
        btn_letgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_letgoActionPerformed(evt);
            }
        });

        btn_trendyol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trendyol.png"))); // NOI18N
        btn_trendyol.setText("Trendyol");
        btn_trendyol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trendyolActionPerformed(evt);
            }
        });

        btn_sahibinden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sahibinden.png"))); // NOI18N
        btn_sahibinden.setText("Sahibinden");
        btn_sahibinden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sahibindenActionPerformed(evt);
            }
        });

        jLabel2.setText("     Developed by ESE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_yahoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_wikipedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_google, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_twitter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_youtube, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_facebook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_amazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_instagram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_yandex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reddit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_whatsapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_github, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_yemeksepeti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hepsiburada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_getir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_letgo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_trendyol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sahibinden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_google)
                    .addComponent(btn_amazon)
                    .addComponent(btn_yemeksepeti, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_twitter)
                        .addComponent(btn_instagram))
                    .addComponent(btn_getir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_youtube)
                        .addComponent(btn_yandex))
                    .addComponent(btn_hepsiburada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_facebook)
                        .addComponent(btn_reddit))
                    .addComponent(btn_trendyol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_wikipedia)
                    .addComponent(btn_whatsapp)
                    .addComponent(btn_letgo))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_yahoo)
                        .addComponent(btn_github))
                    .addComponent(btn_sahibinden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jLabel2))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("         SIK KULLANILAN WEB SİTELERİ");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_googleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_googleActionPerformed
      
        
        Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.google.com.tr/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_btn_googleActionPerformed

    private void btn_twitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_twitterActionPerformed
      
        Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://twitter.com/?lang=tr"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_twitterActionPerformed

    private void btn_youtubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_youtubeActionPerformed
       
        
           Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.youtube.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btn_youtubeActionPerformed

    private void btn_facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facebookActionPerformed
       
          Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.facebook.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_btn_facebookActionPerformed

    private void btn_wikipediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_wikipediaActionPerformed
        
          Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://tr.wikipedia.org/wiki/Anasayfa"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_wikipediaActionPerformed

    private void btn_yahooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yahooActionPerformed
        
          Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.yahoo.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_yahooActionPerformed

    private void btn_amazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_amazonActionPerformed
         Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.amazon.com.tr/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_amazonActionPerformed

    private void btn_instagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_instagramActionPerformed
        Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.instagram.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_instagramActionPerformed

    private void btn_yandexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yandexActionPerformed
         Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://yandex.com.tr/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_yandexActionPerformed

    private void btn_redditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_redditActionPerformed
        Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.reddit.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_redditActionPerformed

    private void btn_whatsappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_whatsappActionPerformed
         Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("vhttps://web.whatsapp.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_whatsappActionPerformed

    private void btn_githubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_githubActionPerformed
         Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://github.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_githubActionPerformed

    private void btn_yemeksepetiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yemeksepetiActionPerformed
        Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.yemeksepeti.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_yemeksepetiActionPerformed

    private void btn_hepsiburadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hepsiburadaActionPerformed
         Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.hepsiburada.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_hepsiburadaActionPerformed

    private void btn_getirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getirActionPerformed
       Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://getir.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_getirActionPerformed

    private void btn_letgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_letgoActionPerformed
         Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.letgo.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_letgoActionPerformed

    private void btn_trendyolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trendyolActionPerformed
         Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.trendyol.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_trendyolActionPerformed

    private void btn_sahibindenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sahibindenActionPerformed
         Desktop d = Desktop.getDesktop();
       
        try {
            d.browse(new URI("https://www.sahibinden.com/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_sahibindenActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_amazon;
    private javax.swing.JButton btn_facebook;
    private javax.swing.JButton btn_getir;
    private javax.swing.JButton btn_github;
    private javax.swing.JButton btn_google;
    private javax.swing.JButton btn_hepsiburada;
    private javax.swing.JButton btn_instagram;
    private javax.swing.JButton btn_letgo;
    private javax.swing.JButton btn_reddit;
    private javax.swing.JButton btn_sahibinden;
    private javax.swing.JButton btn_trendyol;
    private javax.swing.JButton btn_twitter;
    private javax.swing.JButton btn_whatsapp;
    private javax.swing.JButton btn_wikipedia;
    private javax.swing.JButton btn_yahoo;
    private javax.swing.JButton btn_yandex;
    private javax.swing.JButton btn_yemeksepeti;
    private javax.swing.JButton btn_youtube;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
