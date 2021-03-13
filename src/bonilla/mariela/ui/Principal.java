package bonilla.mariela.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Principal {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private PrintStream out = new PrintStream(System.out);

    public void showMenu(){
        out.println("======= Menú de inicio =======");
        out.println("1.Ingresar dato");
        out.println("2.Imprimir lista completa");
        out.println("3.Comprimir informacion");
        out.println("4.Salir");
    }

    public int readNum() throws IOException {
        return Integer.parseInt(in.readLine()) ;
    }

    public String readText() throws IOException {
        return in.readLine();
    }

    public void printMessage(String text){
        out.println(text);
    }



}
