package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

public class TemperatureBeanImpl implements TemperatureBean {

    private String name;
    private TemperatureServiceBean temperatureServiceBean;

    public TemperatureBeanImpl(String name){
        this.name = name;
    }

    @Override
    public void printTemperature() {
        System.out.println(temperatureServiceBean.getTemperature(this.name));
        System.out.println(temperatureServiceBean.hashCode());
        System.out.println(this.getName());
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
