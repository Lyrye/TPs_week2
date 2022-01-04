package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

import javax.annotation.PostConstruct;

public class TemperatureMain {
    public  TemperatureBean frBean;
    public  TemperatureBean deBean;
    public  TemperatureBean enBean;

    public  void printTemperatureOfCountry(String country){
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
       frBean = new TemperatureBeanImpl();
       frBean.setName("fr");
       deBean = new TemperatureBeanImpl();
        frBean.setName("de");
       enBean = new TemperatureBeanImpl();
        frBean.setName("en");
    }

    public void printTemperatures(){
        System.out.println("Printing Temperatures");
        for(int i =0;i<4;i++){
            frBean.printTemperature();
            enBean.printTemperature();
            deBean.printTemperature();
        }
    }
}
