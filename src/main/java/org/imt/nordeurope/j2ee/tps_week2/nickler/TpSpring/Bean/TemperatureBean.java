package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

public interface TemperatureBean {

    void printTemperature();
    String getName();
    void setName(String name);
    void setService(TemperatureServiceBean service);
}
