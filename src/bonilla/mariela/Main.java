package bonilla.mariela;

import bonilla.mariela.gestor.Gestor;
import bonilla.mariela.ui.Controller;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    Controller controller = new Controller();
	    controller.execProgram();
       /* Gestor gestor = new Gestor();
        gestor.add("a");
        gestor.add("b");
        gestor.add("b");
        gestor.add("b");
        gestor.add("c");
        gestor.add("c");
        gestor.add("c");
        gestor.add("c");
        gestor.add("d");
        gestor.add("a");
        gestor.add("a");
        gestor.add("a");
        System.out.println(gestor.compressData());*/
    }
}
