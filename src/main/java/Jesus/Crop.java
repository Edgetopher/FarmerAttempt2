package Jesus;

public abstract class Crop extends CropRow {
    public String plantCrop(Crop crop){
        addCrop(crop);
        return crop + " Was planted in row: " + (crops.indexOf(crop)+ 1);
    }
}
