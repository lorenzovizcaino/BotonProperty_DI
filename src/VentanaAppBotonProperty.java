import javax.swing.*;

public class VentanaAppBotonProperty extends JFrame {
    public VentanaAppBotonProperty(){
        setTitle("Boton Property");
        setBounds(10,10,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaAppBotonProperty laminaAppBotonProperty=new LaminaAppBotonProperty();
        add(laminaAppBotonProperty);
        setVisible(true);
    }

}
