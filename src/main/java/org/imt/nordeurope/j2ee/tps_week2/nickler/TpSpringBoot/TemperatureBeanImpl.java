package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpringBoot;

public class TemperatureBeanImpl implements TemperatureBean {

    private String name;


    @Override
    public void printTemperature() {

    }

    @Override
    public String getName() {
        return this.name;
    }
}
