package Just;

import Jesus.CropRow;

import java.util.ArrayList;
import java.util.LinkedList;

public class Field {

    private LinkedList<CropRow> cropRows = new LinkedList<CropRow>();
    int numOfRows = cropRows.size();

    public Field(LinkedList<CropRow> cropRows){
        this.cropRows = cropRows;
    }

    public void addCropRow(CropRow cropRow){
        cropRows.add(cropRow);
    }
    public String getCropRows(){
        String str = "";
        for(int i =0; i < cropRows.size(); i++) {
            str = str + cropRows.get(i) + "\n";
        }
        return str;
    }

    public int getNumOfRows(Field field){
        return numOfRows;
    }

}
