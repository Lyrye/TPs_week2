package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

import javax.annotation.PostConstruct;

public class TemperatureMain {
    public static TemperatureBean frBean;
    public static TemperatureBean deBean;
    public static TemperatureBean enBean;

    public static void printTemperatureOfCountry(String country){
        switch(country){
            case "fr":
                frBean.printTemperature();
                break;
            case "de":
                deBean.printTemperature();
                break;
            case "en":
                enBean.printTemperature();
                break;
            default:
                break;
        }
    }

    @PostConstruct
    private void postConstruct() {
       frBean = new TemperatureBeanImpl("fr");
       deBean = new TemperatureBeanImpl("de");
       enBean = new TemperatureBeanImpl("en");
    }

    public static void printTemperaturs(){
        for(int i =0;i<4;i++){
            frBean.printTemperature();
            enBean.printTemperature();
            deBean.printTemperature();
        }
    }
}
