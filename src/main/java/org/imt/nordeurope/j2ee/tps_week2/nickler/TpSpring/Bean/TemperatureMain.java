package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TemperatureMain {

    public TemperatureBean frBean;
    public TemperatureBean deBean;
    public TemperatureBean enBean;

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
        frBean.setName("fr");
        deBean.setName("de");
        enBean.setName("en");

        printTemperatures();
    }

    public void printTemperatures(){
        System.out.println("Printing Temperatures");
        for(int i =0;i<4;i++){
            printTemperatureOfCountry(frBean.getName());
            printTemperatureOfCountry(enBean.getName());
            printTemperatureOfCountry(deBean.getName());
        }
    }

    public void setFrBean(TemperatureBean frBean) {
        this.frBean = frBean;
    }

    public void setDeBean(TemperatureBean deBean) {
        this.deBean = deBean;
    }

    public void setEnBean(TemperatureBean enBean) {
        this.enBean = enBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(TemperatureMain.class, args);
    }


}
