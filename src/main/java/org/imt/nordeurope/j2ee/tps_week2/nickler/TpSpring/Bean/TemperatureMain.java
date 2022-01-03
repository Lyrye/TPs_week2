package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

import javax.annotation.PostConstruct;

public class TemperatureMain {
    private TemperatureBean frBean;
    private TemperatureBean deBean;
    private TemperatureBean enBean;

    public void printTemperatureOfCountry(String country){
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

    public void printTemperaturs(){
        for(int i =0;i<4;i++){
            frBean.printTemperature();
            enBean.printTemperature();
            deBean.printTemperature();
        }
    }
}
