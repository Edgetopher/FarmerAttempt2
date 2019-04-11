package Witch;

public abstract class Produce {
    //Produce can yield an Edible object depending on their hasBeenFertilized


    private boolean hasBeenFertilized;

    public Produce(){
        hasBeenFertilized = true;
    }



    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {

        this.hasBeenFertilized = hasBeenFertilized;
    }

    public abstract Boolean yield() throws Exception;










}
