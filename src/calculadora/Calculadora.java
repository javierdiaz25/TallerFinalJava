/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
/**
 * Importación de la libreria swing
 */
import javax.swing.JOptionPane;

/**
 *Realizar una calculadora en Java a nivel de programa de consola, donde deberá cumplir con los siguientes ítems:
 *
 * La calculadora deberá soportar cualquier cantidad de números tanto positivos como negativos, incluyendo su parte decimal.
 * Las operaciones que debe realizar dicha calculadora son: Sumar, Restar, Multiplicar, Dividir y Módulo de la división.
 * Se debe validar el no poder dividir por cero ya que este tipo de operación no existe.
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */
public class Calculadora {


    public static void main(String[] args) {
        /**
            Creación del variables de la clase main.
         */
        double num2=0, orden, result;
        char op;
        
        orden = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para PROCEDER, 2 para SALIR: "));
        result = Double.parseDouble(JOptionPane.showInputDialog("Digite el Primer numero: "));
        do{

                

                op = JOptionPane.showInputDialog("Digite el tipo de operacion: Suma(s)-Resta(r)-Multiplicacion(m)-Division(d)-Modulacion(%)").charAt(0);

                switch (op){
                    case 's':
                    case 'S':
                        //sum = num2+num2;
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
                            result += num2;
                        JOptionPane.showMessageDialog(null, "La suma es: "+result);
                        break;
                    case 'R':
                    case 'r':
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
                        result -= num2;
                        JOptionPane.showMessageDialog(null, "La resta es: "+result);
                        break;
                    case 'M':
                    case 'm':
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
                        result *= num2;
                        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+result);
                        break;
                    case 'd':
                    case 'D':
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
                        if(num2==0){    
                             JOptionPane.showMessageDialog(null, "No se puede efectuar la división entre 0");
                        }else{
                            result /= num2;
                            JOptionPane.showMessageDialog(null, "La division es: "+result);
                        }

                        break;
                     case '%':
                         num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
                        result %= num2;
                        JOptionPane.showMessageDialog(null, "La modulación es: "+result);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No existe la operacion");    
                }
                orden = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para PROCEDER, 2 para SALIR: "));
        }while(orden==1);     
          
    }
    
}
