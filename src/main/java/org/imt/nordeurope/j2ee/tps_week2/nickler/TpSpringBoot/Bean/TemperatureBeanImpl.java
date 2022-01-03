package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpringBoot.Bean;

import org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpringBoot.Bean.TemperatureBean;

public class TemperatureBeanImpl implements TemperatureBean {

    private String name;
    private TemperatureServiceBean temperatureServiceBean;


    @Override
    public void printTemperature() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setTemperatureServiceBean(TemperatureServiceBeanImpl temperatureServiceBean) {
        this.temperatureServiceBean = temperatureServiceBean;
    }

    public TemperatureServiceBean getTemperatureServiceBean() {
        return temperatureServiceBean;
    }
}
