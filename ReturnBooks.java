import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReturnBooks extends JFrame {
	static ReturnBooks frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
        private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ReturnBooks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReturnBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setForeground(Color.GRAY);
		lblReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblBookTitle = new JLabel("Title of the Book:");
                JLabel lblBookAuthor = new JLabel("Name of the Author:");
		JLabel lblBookIsbn = new JLabel("Isbn of the book:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
                
                textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
                   
			public void actionPerformed(ActionEvent e) {
				String BookTitle=textField.getText();
				String BookAuthor=textField_1.getText();
                                String BookIsbn=textField_2.getText();
                                
				if(ViewBooks.BOOK_TITLE_1.equals(BookTitle) &&
                                   ViewBooks.BOOK_AUTHOR_1.equals(BookAuthor) && 
                                   ViewBooks.BOOK_ISBN_1.equals(BookIsbn)) {
                                   JOptionPane.showMessageDialog(ReturnBooks.this,"Book returned successfully!");
				   StudentSuccess.main(new String[]{});
				   frame.dispose();
                        }
                                else if(ViewBooks.BOOK_TITLE_2.equals(BookTitle) &&
                                   ViewBooks.BOOK_AUTHOR_2.equals(BookAuthor) && 
                                   ViewBooks.BOOK_ISBN_2.equals(BookIsbn)){
                                   JOptionPane.showMessageDialog(ReturnBooks.this,"Book returned successfully!");
				   StudentSuccess.main(new String[]{});
				   frame.dispose();
                        }
                                
                                else if(ViewBooks.BOOK_TITLE_3.equals(BookTitle) &&
                                   ViewBooks.BOOK_AUTHOR_3.equals(BookAuthor) && 
                                   ViewBooks.BOOK_ISBN_3.equals(BookIsbn)) {
                                   JOptionPane.showMessageDialog(ReturnBooks.this,"Book returned successfully!");
				   StudentSuccess.main(new String[]{});
				   frame.dispose();
                        }
                               
                                else if(ViewBooks.BOOK_TITLE_4.equals(BookTitle) &&
                                   ViewBooks.BOOK_AUTHOR_4.equals(BookAuthor) && 
                                   ViewBooks.BOOK_ISBN_4.equals(BookIsbn)){
                                   JOptionPane.showMessageDialog(ReturnBooks.this,"Book returned successfully!");
				   StudentSuccess.main(new String[]{});
				   frame.dispose();
                        }
                               
                               else if(ViewBooks.BOOK_TITLE_5.equals(BookTitle) &&
                                  ViewBooks.BOOK_AUTHOR_5.equals(BookAuthor) && 
                                  ViewBooks.BOOK_ISBN_5.equals(BookIsbn)) {
                                  JOptionPane.showMessageDialog(ReturnBooks.this,"Book returned successfully!");
				  StudentSuccess.main(new String[]{});
				  frame.dispose();
                        }
                               
                                else if(ViewBooks.BOOK_TITLE_6.equals(BookTitle) &&
                                   ViewBooks.BOOK_AUTHOR_6.equals(BookAuthor) && 
                                   ViewBooks.BOOK_ISBN_6.equals(BookIsbn)) {
                                   JOptionPane.showMessageDialog(ReturnBooks.this,"Book returned successfully!");
				   StudentSuccess.main(new String[]{});
				   frame.dispose();
                        }
                       
                                else {
				  JOptionPane.showMessageDialog(ReturnBooks.this,"Sorry, Book doesn't exist or unable to return!");
                                  frame.dispose();
			}
                        }
                }
                );
						
		JLabel lblNewLabel = new JLabel("Note:Please check ISBN carefully!");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			StudentSuccess.main(new String[]{});
			frame.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(36)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
                                .addComponent(lblBookTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(lblBookAuthor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(lblBookIsbn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
				.addGap(56)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(139, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap(210, Short.MAX_VALUE)
				.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
				.addGap(176))
				.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap(205, Short.MAX_VALUE)
				.addComponent(lblReturnBook)
				.addGap(187))
				.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(19)
				.addComponent(lblNewLabel)
				.addContainerGap(294, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap(355, Short.MAX_VALUE)
				.addComponent(btnBack)
				.addGap(46))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblReturnBook)
				.addGap(32)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
				.addComponent(lblBookTitle)
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(34)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
				.addComponent(lblBookAuthor)
				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(34)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
				.addComponent(lblBookIsbn)
	            		.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(29)
				.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
				.addGap(23)
				.addComponent(btnBack)
				.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
				.addComponent(lblNewLabel)
				.addGap(72))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

