package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

public class Main {

    public static TemperatureMain temperatureMain;

    public static TemperatureMain getTemperatureMain() {
        return temperatureMain;
    }

    public static void main(String[] args) {
        System.out.println("Starting main");
        if( temperatureMain !=null){
            System.out.println("Is not null");
        } else {
            System.out.println("Is  null");
        }
        //temperatureMain.printTemperatures();
    }

    public void setTemperatureMain(TemperatureMain temperatureMain) {
        Main.temperatureMain =temperatureMain;
    }
}