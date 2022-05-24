import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class StudentSuccess extends JFrame {
	static StudentSuccess frame;
	private final JPanel contentPane;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StudentSuccess();
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
	public StudentSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblStudentSection = new JLabel("Student Section");
		lblStudentSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblStudentSection.setForeground(Color.GRAY);
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ViewBooks.main(new String[]{});
			frame.dispose();
			}
		});
		
		JButton btnBuyBooks = new JButton("Buy Books");
		btnBuyBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			BuyBooks.main(new String[]{});
			}
		});
		btnBuyBooks.setFont(new Font("Tahoma", Font.PLAIN, 15));
                
                JButton btnReturnBooks = new JButton("Return Books");
		btnReturnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ReturnBooks.main(new String[]{});
			}
		});
		btnReturnBooks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Logout.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap(150, Short.MAX_VALUE)
				.addComponent(lblStudentSection, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
				.addGap(123))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
				.addGap(134)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnBuyBooks, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnReturnBooks, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(109, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addComponent(lblStudentSection, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
				.addGap(11)
				.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(btnBuyBooks, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
                                .addComponent(btnReturnBooks, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
