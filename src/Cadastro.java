import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro {
    private JTextField nome;
    private JTextField telefone;
    private JTextField email;
    private JList lista;
    private JButton btnADD;
    private JButton btnDEL;
    private JPanel APP;

    private DefaultListModel<String> modelo = new DefaultListModel<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Contato");
        frame.setContentPane(new Cadastro().APP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public void addCtt(){
        if(!nome.getText().equals("") && !telefone.getText().equals("") && !email.getText().equals("")){
            modelo.addElement(" Nome: "+nome.getText()+ " Telefone: "+telefone.getText()+ " Email: "+email.getText());
        }
    }

    public Cadastro(){
        lista.setModel(modelo);

        btnADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCtt();

            }
        });
        btnDEL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.removeElement(lista.getSelectedValue());

            }
        });

    }
}

