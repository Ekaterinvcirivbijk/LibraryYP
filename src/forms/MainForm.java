/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import entities.Appeal;
import entities.Book;
import entities.Library;
import entities.Reader;
import entities.enums.Genre;
import forms.appeal.AppealPanel;
import forms.book.BookPanel;
import forms.reader.ReaderPanel;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author nalbandyan
 */
public class MainForm extends javax.swing.JFrame {
     
    private BookPanel bookPanel;
    private ReaderPanel readerPanel;
    private AppealPanel appealPanel;
    
    private Library library;
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        init();
       
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        jSplitPane1.setDividerLocation(this.getWidth()/2);
        jSplitPane2.setDividerLocation(this.getHeight()*3/5);
        bookPanel = new BookPanel(this, library.getBooks());
        jSplitPane1.setLeftComponent(bookPanel);
        readerPanel = new ReaderPanel(this, library.getReaders());
        jSplitPane1.setRightComponent(readerPanel);
        appealPanel = new AppealPanel(this, library.getHistory());
        jSplitPane2.setBottomComponent(appealPanel);
        
        appealPanel.refresh();
    }
    
    private void init()
    {
        library = new Library();
        
        List<Book> listB = new ArrayList();
        listB.add(new Book("����������� �����", "������ �.�.", Genre.STORY, 150, 25.7));
        listB.add(new Book("�������", "��������� �.�.", Genre.STORY, 100.5, 20));
        listB.add(new Book("������� ������", "������ �.�.", Genre.POEM, 202.5, 40));
        listB.add(new Book("������ ����������", "����������� �.�.", Genre.NOVEL, 400, 70));
        listB.add(new Book("�����", "����������� �.�.", Genre.NOVEL, 450, 82.5));
        library.setBooks(listB);
        
        
        List<Reader> listR = new ArrayList();
        listR.add(new Reader("������ �.�.", "��. ���������, 88 ��. 7", 89065432288l));
        listR.add(new Reader("������ �.�.", "��. ���������, 17", 89382675439l));
        listR.add(new Reader("������� �.�.", "��. �����������, 25, ��. 36", 89185533222l));
        library.setReaders(listR);
        
        List<Appeal> listA = new ArrayList();
        library.setHistory(listA);
    }

    public Library getLibrary()
    {
        return library;
    }
    
    public BookPanel getBookPanel()
    {
        return bookPanel;
    }
    
    public void takeBook()
    {
        Book book = bookPanel.getSelectedBook();
        Reader reader = readerPanel.getSelectedReader();
        if (book != null && !book.isTaken() && reader != null)
        {
            GregorianCalendar now = new GregorianCalendar();
            GregorianCalendar afterWeek = new GregorianCalendar();
            afterWeek.add(GregorianCalendar.DAY_OF_YEAR, 7);
            Appeal appeal = new Appeal(reader, book, now, afterWeek);
            library.getHistory().add(appeal);
            appealPanel.refresh();
            bookPanel.refresh();
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

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" ����������");

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(400);
        jPanel1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jSplitPane2.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}