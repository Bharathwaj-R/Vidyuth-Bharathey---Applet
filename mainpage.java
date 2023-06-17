import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Exception;

class TableFrame extends JFrame implements ActionListener {
    private String[] columnNames = { "Serial No.", "Year", "Energy Production (MWh)" };
    private Object[][] data = {
            { 1, "2015", 2499 },
            { 2, "2016", 2668 },
            { 3, "2017", 2834 },
            { 4, "2018", 3106 },
            { 5, "2019", 3307 }
    };

    private DefaultTableModel model;
    private JTable table;
    private JTextField yearField, serialField;
    private JTextField productionField;
    private JButton addButton, delButton;

    public TableFrame() {
        setTitle("Wind Energy Production");
        setSize(400, 300);
        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Serial Number: "));
        serialField = new JTextField(4);
        inputPanel.add(serialField);
        inputPanel.add(new JLabel("Year: "));
        yearField = new JTextField(4);
        inputPanel.add(yearField);
        inputPanel.add(new JLabel("Energy Production (MWh): "));
        productionField = new JTextField(4);
        inputPanel.add(productionField);
        addButton = new JButton("Add Data");
        addButton.addActionListener(this);
        inputPanel.add(addButton);

        delButton = new JButton("Delete Data");
        delButton.addActionListener(this);
        inputPanel.add(delButton);
        Color lb = new Color(51, 153, 255);
        inputPanel.setBackground(lb);
        add(inputPanel, BorderLayout.NORTH);
        Color ivory = new Color(0, 255, 51);
        table.setOpaque(true);
        table.setFillsViewportHeight(true);
        table.setBackground(ivory);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String year = yearField.getText();
            String productionString = productionField.getText();
            String serial = serialField.getText();
            int production = Integer.parseInt(productionString);
            int ser = Integer.parseInt(serial);
            model.addRow(new Object[] { ser, year, production });
        } else if (e.getSource() == delButton) {
            String serial = serialField.getText();
            int a = Integer.parseInt(serial);           //typecasting
            model.removeRow(a - 1);
        }
    }
}

class bioTableFrame extends JFrame implements ActionListener {
    private String[] columnNames = { "Serial No.", "State", "Energy Production (MWh)" };
    private Object[][] data = {
            { 1, "Andhra Pradesh", 50 },
            { 2, "Haryana", 50 },
            { 3, "Gujarat", 50 },
            { 4, "Karnataka", 50 },
            { 5, "Kerala", 50 }
    };

    private DefaultTableModel model;
    private JTable table;
    private JTextField yearField, serialField;
    private JTextField productionField;
    private JButton addButton, delButton;

    public bioTableFrame() {
        setTitle("Biomass Energy Production");
        setSize(400, 300);
        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Serial Number: "));
        serialField = new JTextField(4);
        inputPanel.add(serialField);
        inputPanel.add(new JLabel("Year: "));
        yearField = new JTextField(4);
        inputPanel.add(yearField);
        inputPanel.add(new JLabel("Energy Production (MWh): "));
        productionField = new JTextField(4);
        inputPanel.add(productionField);
        addButton = new JButton("Add Data");
        addButton.addActionListener(this);
        inputPanel.add(addButton);

        delButton = new JButton("Delete Data");
        delButton.addActionListener(this);
        inputPanel.add(delButton);
        inputPanel.setBackground(Color.green);
        add(inputPanel, BorderLayout.NORTH);
        Color ivory = new Color(255, 255, 0);
        table.setOpaque(true);
        table.setFillsViewportHeight(true);
        table.setBackground(ivory);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String year = yearField.getText();
            String productionString = productionField.getText();
            String serial = serialField.getText();
            int production = Integer.parseInt(productionString);
            int ser = Integer.parseInt(serial);
            model.addRow(new Object[] { ser, year, production });
        } else if (e.getSource() == delButton) {
            String serial = serialField.getText();
            int a = Integer.parseInt(serial);
            model.removeRow(a - 1);
        }
    }
}

class bioTableFrame1 extends JFrame {
    private String[] columnNames = { "Serial No.", "State", "Energy Production (MWh)" };
    private Object[][] data = {
            { 1, "Andhra Pradesh", 50 },
            { 2, "Haryana", 50 },
            { 3, "Gujarat", 50 },
            { 4, "Karnataka", 50 },
            { 5, "Kerala", 50 }
    };

    private DefaultTableModel model;
    private JTable table;
    private JTextField productionField;
    private JButton addButton, delButton;

    public bioTableFrame1() {
        setTitle("Biomass Energy Production");
        setSize(400, 300);
        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        Color ivory = new Color(255, 102, 102 );
        table.setOpaque(true);
        table.setFillsViewportHeight(true);
        table.setBackground(ivory);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}

class TableFrame1 extends JFrame {
    private String[] columnNames = { "Serial No.", "Year", "Energy Production (MWh)" };
    private Object[][] data = {
            { 1, "2015", 2499 },
            { 2, "2016", 2668 },
            { 3, "2017", 2834 },
            { 4, "2018", 3106 },
            { 5, "2019", 3307 }
    };

    private DefaultTableModel model;
    private JTable table;
    private JTextField yearField, serialField;
    private JTextField productionField;
    private JButton addButton, delButton;

    public TableFrame1() {
        setTitle("Wind Energy Production");
        setSize(400, 300);
        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        Color ivory = new Color(255, 153, 0);
        table.setOpaque(true);
        table.setFillsViewportHeight(true);
        table.setBackground(ivory);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}

class Searching extends JFrame implements ActionListener {
    // initialize button, panel, label, and text field
    JButton b1, b2;
    JPanel newPanel;
    JLabel queryLabel, errorLabel;
    final JTextField query;
    DefaultListModel<String> l1 = new DefaultListModel<>();
    DefaultListModel<Integer> l2 = new DefaultListModel<>();
    Powerplant[] powerplants = new Powerplant[] {
            new Powerplant("Tata Power", "Maharashtra", "Coal", 3300),
            new Powerplant("NTPC Dadri", "Uttar Pradesh", "Gas", 1820),
            new Powerplant("Kudgi Supercritical Thermal Power Project", "Karnataka", "Coal", 4000),
            new Powerplant("Vindhyachal Super Thermal Power Station", "Madhya Pradesh", "Coal", 4760),
            new Powerplant("Sasan Ultra Mega Power Project", "Madhya Pradesh", "Coal", 3960),
            new Powerplant("Kayamkulam Thermal Power Station", "Kerala", "Coal", 1540),
            new Powerplant("NTPC Jhanor Gandhar", "Gujarat", "Coal", 1320),
            new Powerplant("Jhimpir Power Plant", "Sindh", "Coal", 50),
            new Powerplant("Karnaphuli Hydroelectric Power Station", "Chittagong", "Hydroelectric", 576),
            new Powerplant("Muzaffargarh Thermal Power Station", "Punjab", "Coal", 1380),
            new Powerplant("Kota Super Thermal Power Plant", "Rajasthan", "Coal", 1240),
            new Powerplant("Solapur Super Thermal Power Station", "Maharashtra", "Coal", 2700),
            new Powerplant("National Thermal Power Corporation", "Delhi", "Coal", 1650),
            new Powerplant("Talcher Super Thermal Power Station", "Odisha", "Coal", 2700),
            new Powerplant("Kudankulam Nuclear Power Plant", "Tamil Nadu", "Nuclear", 2000),
            new Powerplant("Vindhyachal Super Thermal Power Station", "Madhya Pradesh", "Coal", 4760),
            new Powerplant("Sasan Ultra Mega Power Project", "Madhya Pradesh", "Coal", 3960),
            new Powerplant("Kayamkulam Thermal Power Station", "Kerala", "Coal", 1540),
            new Powerplant("NTPC Jhanor Gandhar", "Gujarat", "Coal", 1320),
            new Powerplant("Jhimpir Power Plant", "Sindh", "Coal", 50),
            new Powerplant("Karnaphuli Hydroelectric Power Station", "Chittagong", "Hydroelectric", 576),
            new Powerplant("Muzaffargarh Thermal Power Station", "Punjab", "Coal", 1380),
            new Powerplant("Kota Super Thermal Power Plant", "Rajasthan", "Coal", 1240),
            new Powerplant("Solapur Super Thermal Power Station", "Maharashtra", "Coal", 2700),
            new Powerplant("National Thermal Power Corporation", "Delhi", "Coal", 1650),
            new Powerplant("Talcher Super Thermal Power Station", "Odisha", "Coal", 2700),
            new Powerplant("Kudankulam Nuclear Power Plant", "Tamil Nadu", "Nuclear", 2000),
            new Powerplant("Kamuthi Solar Power Project", "Tamil Nadu", "Solar", 648),
            new Powerplant("Charanka Solar Park", "Gujarat", "Solar", 562),
            new Powerplant("Bhadla Solar Park", "Rajasthan", "Solar", 2050),
            new Powerplant("Rewa Ultra Mega Solar", "Madhya Pradesh", "Solar", 750),
            new Powerplant("Mandsaur Solar Power Plant", "Madhya Pradesh", "Solar", 250),
            new Powerplant("Kurnool Ultra Mega Solar Park", "Andhra Pradesh", "Solar", 1000),
            new Powerplant("Suzlon One Earth", "Madhya Pradesh", "Solar", 45),
            new Powerplant("Adani Vizhinjam Solar Power Project", "Kerala", "Solar", 250),
            new Powerplant("Ganganagar Solar Park", "Rajasthan", "Solar", 750),
            new Powerplant("Karakkamandapam Solar Power Project", "Tamil Nadu", "Solar", 100),
            new Powerplant("Anantapur Ultra Mega Solar Park", "Andhra Pradesh", "Solar", 1000),
            new Powerplant("Suryapet Ultra Mega Solar Park", "Telangana", "Solar", 1000),
            new Powerplant("Bhadla Phase IV Solar Park", "Rajasthan", "Solar", 1000),
            new Powerplant("Chennai 600 MW Solar Plant", "Tamil Nadu", "Solar", 600),
            new Powerplant("Dholera Solar Park", "Gujarat", "Solar", 500),
            new Powerplant("Irrudayam Solar Power Project", "Tamil Nadu", "Solar", 100),
            new Powerplant("Kolar Solar Power Project", "Karnataka", "Solar", 100),
            new Powerplant("Nokh Solar Power Project", "Rajasthan", "Solar", 100),
            new Powerplant("Palamaneru Solar Power Project", "Andhra Pradesh", "Solar", 100),
            new Powerplant("Raghanesda Solar Park", "Gujarat", "Solar", 750),
            new Powerplant("Vikarabad Solar Power Project", "Telangana", "Solar", 100),
            new Powerplant("Vinukonda Solar Power Project", "Andhra Pradesh", "Solar", 100),
            new Powerplant("Yadadri Solar Power Project", "Telangana", "Solar", 100),
            new Powerplant("Rojmal Wind Farm", "Gujarat", "Wind", 50),
            new Powerplant("Vankusawade Wind Farm", "Maharashtra", "Wind", 50),
            new Powerplant("Khandke Wind Farm", "Maharashtra", "Wind", 50),
            new Powerplant("Gudamalani Wind Farm", "Rajasthan", "Wind", 50),
            new Powerplant("Sarotra Wind Farm", "Gujarat", "Wind", 50),
            new Powerplant("Naliya Wind Farm", "Gujarat", "Wind", 50),
            new Powerplant("Khavda Wind Farm", "Gujarat", "Wind", 50),
            new Powerplant("Dhule Wind Farm", "Maharashtra", "Wind", 50),
            new Powerplant("Kutch Wind Farm", "Gujarat", "Wind", 50),
            new Powerplant("Satara Wind Farm", "Maharashtra", "Wind", 50),
            new Powerplant("Borli Wind Farm", "Maharashtra", "Wind", 50),
            new Powerplant("Dhule Wind Farm", "Maharashtra", "Wind", 50),
            new Powerplant("Muppandal Wind Farm", "Tamil Nadu", "Wind", 1000),
            new Powerplant("Thanet Offshore Wind Farm", "Kent", "Wind", 300),
            new Powerplant("Jhimpir Wind Farm", "Sindh", "Wind", 50),
            new Powerplant("Samana Sukha Wind Farm", "Punjab", "Wind", 50),
            new Powerplant("Katathani Wind Farm", "Tamil Nadu", "Wind", 50),
            new Powerplant("Muppandal Wind Farm", "Tamil Nadu", "Wind", 50),
            new Powerplant("Thanet Offshore Wind Farm", "Kent", "Wind", 50),
            new Powerplant("Jhimpir Wind Farm", "Sindh", "Wind", 50),
            new Powerplant("Samana Sukha Wind Farm", "Punjab", "Wind", 50),
            new Powerplant("Katathani Wind Farm", "Tamil Nadu", "Wind", 50),
            new Powerplant("Tehri Dam", "Uttarakhand", "Hydroelectric", 1000),
            new Powerplant("Bhakra Nangal Dam", "Himachal Pradesh", "Hydroelectric", 1325),
            new Powerplant("Sardar Sarovar Dam", "Gujarat", "Hydroelectric", 1450),
            new Powerplant("Himachal Pradesh Power Corporation Ltd.", "Himachal Pradesh", "Hydroelectric", 1005),
            new Powerplant("NHPC Limited", "Jammu and Kashmir", "Hydroelectric", 1000),
            new Powerplant("Indira Gandhi Dam", "Madhya Pradesh", "Hydroelectric", 1000),
            new Powerplant("Srisailam Dam", "Andhra Pradesh", "Hydroelectric", 816),
            new Powerplant("Nagarjuna Sagar Dam", "Telangana", "Hydroelectric", 816),
            new Powerplant("Perunchani Dam", "Tamil Nadu", "Hydroelectric", 240),
            new Powerplant("Sabar Saddle Dam", "Odisha", "Hydroelectric", 240),
            new Powerplant("Ban Sagar Dam", "Madhya Pradesh", "Hydroelectric", 240),
            new Powerplant("Mettur Dam", "Tamil Nadu", "Hydroelectric", 240),
            new Powerplant("Tawang Hydroelectric Plant", "Arunachal Pradesh", "Hydroelectric", 1000),
            new Powerplant("Dulhasti Hydroelectric Plant", "Jammu and Kashmir", "Hydroelectric", 390),
            new Powerplant("Koyna Hydroelectric Plant", "Maharashtra", "Hydroelectric", 1120),
            new Powerplant("Upper Krishna Project", "Karnataka", "Hydroelectric", 811),
            new Powerplant("Bhavani Sagar Dam", "Tamil Nadu", "Hydroelectric", 240),
            new Powerplant("Upper Indravati Hydroelectric Project", "Chhattisgarh", "Hydroelectric", 500),
            new Powerplant("Lower Kolab Hydroelectric Project", "Odisha", "Hydroelectric", 240),
            new Powerplant("Sharavathi Hydroelectric Project", "Karnataka", "Hydroelectric", 811),
            new Powerplant("Gandhisagar Dam", "Madhya Pradesh", "Hydroelectric", 240),
            new Powerplant("Krishna Raja Sagara Dam", "Karnataka", "Hydroelectric", 240),
            new Powerplant("Farakka Super Thermal Power Station", "West Bengal", "Biomass", 500),
            new Powerplant("Kayamkulam Thermal Power Station", "Kerala", "Biomass", 50),
            new Powerplant("Muzaffarpur Thermal Power Station", "Bihar", "Biomass", 50),
            new Powerplant("Talcher Super Thermal Power Station", "Odisha", "Biomass", 500),
            new Powerplant("Vindhyachal Super Thermal Power Station", "Madhya Pradesh", "Biomass", 500),
            new Powerplant("Sasan Ultra Mega Power Project", "Madhya Pradesh", "Biomass", 500),
            new Powerplant("Kota Super Thermal Power Plant", "Rajasthan", "Biomass", 500),
            new Powerplant("Solapur Super Thermal Power Station", "Maharashtra", "Biomass", 500),
            new Powerplant("NTPC Jhanor Gandhar", "Gujarat", "Biomass", 500),
            new Powerplant("Jhimpir Power Plant", "Sindh", "Biomass", 50),
            new Powerplant("Karnaphuli Hydroelectric Power Station", "Chittagong", "Biomass", 50),
            new Powerplant("Punjab Biomass Power Plant", "Punjab", "Biomass", 50),
            new Powerplant("Rajasthan Biomass Power Plant", "Rajasthan", "Biomass", 50),
            new Powerplant("Tamil Nadu Biomass Power Plant", "Tamil Nadu", "Biomass", 50),
            new Powerplant("Uttar Pradesh Biomass Power Plant", "Uttar Pradesh", "Biomass", 50),
            new Powerplant("West Bengal Biomass Power Plant", "West Bengal", "Biomass", 50),
            new Powerplant("Andhra Pradesh Biomass Power Plant", "Andhra Pradesh", "Biomass", 50),
            new Powerplant("Bihar Biomass Power Plant", "Bihar", "Biomass", 50),
            new Powerplant("Chhattisgarh Biomass Power Plant", "Chhattisgarh", "Biomass", 50),
            new Powerplant("Gujarat Biomass Power Plant", "Gujarat", "Biomass", 50),
            new Powerplant("Haryana Biomass Power Plant", "Haryana", "Biomass", 50),
            new Powerplant("Karnataka Biomass Power Plant", "Karnataka", "Biomass", 50),
            new Powerplant("Kerala Biomass Power Plant", "Kerala", "Biomass", 50)
    };

    Searching() {

        queryLabel = new JLabel();
        queryLabel.setText("Enter a query:");
        query = new JTextField(15);

        errorLabel = new JLabel();

        errorLabel.setText("");
        // set label to button
        b1 = new JButton("Search");
        // create panel to put form elements
        newPanel = new JPanel(new GridLayout(4, 1));
        newPanel.add(queryLabel);
        newPanel.add(query);
        newPanel.add(b1);
        newPanel.setBackground(Color.CYAN);
        newPanel.add(errorLabel);

        add(newPanel, BorderLayout.CENTER);
        // perform action on button click
        b1.addActionListener(this); // add action listener to button
        setTitle(" SEARCH "); // set title to the login form
    }

    // define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent e) // pass action listener as a parameter
    {
        if (e.getSource() == b1) {
            JFrame f = new JFrame("Result of search");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            String queryLabels = query.getText();
            for (Powerplant p : powerplants) {
                if (p.getName().equalsIgnoreCase(queryLabels) || p.getEnergyType().equalsIgnoreCase(queryLabels)
                        || p.getState().equalsIgnoreCase(queryLabels)) {
                    String a = p.getCapacity() + " MW";
                    String[] data = { p.getName(), p.getState(), p.getEnergyType(), a };
                    panel.add(new JList(data));
                    String[] s = { "\t" };
                    panel.add(new JList(s));
                    panel.setBackground(Color.BLACK);
                    f.setVisible(true);
                }
                f.add(panel);
                f.pack();
            }
        }
    }
}

class CreateLoginForm1 extends JFrame implements ActionListener {
    // initialize button, panel, label, and text field
    JButton b3;
    JPanel newPanel2;
    JLabel userLabel1, passLabel1;
    final JTextField textField11, textField22;

    // calling constructor
    CreateLoginForm1() {

        // create label for username
        userLabel1 = new JLabel();
        userLabel1.setText("Username:"); // set label value for textField11

        // create text field to get username from the user
        textField11 = new JTextField(15); // set length of the text

        // create label for password
        passLabel1 = new JLabel();
        passLabel1.setText("Password:"); // set label value for textField22

        // create text field to get password from the user
        textField22 = new JPasswordField(15); // set length for the password

        // create submit button
        b3 = new JButton("SUBMIT"); // set label to button
        b3.setBackground(Color.CYAN);
        // create panel to put form elements
        newPanel2 = new JPanel(new GridLayout(3, 1));
        newPanel2.add(userLabel1); // set username label to panel
        newPanel2.add(textField11); // set text field to panel
        newPanel2.add(passLabel1); // set password label to panel
        newPanel2.add(textField22); // set text field to panel
        newPanel2.add(b3); // set button to panel
        newPanel2.setBackground(Color.LIGHT_GRAY);
        // set border to panel
        add(newPanel2, BorderLayout.CENTER);

        // perform action on button click
        b3.addActionListener(this); // add action listener to button
        setTitle("ADMIN LOGIN"); // set title to the login form
    }

    // define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent ae) // pass action listener as a parameter
    {
        String userValue = textField11.getText(); // get user entered username from the textField11
        String passValue = textField22.getText(); // get user entered pasword from the textField22

        // check whether the credentials are authentic or not
        if (userValue.equals("admin@gmail.com") && passValue.equals("admin")) { // if authentic, navigate user to a new
                                                                                // page

            // create instance of the NewPage
            // NewPage page = new NewPage();
            MenuExample page = new MenuExample();
            page.setBackground(Color.DARK_GRAY);
            // make page visible to the user
            page.setVisible(true);

            // create a welcome label and set it to the new page
            JLabel wel_label = new JLabel("Welcome: " + userValue);
            page.getContentPane().add(wel_label);
        } else {
            // show error message
            MenuExample1 file = new MenuExample1();
            file.setBackground(Color.DARK_GRAY);
            file.setVisible(true);
            JLabel wel_label = new JLabel("Welcome: " + userValue);
            file.getContentPane().add(wel_label);

        }
    }
}

class mainpage {
    public static void main(String arg[]) {
        CreateLoginForm1 form1 = new CreateLoginForm1();
        form1.setSize(500, 200);
        form1.setVisible(true);

    }
}

class MenuExample extends JFrame implements ActionListener {
    JMenu menu, submenu;
    JMenuItem i1, i2;
    JButton openButton, saveButton, bioButton;

    MenuExample() {
        setTitle("Menu Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Searching");
        fileMenu.add(openItem);
        JMenuItem saveItem = new JMenuItem("Wind");
        fileMenu.add(saveItem);
        JMenuItem biopower = new JMenuItem("Biopower");
        fileMenu.add(biopower);

        JToolBar toolBar = new JToolBar();
        add(toolBar, BorderLayout.NORTH);

        openButton = new JButton(openItem.getText());
        toolBar.add(openButton);
        saveButton = new JButton(saveItem.getText());
        toolBar.add(saveButton);
        bioButton = new JButton(biopower.getText());
        toolBar.add(bioButton);
        openButton.addActionListener(this);
        saveButton.addActionListener(this);
        bioButton.addActionListener(this);
        menuBar.setBackground(Color.orange);
        toolBar.setBackground(Color.CYAN);
        openButton.setBackground(Color.LIGHT_GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        bioButton.setBackground(Color.LIGHT_GRAY);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openButton) {
            Searching form = new Searching();
            form.setSize(500, 200);
            form.setVisible(true);
        }
        if (e.getSource() == saveButton) {
            TableFrame frame = new TableFrame();
            frame.setVisible(true);
        }
        if (e.getSource() == bioButton) {
            bioTableFrame frame = new bioTableFrame();
            frame.setVisible(true);
        }
    }
}

class MenuExample1 extends JFrame implements ActionListener {
    JMenu menu, submenu;
    JMenuItem i1, i2;
    JButton openButton, saveButton2, bioButton2;

    MenuExample1() {
        setTitle("Menu Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Searching");
        fileMenu.add(openItem);
        JMenuItem saveItem = new JMenuItem("Wind");
        fileMenu.add(saveItem);
        JMenuItem biopower = new JMenuItem("Biopower");
        fileMenu.add(biopower);

        JToolBar toolBar = new JToolBar();
        add(toolBar, BorderLayout.NORTH);

        openButton = new JButton(openItem.getText());
        toolBar.add(openButton);
        saveButton2 = new JButton(saveItem.getText());
        toolBar.add(saveButton2);
        bioButton2 = new JButton(biopower.getText());
        toolBar.add(bioButton2);
        openButton.addActionListener(this);
        saveButton2.addActionListener(this);
        bioButton2.addActionListener(this);
        menuBar.setBackground(Color.orange);
        toolBar.setBackground(Color.CYAN);
        openButton.setBackground(Color.LIGHT_GRAY);
        saveButton2.setBackground(Color.LIGHT_GRAY);
        bioButton2.setBackground(Color.LIGHT_GRAY);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openButton) {
            Searching form = new Searching();
            form.setSize(500, 200);
            form.setVisible(true);
        }
        if (e.getSource() == saveButton2) {
            TableFrame1 frame1 = new TableFrame1();
            frame1.setSize(500, 200);
            frame1.setVisible(true);
        }
        if (e.getSource() == bioButton2) {
            bioTableFrame1 frame = new bioTableFrame1();
            frame.setSize(500, 200);
            frame.setVisible(true);
        }
    }
}