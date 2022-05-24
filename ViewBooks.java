import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ViewBooks extends JFrame {
	static ViewBooks frame;
	private JPanel contentPane;        
        public static final String BOOK_TITLE_1 = "Freezing Order";
        public static final String BOOK_AUTHOR_1 = "Bill Browder";
        public static final String BOOK_ISBN_1 = "1982153288";
        public static final String BOOK_TITLE_2 = "22 Seconds";
        public static final String BOOK_AUTHOR_2 = "James Patterson";
        public static final String BOOK_ISBN_2 = "0316499374";
        public static final String BOOK_TITLE_3 = "Sea of Tranquility";
        public static final String BOOK_AUTHOR_3 = "Emily St. John Mandel";
        public static final String BOOK_ISBN_3 = "0593321448";
        public static final String BOOK_TITLE_4 = "The Candy House";
        public static final String BOOK_AUTHOR_4 = "Jennifer Egan";
        public static final String BOOK_ISBN_4 = "1476716765";
        public static final String BOOK_TITLE_5 = "How high we go in the dark";
        public static final String BOOK_AUTHOR_5 = "Sequonia Nagamatsu";
        public static final String BOOK_ISBN_5 = "0063072645";
        public static final String BOOK_TITLE_6 = "A Safe House";
        public static final String BOOK_AUTHOR_6 = "Stuart Woods";
        public static final String BOOK_ISBN_6 = "0593331753";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewBooks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    private Component lblViewBooks;

	/**
	 * Create the frame.
	 */
	public ViewBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBooks = new JLabel("Books");
		lblBooks.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBooks.setForeground(Color.GRAY);
		
		JButton btnBook_1 = new JButton("<html>"+"Title:"+BOOK_TITLE_1 +"<br>"+"Author:"+ BOOK_AUTHOR_1+"<br>" +"Isbn:"+ BOOK_ISBN_1+"<html>");
		btnBook_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ViewBooks.main(new String[]{});
			}
                });
		
		JButton btnBook_2 = new JButton("<html>"+"Title:"+BOOK_TITLE_2 +"<br>"+"Author:"+ BOOK_AUTHOR_2+"<br>" +"Isbn:"+ BOOK_ISBN_2+"<html>");
		btnBook_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ViewBooks.main(new String[]{});
			}
		});
		btnBook_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
                
                JButton btnBook_3 = new JButton("<html>"+"Title:"+BOOK_TITLE_3 +"<br>"+"Author:"+ BOOK_AUTHOR_3+"<br>" +"Isbn:"+ BOOK_ISBN_3+"<html>");
		btnBook_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ViewBooks.main(new String[]{});
			}
		});
		btnBook_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
                
                JButton btnBook_4 = new JButton("<html>"+"Title:"+BOOK_TITLE_4 +"<br>"+"Author:"+ BOOK_AUTHOR_4+"<br>" +"Isbn:"+ BOOK_ISBN_4+"<html>");
		btnBook_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ViewBooks.main(new String[]{});
			}
		});
		btnBook_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
                
                JButton btnBook_5 = new JButton("<html>"+"Title:"+BOOK_TITLE_5 +"<br>"+"Author:"+ BOOK_AUTHOR_5+"<br>" +"Isbn:"+ BOOK_ISBN_5+"<html>");
		btnBook_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ViewBooks.main(new String[]{});
			}
		});
		btnBook_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton btnBook_6 = new JButton("<html>"+"Title:"+BOOK_TITLE_6 +"<br>"+"Author:"+ BOOK_AUTHOR_6+"<br>" +"Isbn:"+ BOOK_ISBN_6+"<html>");
		btnBook_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewBooks.main(new String[]{});
				frame.dispose();
			}
                });
                        
                JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBook_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
                
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap(150, Short.MAX_VALUE)
				.addComponent(lblBooks, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
				.addGap(123))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
				.addGap(134)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(btnBook_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnBook_2, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnBook_3, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBook_4, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBook_5, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)               .addComponent(btnBook_6, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)                                                                                     )
			        .addContainerGap(109, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addComponent(lblBooks, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
				.addGap(11)
				.addComponent(btnBook_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(btnBook_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
                                .addComponent(btnBook_3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
                                .addComponent(btnBook_4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
                                .addComponent(btnBook_5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(btnBook_6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
				.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
         
     
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            
            frame.add(panel);
            panel.add(btnBook_1);
            panel.add(btnBook_2);
            panel.add(btnBook_3);
            panel.add(btnBook_4);
            panel.add(btnBook_5);
            panel.add(btnBook_6);
            
            btnBook_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Name of the book:Freezing Order\n"
                + "Name of the Author:Bill Browder\n"
                + "Isbn of the book:1982153288\n"
                + "Description:Gripping thriller chronicling how he became Vladimir Putin's number one enemy by exposing campaign to steal and launder hundreds of billions of dollars and kill anyone who stands in his way. ");
            }
            });
			
            
            btnBook_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog (null,"Name of the book:22 Seconds\n"
                + "Name of the Author:James Patterson\n"
                + "Isbn of the book:0316499374\n"
                + "Description:There's buzz of a last-ditch shipment of drugs and weapons crossing the Mexican border ahead of new restrictive gun laws.");
            }
            });
            
            btnBook_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog (null,"Name of the book:Sea of Tranquility\n"
                + "Name of the Author:Emily St. John Mandel\n"
                + "Isbn of the book:0593321448\n"
                + "Description:Edwin St.Andrew is 18 years old when he crosses the Atlantic by steamship, exiled from polite society following an ill-conceived diatribe at a dinner party.");
            }
            });
        
            btnBook_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Name of the book:The Candy House\n"
                + "Name of the Author:Jennifer Egan\n"
                + "Isbn of the book:1476716765\n"
                + "Description:A visit from the Goon Squad-an electrifying, deeply moving novel about the quest for authenticity and meaning in a world where memories and identities are no longer private.");
            }
            });
        
            btnBook_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Name of the book:How high we go in the dark\n"
                + "Name of the Author:Sequonia Nagamatsu\n"
                + "Isbn of the book:0063072645\n"
                + "Description:Haunting and luminous,How high we go in the dark orchestrates its multitude of memorable voices into beautiful and lucid science fiction.");
            }
            });
        
            btnBook_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Name of the book:A Safe House\n"
                + "Name of the Author:Stuart Woods\n"
                + "Isbn of the book:0593331753\n"
                + "Description:Stone Barrington is looking forward to some quiet time in New York City, until he is asked to transport precious, top-secret cargo across the Atlantic.");
	}
            });
                    }
}
