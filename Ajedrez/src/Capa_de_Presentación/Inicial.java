package Capa_de_Presentaci�n;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JComboBox;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.Button;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setTitle("JF-Chess");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 226, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("DNI Jugador 1:");
		label.setBounds(10, 10, 84, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("DNI Jugador 2:");
		label_1.setBounds(10, 42, 84, 22);
		contentPane.add(label_1);
		
		TextField dnij1textField = new TextField();
		dnij1textField.setBounds(99, 10, 99, 22);
		contentPane.add(dnij1textField);
		
		TextField dnij2textField = new TextField();
		dnij2textField.setBounds(100, 42, 99, 22);
		contentPane.add(dnij2textField);
		
		Button verButton = new Button("Ver juegos pendientes");
		verButton.setBounds(10, 80, 188, 22);
		contentPane.add(verButton);
		
		Button nuevaPartidaButton = new Button("Nueva partida");
		nuevaPartidaButton.setBounds(10, 108, 188, 22);
		contentPane.add(nuevaPartidaButton);
		
		Button registrarButton = new Button("Registrar nuevo jugador");
		registrarButton.setBounds(10, 136, 188, 22);
		contentPane.add(registrarButton);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
