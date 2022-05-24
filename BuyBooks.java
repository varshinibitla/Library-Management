import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuyBooks extends JFrame {
	static BuyBooks frame;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new BuyBooks();
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
	public BuyBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Buy Books");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.GRAY);
		
		JLabel lblBookTitle = new JLabel("Title of the book:");
                JLabel lblBookAuthor = new JLabel("Name of the Author:");
		JLabel lblBookIsbn = new JLabel("Isbn of the book:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
				
		JButton btnBuyBook = new JButton("Buy Book");
		btnBuyBook.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) 
                        {
				
			String BookTitle=textField_1.getText();
                        String BookAuthor=textField_2.getText();
                        String BookIsbn=textField_3.getText();
			
			if(ViewBooks.BOOK_TITLE_1.equals(BookTitle) &&
                           ViewBooks.BOOK_AUTHOR_1.equals(BookAuthor) && 
                           ViewBooks.BOOK_ISBN_1.equals(BookIsbn)) {
                           JOptionPane.showMessageDialog(BuyBooks.this,"Book purchased successfully!");
			   StudentSuccess.main(new String[]{});
			   frame.dispose();
                        }
                            
                        else if(ViewBooks.BOOK_TITLE_2.equals(BookTitle) &&
                           ViewBooks.BOOK_AUTHOR_2.equals(BookAuthor) && 
                           ViewBooks.BOOK_ISBN_2.equals(BookIsbn)){
                           JOptionPane.showMessageDialog(BuyBooks.this,"Book purchased successfully!");
			   StudentSuccess.main(new String[]{});
                           frame.dispose();
                        }
                                
                        else if(ViewBooks.BOOK_TITLE_3.equals(BookTitle) &&
                           ViewBooks.BOOK_AUTHOR_3.equals(BookAuthor) && 
                           ViewBooks.BOOK_ISBN_3.equals(BookIsbn)) {
                           JOptionPane.showMessageDialog(BuyBooks.this,"Book purchased successfully!");
			   StudentSuccess.main(new String[]{});
			   frame.dispose();
                        }
                               
                        else if(ViewBooks.BOOK_TITLE_4.equals(BookTitle) &&
                           ViewBooks.BOOK_AUTHOR_4.equals(BookAuthor) && 
                           ViewBooks.BOOK_ISBN_4.equals(BookIsbn)){
                           JOptionPane.showMessageDialog(BuyBooks.this,"Book purchased successfully!");
			   StudentSuccess.main(new String[]{});
		           frame.dispose();
                        }
                               
                        else if(ViewBooks.BOOK_TITLE_5.equals(BookTitle) &&
                           ViewBooks.BOOK_AUTHOR_5.equals(BookAuthor) && 
                           ViewBooks.BOOK_ISBN_5.equals(BookIsbn)) {
                           JOptionPane.showMessageDialog(BuyBooks.this,"Book purchased successfully!");
			   StudentSuccess.main(new String[]{});
			   frame.dispose();
                        }
                               
                        else if(ViewBooks.BOOK_TITLE_6.equals(BookTitle) &&
                           ViewBooks.BOOK_AUTHOR_6.equals(BookAuthor) && 
                           ViewBooks.BOOK_ISBN_6.equals(BookIsbn)) {
                           JOptionPane.showMessageDialog(BuyBooks.this,"Book purchased successfully!");
		           StudentSuccess.main(new String[]{});
			   frame.dispose();
                        }
            
                        else {
                               JOptionPane.showMessageDialog(null,"The book doesn't exist or Please enter valid book details !");
                               StudentSuccess.main(new String[]{});
			        frame.dispose();
                                }
                        }
                }
                );
		JLabel lblNewLabel_1 = new JLabel("Note: Please check ISBN Carefully!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.RED);
                
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap(10, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
            			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblBookTitle)
				.addComponent(lblBookAuthor)
				.addComponent(lblBookIsbn, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                           				)
				.addGap(10)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								       )
				.addGap(48))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
				.addGap(20)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel_1)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addComponent(btnBuyBook, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addGap(47)
									))
				.addGap(100))))
				.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(146)
				.addComponent(lblNewLabel)
				.addContainerGap(235, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(37)
				.addComponent(lblNewLabel)
				.addGap(43)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
				.addComponent(lblBookTitle)
				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(28)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
				.addComponent(lblBookAuthor)
				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(28)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
				.addComponent(lblBookIsbn)
				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
				.addComponent(btnBuyBook, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addComponent(lblNewLabel_1)
				.addGap(25))
		);
		contentPane.setLayout(gl_contentPane);
	}
                        
                }
                        
