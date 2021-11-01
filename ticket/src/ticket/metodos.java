package ticket;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class metodos {
    int i = 0;
    String [] Product = new String[]{"Frijol","Arroz","Harina","Sopa"};
    String [][] arreglo = new String [4][4];
    double suma = 0;
    public void CapturaDatos(){      
        
        while(i<4){
        JTextField cantidad = new JTextField();
        JTextField pu = new JTextField();
        String a ="";
        String b ="";
        int j  = 0;
        double resultado1 = 0.00;
        double resultado2 = 0.00;

        /*Object [] inputs = {"Producto: "+Product[i],"Cantidad",cantidad,"Precio Unitario",pu};
        JOptionPane.showMessageDialog(null,inputs,"Datos de productos: ",JOptionPane.QUESTION_MESSAGE);*/
        a = JOptionPane.showInputDialog("Cantidad "+ Product[i]);
        b = JOptionPane.showInputDialog("Precio Unitario "+ Product[i]);
        //a = cantidad.getText();
        //b = pu.getText();
        
            //JOptionPane.showMessageDialog(null,"Dato Ingresado no valido");
        
                    resultado1 = Double.parseDouble(a);
                    resultado2 = Double.parseDouble(b);
                    double resultado3 = resultado1*resultado2;
        while(j<4){
            switch(j){
                case 0:
                    arreglo[i][j]=a;
                    break;
                case 1:
                    arreglo[i][j]=Product[i]; 
                    break;
                case 2:
                    arreglo[i][j]=b;
                    break;
                case 3:
                    suma+=resultado3;
                    arreglo[i][j]=" "+resultado3+" ";
                    break;
            }
            j++;
        }
        i++;
        }
    }
    public void Imprimir(){
        System.out.println();
        System.out.println("------------Ticket------------");
        System.out.println("Cantidad Producto PU Importe");
        for(int j=0;j<arreglo.length;j++){
            for(int k = 0;k<arreglo.length;k++){
                if(k==2){
                     System.out.print(" "+" "+arreglo[j][k]+"\t");
                }
                else if(k==3){
                System.out.print("$"+arreglo[j][k]+"\t");
                }
                else{
                System.out.print(" "+arreglo[j][k]+"\t");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        System.out.println("Total: "+suma);
        //JOptionPane.showMessageDialog(null, "Imprime "+i);

    }
}
