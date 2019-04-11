import Arod.Person;
import Arod.Pilot;
import Jesus.CornEars;
import Jesus.Crop;
import Jesus.CropRow;
import Jesus.Tomato;
import Just.*;
import Shady.*;
import Witch.Chicken;
import Witch.Horse;

import java.util.ArrayList;
import java.util.LinkedList;

public class FroliansFarm extends Farm{

    LinkedList<CropRow> cropRows;
    Field field = new Field(cropRows);
    ArrayList<Object> chickenCoops;
    ArrayList<Stable> stables;
    ArrayList<FarmVehicle> vehicles;
    Farmhouse farmhouse;

    public FroliansFarm(Field field, ArrayList<Object> chickenCoops, ArrayList<Object> stables, Farmhouse farmhouse){
        this.field = field;
        this.chickenCoops = chickenCoops;

    }

    public static void main(String[] args){


        LinkedList<CropRow>cropRows = new LinkedList<CropRow>();
        ArrayList<Crop> cropRow = new ArrayList<Crop>();
        ArrayList<CropRow> cropRow2 = new ArrayList<CropRow>();

        Crop corn1 = new CornEars();
        Crop corn2 = new CornEars();
        Crop tomato1 = new Tomato();

        cropRow.add(0, corn1);
        cropRow.add(1, tomato1);

        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        Chicken chicken5 = new Chicken();
        Chicken chicken6 = new Chicken();
        Chicken chicken7 = new Chicken();
        Chicken chicken8 = new Chicken();
        Chicken chicken9 = new Chicken();
        Chicken chicken10 = new Chicken();
        Chicken chicken11 = new Chicken();
        Chicken chicken12 = new Chicken();
        Chicken chicken13 = new Chicken();
        Chicken chicken14 = new Chicken();
        Chicken chicken15 = new Chicken();

        ArrayList<Chicken> chickenCoop1 = new ArrayList<Chicken>();
        ArrayList<Chicken> chickenCoop2 = new ArrayList<Chicken>();
        ArrayList<Chicken> chickenCoop3 = new ArrayList<Chicken>();
        ArrayList<Chicken> chickenCoop4 = new ArrayList<Chicken>();
        chickenCoop1.add(chicken1);
        chickenCoop1.add(chicken2);
        chickenCoop1.add(chicken3);
        chickenCoop1.add(chicken4);
        chickenCoop2.add(chicken5);
        chickenCoop2.add(chicken6);
        chickenCoop2.add(chicken7);
        chickenCoop2.add(chicken8);
        chickenCoop3.add(chicken9);
        chickenCoop3.add(chicken10);
        chickenCoop3.add(chicken11);
        chickenCoop4.add(chicken12);
        chickenCoop4.add(chicken13);
        chickenCoop4.add(chicken14);
        chickenCoop4.add(chicken15);

        ArrayList<Object> chickenCoops = new ArrayList<Object>();
        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);
        chickenCoops.add(chickenCoop4);

        ArrayList<Horse> stable1 = new ArrayList<Horse>();
        ArrayList<Horse> stable2 = new ArrayList<Horse>();
        ArrayList<Horse> stable3 = new ArrayList<Horse>();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();
        Horse horse5 = new Horse();
        Horse horse6 = new Horse();
        Horse horse7 = new Horse();
        Horse horse8 = new Horse();
        Horse horse9 = new Horse();
        Horse horse10 = new Horse();
        stable1.add(horse1);
        stable1.add(horse2);
        stable1.add(horse3);
        stable2.add(horse4);
        stable2.add(horse5);
        stable2.add(horse6);
        stable2.add(horse7);
        stable3.add(horse8);
        stable3.add(horse9);
        stable3.add(horse10);
        ArrayList<Object> stables = new ArrayList<Object>();
        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        FarmVehicle tractor = new Tractor();
        AirCraft cropDuster = new CropDuster();
        Person frolina = new Pilot(cropDuster);

        FroliansFarm froliansfarm = new FroliansFarm();


    }
}
