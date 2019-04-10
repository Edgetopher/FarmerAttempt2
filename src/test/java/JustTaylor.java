import Arod.Person;
import Jesus.CropRow;
import Just.Field;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class JustTaylor {


    ///////////Field Tests///////////

    @Test
    public void addCropRowTest(){

        CropRow tomatoes = new CropRow("tomatoes");
        CropRow cucumbers = new CropRow("cucumbers");
        CropRow watermelon = new CropRow("watermelon");

        ArrayList<CropRow> cropRows = new ArrayList<CropRow>();
        cropRows.add(tomatoes);
        cropRows.add(cucumbers);
        cropRows.add(watermelon);

        boolean x = false;
        if(cropRows.contains(tomatoes) && cropRows.contains(cucumbers) && cropRows.contains(watermelon)) {
            x = true;
        }

        boolean expect = false;
        boolean actual = x;

        Assert.assertEquals(expect,actual);
    }

    @Test
    public void getCropRowTest(){
        ArrayList<CropRow> cropRows = new ArrayList<CropRow>();
        CropRow tomatoes = new CropRow("tomatoes");
        CropRow cucumbers = new CropRow("cucumbers");
        CropRow watermelon = new CropRow("watermelon");
        cropRows.add(tomatoes);
        cropRows.add(cucumbers);
        cropRows.add(watermelon);

        String str = "";


        for(int i = 0; i < cropRows.size(); i++) {
            str = str + cropRows.get(i) + "\n";
        }

        String expect = "tomatoes" + "\n" +  "cucumbers" + "\n" + "watermelon" + "\n";
        String actual = str;

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getNumOfRowsTest(){

        CropRow tomatoes = new CropRow("tomatoes");
        CropRow cucumbers = new CropRow("cucumbers");
        CropRow watermelon = new CropRow("watermelon");

        ArrayList<CropRow> cropRows = new ArrayList<CropRow>();
        cropRows.add(tomatoes);
        cropRows.add(cucumbers);
        cropRows.add(watermelon);

        Field field = new Field(cropRows);

        int expect = 3;
        int actual = cropRows.size();

        Assert.assertEquals(expect, actual);
    }

    //////////////Farmhouse Tests///////////////////////

    public void addPeopleTest(){

        Person taylor = new Person();
        Person chris = new Person();
        Person tshay = new Person();

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(taylor);
        people.add(chris);
        people.add(tshay);

        boolean x = false;

        if(people.contains(taylor)&& people.contains(chris) && people.contains(tshay)) {
            x = true;
        }
    }


}
