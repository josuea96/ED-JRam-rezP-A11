//Josué Alexis Ramírez Pérez A00513622 4º Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddeque;
import EstructurasdeDatos.*;//Se esta importando la libreria

/**
 *
 * @author josuealexis96
 */
public class EDdeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque dq = new Deque();//Creamos un objeto para mandar a llamar
        //a los metodos que se encuentran en la libreria, unicamente los de el
        //deque
        dq.showList();
        dq.insertFirst(40);
        dq.showList();
        dq.insertFirst(14);
        dq.showList();
        dq.insertLast(10);
        dq.showList();
        dq.insertLast("Hola");
        dq.showList();
        dq.insertLast(true);
        dq.showList();
        dq.eNodeFirst();
        dq.showList();
        System.out.println("");
        System.out.println("El tamaño de la fila es de " + dq.getSize());
        System.out.println("");
        dq.eNodeFirst();
        dq.showList();
        System.out.println("El tamaño de la fila es de " + dq.getSize());
        dq.eList();
        System.out.println("");
        dq.showList();
        System.out.println("");
        System.out.println("El tamaño de la fila es de " + dq.getSize());
    }
}
