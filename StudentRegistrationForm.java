import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class StudentRegistrationForm extends JFrame {

    public StudentRegistrationForm() {
        this.setTitle("Form1");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

		
        // for date combobox
		
		
        for month combobox
		JComboBox monthComboBox = new JComboBox();
		monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", 
														"April", "May", "June", "July", "August", 
														"September","October", "November", "December"}));
		monthComboBox.setBounds(316, 448, 90, 17);
		this.add(monthComboBox);
		
        // for yearComboBox

		String[] yearArray = new String[121];
		for(int i=0;i<121;i++)
			yearArray[i] = Integer.toString(i+1900);
		
		JComboBox yearComboBox = new JComboBox();
		yearComboBox.setModel(new DefaultComboBoxModel(yearArray));
		yearComboBox.setBounds(418, 448, 60, 17);
		this.add(yearComboBox);

        // Form Title
        JLabel formTitle = new JLabel("Student's Registration Form");
        formTitle.setBounds(100, 50, 400, 30);
        formTitle.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(formTitle);

        // Student ID Label and Text Field
        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setBounds(50, 100, 100, 20);
        this.add(studentIdLabel);

        JTextField studentIdTextField = new JTextField();
        studentIdTextField.setBounds(150, 100, 150, 20);
        this.add(studentIdTextField);

        // School Year Label and Combobox
        JLabel schoolYearLabel = new JLabel("School Year:");
        schoolYearLabel.setBounds(450, 100, 100, 20);
        this.add(schoolYearLabel);

        // Get current year and create an array of years for the combobox
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String[] years = new String[10];
        for (int i = 0; i < years.length; i++) {
            years[i] = String.valueOf(currentYear - years.length + 1 + i);
        }

        JComboBox<String> schoolYearComboBox = new JComboBox<>(years);
        schoolYearComboBox.setSelectedIndex(years.length - 1); // Select current year by default
        schoolYearComboBox.setBounds(550, 100, 150, 20);
        this.add(schoolYearComboBox);

        // Labels for First, Middle, and Last Name
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(50, 150, 100, 20);
        this.add(firstNameLabel);

        JLabel middleNameLabel = new JLabel("Middle Name:");
        middleNameLabel.setBounds(300, 150, 100, 20);
        this.add(middleNameLabel);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(550, 150, 100, 20);
        this.add(lastNameLabel);

        // Text Fields for First, Middle, and Last Name
        JTextField firstNameTextField = new JTextField();
        firstNameTextField.setBounds(150, 150, 150, 20);
        this.add(firstNameTextField);

        JTextField middleNameTextField = new JTextField();
        middleNameTextField.setBounds(400, 150, 150, 20);
        this.add(middleNameTextField);

        JTextField lastNameTextField = new JTextField();
        lastNameTextField.setBounds(650, 150, 150, 20);
        this.add(lastNameTextField);

        // Address Label and Text Area
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 200, 100, 20);
        this.add(addressLabel);

        JTextArea addressTextArea = new JTextArea();
        addressTextArea.setBounds(150, 200, 150, 20);
        this.add(addressTextArea);

        // Date of Birth Label and Combobox (assuming YYYY-MM-DD format)
        JLabel dateOfBirthLabel = new JLabel("Date of Birth:");
        dateOfBirthLabel.setBounds(50, 270, 100, 20);
        this.add(dateOfBirthLabel);

        // String[] dates = {"2013-12-27", "2014-01-01", "2"};

        // ... existing code from previous part ...

        // // Month Combobox for Date of Birth
        String[] dateArray = new String[31];
		for(int i=0;i<31;i++)
			dateArray[i] = Integer.toString(i+1);
		
		JComboBox dateComboBox = new JComboBox();
		dateComboBox.setModel(new DefaultComboBoxModel(dateArray));
        dateComboBox.setBounds(250, 270, 50, 20);
        this.add(dateComboBox);

        // // Year Combobox for Date of Birth (assuming YYYY format)
        // JComboBox<String> yearComboBox = new JComboBox<>(new String[100]); // Adjust size based on desired year range
        // for (int i = 0; i < yearComboBox.getItemCount(); i++) {
        //     yearComboBox.addItem(String.valueOf(currentYear - i));
        // }
        // yearComboBox.setSelectedIndex(0); // Select current year by default
        // yearComboBox.setBounds(310, 270, 70, 20);
        // this.add(yearComboBox);

        // // Day Combobox for Date of Birth
        // JComboBox<String> dayComboBox = new JComboBox<>(new String[31]); // Adjust size based on maximum days
        // for (int i = 1; i <= dayComboBox.getItemCount(); i++) {
        //     dayComboBox.addItem(String.valueOf(i));
        // }
        // dayComboBox.setSelectedIndex(0); // Select first day by default
        // dayComboBox.setBounds(390, 270, 50, 20);
        // this.add(dayComboBox);

        // // Gender Radio Buttons
        // JLabel genderLabel = new JLabel("Gender:");
        // genderLabel.setBounds(50, 320, 100, 20);
        // this.add(genderLabel);

        // JRadioButton maleRadioButton = new JRadioButton("Male");
        // maleRadioButton.setBounds(150, 320, 70, 20);
        // maleRadioButton.setSelected(true);
        // this.add(maleRadioButton);

        // JRadioButton femaleRadioButton = new JRadioButton("Female");
        // femaleRadioButton.setBounds(220, 320, 70, 20);
        // ButtonGroup genderButtonGroup = new ButtonGroup();
        // genderButtonGroup.add(maleRadioButton);
        // genderButtonGroup.add(femaleRadioButton);
        // this.add(femaleRadioButton);

        // // Contact Number Label and Text Field
        // JLabel contactNumberLabel = new JLabel("Contact Number:");
        // contactNumberLabel.setBounds(450, 320, 100, 20);
        // this.add(contactNumberLabel);

        // JTextField contactNumberTextField = new JTextField();
        // contactNumberTextField.setBounds(550, 320, 150, 20);
        // this.add(contactNumberTextField);

        // // Checkbox for Guardian Permission
        // JCheckBox guardianPermissionCheckbox = new JCheckBox("Guardian Permission");
        // guardianPermissionCheckbox.setBounds(50, 350, 200, 20);
        // this.add(guardianPermissionCheckbox);

        // // Submit Button
        // JButton submitButton = new JButton("Submit");
        // submitButton.setBounds(300, 400, 100, 30);
        // submitButton.addActionListener(e -> {
        //     // Implement action on submit button click, like displaying a confirmation message
        //     JOptionPane.showMessageDialog(StudentRegistrationForm.this, "Registration Submitted!");
        // });
        // this.add(submitButton);

        // // Reset Button
        // JButton resetButton = new JButton("Reset");
        // resetButton.setBounds(450, 400, 100, 30);
        // resetButton.addActionListener(e -> {
        //     // Implement action on reset button click, like clearing form fields
        //     studentIdTextField.setText("");
        //     firstNameTextField.setText("");
        //     middleNameTextField.setText("");
        //     lastNameTextField.setText("");
        //     addressTextArea.setText("");
        //     // ... reset other fields and comboboxes as needed
        // });
        // this.add(resetButton);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}