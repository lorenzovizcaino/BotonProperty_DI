import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LaminaAppBotonProperty extends JPanel {
    private Boton boton1;


    public LaminaAppBotonProperty(){
        setLayout(new BorderLayout());

        boton1=new Boton();


        boton1.addPropertyChangeListener(new BotonPropertyChangeListener());

        add(boton1,BorderLayout.CENTER);

        boton1.addActionListener(e->{
            Random random=new Random();
            int rojo=random.nextInt(256);
            int azul=random.nextInt(256);
            int verde=random.nextInt(256);
            //int id=random.nextInt(1000);
            boton1.setColor(new Color(rojo,azul,verde));
            //boton1.setId(id);
            boton1.Cambiar();
        });
    }

}
