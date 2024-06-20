package desin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRepaso {

	private JFrame frame;
	private JTextField tf_color;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRepaso window = new VentanaRepaso();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaRepaso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf_color = new JTextField();
		tf_color.setHorizontalAlignment(SwingConstants.CENTER);
		tf_color.setText("Elige un color y pulsa el botón.");
		tf_color.setBounds(36, 38, 345, 20);
		frame.getContentPane().add(tf_color);
		tf_color.setColumns(10);
		
		JComboBox cbox_colores = new JComboBox();
		cbox_colores.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Rojo", "Verde"}));
		cbox_colores.setBounds(36, 100, 94, 22);
		frame.getContentPane().add(cbox_colores);
		
		JButton btn_cambiarColor = new JButton("Cambiar Color");
		btn_cambiarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String colorSelec = (String) cbox_colores.getSelectedItem();
				Color colorTexto = new Color(0);
				
				switch (colorSelec) {
				case "Azul":
					colorTexto = Color.blue;
					break;
					
				case "Verde":
					colorTexto = Color.green;
					break;
					
				case "Rojo":
					colorTexto = Color.red;
					break;
				}
				
				tf_color.setForeground(colorTexto);
				tf_color.setText("Ahora soy de color " + colorSelec);
				
			}
		});
		btn_cambiarColor.setBounds(252, 100, 129, 23);
		frame.getContentPane().add(btn_cambiarColor);
	}
}
