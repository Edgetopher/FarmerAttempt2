import Arod.Person;
import Jesus.CropRow;
import Just.*;
import Witch.Chicken;
import Witch.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class JustTaylor {


    ///////////Field Tests///////////

    ArrayList<CropRow> cropRows;

    @Before
    public void setUp1(){
        cropRows = new ArrayList<CropRow>();
    }


    @Test
    public void addCropRowTest(){

        CropRow tomatoes = new CropRow();
        CropRow cucumbers = new CropRow();
        CropRow watermelon = new CropRow();
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
        CropRow tomatoes = new CropRow();
        CropRow cucumbers = new CropRow();
        CropRow watermelon = new CropRow();
        cropRows.add(tomatoes);
        cropRows.add(cucumbers);
        cropRows.add(watermelon);
        String str = "";
        for(int i = 0; i < cropRows.size(); i++) {
            str = str + cropRows.get(i) + "\n";
        }
        String expect = cropRows.toString();
        String actual = str;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getNumOfRowsTest(){
        CropRow tomatoes = new CropRow();
        CropRow cucumbers = new CropRow();
        CropRow watermelon = new CropRow();
        ArrayList<CropRow> cropRows = new ArrayList<CropRow>();
        cropRows.add(tomatoes);
        cropRows.add(cucumbers);
        cropRows.add(watermelon);
        int expect = 3;
        int actual = cropRows.size();
        Assert.assertEquals(expect, actual);
    }

    //////////////Farmhouse Tests///////////////////////

    ArrayList<Person> people;

    @Before
    public void setUp2(){
        people = new ArrayList<Person>();

    }
    @Test
    public void addPeopleTest(){
        Person taylor = new Person();
        Person chris = new Person();
        Person tshay = new Person();
        people.add(taylor);
        people.add(chris);
        people.add(tshay);
        boolean x = false;
        if(people.contains(taylor)&& people.contains(chris) && people.contains(tshay)) {
            x = true;
        }
        boolean expect = false;
        boolean actual = x;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getPeopleTest() {
        Person taylor = new Person();
        Person chris = new Person();
        Person tshay = new Person();
        people.add(taylor);
        people.add(chris);
        people.add(tshay);
        String str = "";
        for (int i = 0; i < people.size(); i++) {
            str = str + people.get(i) + "\n";
        }
        String expect = "taylor, chris, tshay";
        String actual = str;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getNumOfPeopleTest() {
        Person taylor = new Person();
        Person chris = new Person();
        Person tshay = new Person();
        people.add(taylor);
        people.add(chris);
        people.add(tshay);
        int numOfPeople = people.size();
        int expect = 3;
        int actual = numOfPeople;
        Assert.assertEquals(expect, actual);
    }

    //////////////// Stables Test /////////////////

    ArrayList<Horse> horses;

    @Before
    public void setUp3(){
        horses = new ArrayList<Horse>();
    }

    @Test
    public void addHorsesTest(){
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        boolean x = false;
        if(horses.contains(horse1) && horses.contains(horse2) && horses.contains(horse3)) {
            x = true;
        }
        boolean expect = false;
        boolean actual = x;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getNumOfHorsesTest(){
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        int numOfHorses = horses.size();
        int expect = 3;
        int actual = numOfHorses;

        Assert.assertEquals(expect, actual);

    }

//////////// ChickenCoop Tests //////////////

    ArrayList<Chicken> chickens;

    @Before
    public void setUp4(){
        chickens = new ArrayList<Chicken>();
    }

    @Test
    public void addChickensTest(){
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();

        chickens.add(chicken1);
        chickens.add(chicken2);
        chickens.add(chicken3);
        boolean x = false;

        if(chickens.contains(chicken1) && chickens.contains(chicken2) && chickens.contains(chicken3)) {
            x = true;
        }

        boolean expect = false;
        boolean actual = x;
        Assert.assertEquals(expect,actual);
    }

    public void getNumOfChickensTest(){
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();

        chickens.add(chicken1);
        chickens.add(chicken2);
        chickens.add(chicken3);

        int expect = 3;
        int numOfChickens = chickens.size();
        int actual = numOfChickens;

        Assert.assertEquals(expect, actual);

    }


    ////////////////// Farm Tests //////////////////

    Farmhouse farmhouse;
    Farm farm;
    ArrayList<Object> chickenCoops;

    ArrayList<Object> stables;

    @Before
    public void setUp5(){

        farmhouse = new Farmhouse(people);
        chickenCoops = new ArrayList<Object>();
        stables = new ArrayList<Object>();
        farm = new Farm(chickenCoops, farmhouse, stables);
    }

    @Test
    public void addChickenCoopTest() {
        ArrayList<Chicken> chickenCoop1 = new ArrayList<Chicken>();

        ArrayList<Chicken> chickenCoop2 = new ArrayList<Chicken>();
        ArrayList<Chicken> chickenCoop3 = new ArrayList<Chicken>();

        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);

        boolean x = false;

        if (chickenCoops.contains(chickenCoop1) && chickenCoops.contains(chickenCoop2) && chickenCoops.contains(chickenCoop3)) {
            x = true;
        }
        boolean expect = true;
        boolean actual = x;

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void addStablesTest(){
        ArrayList<Horse> stable1 = new ArrayList<Horse>();
        ArrayList<Horse> stable2 = new ArrayList<Horse>();
        ArrayList<Horse> stable3 = new ArrayList<Horse>();

        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        boolean x = false;
        if (stables.contains(stable1) && stables.contains(stable2) && stables.contains(stable3)) {
            x = true;
        }
        boolean expect = true;
        boolean actual = x;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getNumOfChickenCoopsTest(){
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        ArrayList<Chicken> chickenCoop1 = new ArrayList<Chicken>();
        ArrayList<Chicken> chickenCoop2 = new ArrayList<Chicken> ();
        ArrayList<Chicken> chickenCoop3 = new ArrayList<Chicken>();
        chickenCoop1.add(chicken1);
        chickenCoop2.add(chicken2);
        chickenCoop3.add(chicken3);


        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);


        int numOfChickenCoops = chickenCoops.size();
        int expect = 3;
        int actual = numOfChickenCoops;

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getNumOfStablesTest(){
        ArrayList<Horse> stable1 = new ArrayList<Horse>();
        ArrayList<Horse> stable2 = new ArrayList<Horse>();
        ArrayList<Horse> stable3 = new ArrayList<Horse>();

        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        int numOfStables = stables.size();
        int expect = 3;
        int actual = numOfStables;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void setFarmhouseTest(){
        Farm farm = new Farm(chickenCoops, farmhouse, stables);
        Person bill = new Person();
        Person bob = new Person();
        Person jill = new Person();
        people.add(bill);
        people.add(jill);
        people.add(bob);

        Farmhouse fh = new Farmhouse(people);
        farm.setFarmhouse(fh);
        boolean x = false;

        if(farmhouse == fh) {
            x = true;
        }
        boolean expect = false;
        boolean actual = true;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void getFarmhouseTest(){

        farm.setFarmhouse(farmhouse);
        Farmhouse fh = new Farmhouse(people);

        Farmhouse expect =  farmhouse;
        Farmhouse actual = farm.getFarmhouse();

        Assert.assertEquals(expect, actual);

    }












}
