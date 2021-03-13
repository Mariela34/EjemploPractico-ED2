package bonilla.mariela.ui;

import bonilla.mariela.gestor.Gestor;

import java.io.IOException;

public class Controller {
    private Principal ui;
    private Gestor gestor;

    public Controller() {
        ui = new Principal();
        gestor = new Gestor();
    }

    public void execProgram() throws IOException {
        int option = 5;
        ui.printMessage("\nBienvenido");
        do {
            ui.showMenu();
            ui.printMessage("Ingrese una opción");
            option = ui.readNum();
            execAction(option);
        }while (option!=4);

    }

    public void execAction(int op) throws IOException {
        switch (op){
            case 1:
                ui.printMessage("Ingrese un dato:");
                String data = ui.readText();
                gestor.add(data);
                break;
            case 2:
                ui.printMessage(gestor.printInformation());
                break;
            case 3:
                ui.printMessage(gestor.compressData());
                break;
            default:
                ui.printMessage("Opción inválida");
                break;
        }
    }



}
