package bonilla.mariela.gestor;

import bonilla.mariela.bl.CompressAlgorithm;

public class Gestor {
    private CompressAlgorithm bl = new CompressAlgorithm();

    public void add(String info){
        bl.insertData(info);
    }

    public String printInformation(){
        String result = "\n === === === Información Actual === === === \n";
        result += "   " + bl.getInformation();
        return result;
    }


    public String compressData(){
        String result = "\nDatos actuales => " + bl.getInformation() + "\n\n";
        result += " === === === Datos comprimidos === === === \n";
        result += bl.compressInformation() + "\n\n";
        return result;
    }
}
