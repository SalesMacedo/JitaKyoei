/*
 * Created by JFormDesigner on Sun Dec 13 00:03:12 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Brainrain
 */
public class Splash extends JPanel {
	public Splash() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		button1 = new JButton();

		//======== this ========
		setLayout(new BorderLayout());

		//---- button1 ----
		button1.setIcon(new ImageIcon(getClass().getResource("/FPIJ-sobre.png")));
		add(button1, BorderLayout.CENTER);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
