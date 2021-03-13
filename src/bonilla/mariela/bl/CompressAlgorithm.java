package bonilla.mariela.bl;

import java.util.ArrayList;

public class CompressAlgorithm {
    private ArrayList<String> information;

    public CompressAlgorithm() {
        this.information = new ArrayList<>();
    }

    public void insertData(String data) {
        information.add(data);
    }

    public String getInformation(){
        String message = "";
        for (String info: information){
            message += info + "-";
        }
        message = message.substring(0, message.length()-1);
        return message;
    }

    public String  compressInformation(){
        int contT = 0, contP = 1;
        ArrayList<String> archives = new ArrayList<>();
        boolean continue_ = false;
        String current;
        for (int i = 0; i < information.size(); i++){
            if(information.size() == 1) {
                contT = 1;
                continue_ = true;
            }else if(i < (information.size() -1)) {
                if(information.get(i).equals(information.get(i + 1))){
                    contP++;
                }
                else {
                    continue_ = true;
                    contT = contP;
                    contP = 1;
                }
            } else {
                contT = contP;
                contP = 1;
                continue_ = true;
            }
            current = information.get(i);
            if (continue_ ) {
                archives.add( contT + " de " + current);
                continue_ = false;
            }
        }
        return showCompressArchives(archives);
    }

    public String showCompressArchives(ArrayList<String> arc){
        String msg = "|| ";
        for (String d : arc){
            msg += d + " || ";
        }
        return msg;
    }
}
