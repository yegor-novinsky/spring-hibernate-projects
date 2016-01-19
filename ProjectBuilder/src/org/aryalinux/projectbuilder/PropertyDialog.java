package org.aryalinux.projectbuilder;

import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PropertyDialog extends GenericDialog implements ActionListener {
	private JTextField name;
	private JTextField label;
	private JComboBox<String> javaDataType;
	private JCheckBox isPrimary;
	private JCheckBox isAutoGenerated;
	private JButton ok, cancel;
	private JPanel okCancelPanel;
	private Property property;

	public PropertyDialog(Window parent) {
		super(parent, "Property");
		add(new JLabel("Name"), 0, 0, 1, 1);
		add(name = new JTextField(30), 1, 0, 1, 1);
		add(new JLabel("Label"), 0, 1, 1, 1);
		add(label = new JTextField(30), 1, 1, 1, 1);
		add(new JLabel("Data Type"), 0, 2, 1, 1);
		add(javaDataType = new JComboBox<String>(), 1, 2, 1, 1);
		add(isPrimary = new JCheckBox("Primary Key"), 1, 3, 1, 1);
		add(isAutoGenerated = new JCheckBox("Auto Generated"), 1, 4, 1, 1);

		okCancelPanel = new JPanel(new GridLayout(1, 2));
		okCancelPanel.add(ok = new JButton("Ok"));
		okCancelPanel.add(cancel = new JButton("Cancel"));

		add(okCancelPanel, 1, 5, 1, 1);

		javaDataType.addItem("String");
		javaDataType.addItem("Integer");
		javaDataType.addItem("java.util.Date");
		javaDataType.addItem("Double");
		
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
		setModal(true);
		pack();
		setSize(getSize().width + 100, getSize().height + 50);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent actionEvent) {
		if (actionEvent.getSource() == ok) {
			property = new Property();
			property.setName(name.getText());
			property.setLabel(label.getText());
			property.setDbDataType(javaDataType.getSelectedItem().toString());
			property.setAutogenerated(isAutoGenerated.isSelected());
			property.setPrimaryKey(isPrimary.isSelected());
		} else {
			property = null;
		}
		this.dispose();
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

}
