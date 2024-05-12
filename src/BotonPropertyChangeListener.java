import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BotonPropertyChangeListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName ( );
        Object oldValue = evt.getOldValue ( );
        Object newValue = evt.getNewValue ( );

        System.out.println ("La propiedad " + propertyName + " ha cambiado.");
        System.out.println ("Valor anterior: " + oldValue);
        System.out.println ("Nuevo valor: " + newValue);

        Boton boton;
        boton =(Boton) evt.getSource();

//        if(propertyName.equals("background")){
//            if(!oldValue.equals(newValue)){
//                boton.setActivo(!boton.getActivo());
//            }
//        }

        if(propertyName.equals("color")){
            if(!oldValue.equals(newValue)){
                boton.setActivo(!boton.getActivo());
            }
        }




    }
}
