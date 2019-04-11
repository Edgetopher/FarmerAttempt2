package Jesus;

import java.util.ArrayList;

public class CropRow extends Crop {



    ArrayList<Crop> crops = new ArrayList<Crop>(5);



    public void addCrop(Crop crop){
        crops.add(crop);
    }
    public void harvest(){
        crops.removeAll(crops);
    }

}
