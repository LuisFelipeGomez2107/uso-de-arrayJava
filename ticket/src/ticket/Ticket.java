package ticket;
//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Ticket {
    
    public static void main(String[] args) {
        metodos mt = new metodos();
        String aux;
        Object [] opciones ={"Ingresar productos","Imprimir ticket","Salir"}; 
        do{
            Object opcion = JOptionPane.showInputDialog(null,"Selecciona un color", 
                "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
            aux = String.valueOf(opcion);
            
           
            if("Ingresar productos".equals(aux)){
                mt.CapturaDatos();
            }
            else if("Imprimir ticket".equals(aux)){
                mt.Imprimir();
            }
        
        }
        while(!"Salir".equals(aux));

    } 
    
}
