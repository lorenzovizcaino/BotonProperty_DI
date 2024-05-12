import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Boton extends JButton implements Serializable {

    private Color color;
    private String texto;
    private Boolean activo;
    private int id;
    private PropertyChangeSupport changeSupport;

    public Boton() {

        this.color=Color.GRAY;
        this.texto="Start";
        this.activo=false;
        changeSupport = new PropertyChangeSupport(this);
        this.id=0;
        setText(texto);
        System.out.println("HOLA");

    }

    public int getId() {
        return id;
    }

    public void setId(int nuevoId) {
        int antiguoId=this.id;
        this.id=nuevoId;
        changeSupport.firePropertyChange("id",antiguoId,nuevoId);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color nuevoColor) {
        Color colorAntiguo=this.color;
        this.color=nuevoColor;
        changeSupport.firePropertyChange("color",colorAntiguo,nuevoColor);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
        setText(texto);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public PropertyChangeSupport getChangeSupport() {
        return changeSupport;
    }

    public void setChangeSupport(PropertyChangeSupport changeSupport) {
        this.changeSupport = changeSupport;
    }


    public void addPropertyChangeListener(BotonPropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(BotonPropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }






    public void Cambiar(){

        if(activo){
            setBackground(Color.GREEN);
            setTexto("Start");
        }
        else{
            setBackground(Color.RED);
            setTexto("Stop");
        }
    }


}
