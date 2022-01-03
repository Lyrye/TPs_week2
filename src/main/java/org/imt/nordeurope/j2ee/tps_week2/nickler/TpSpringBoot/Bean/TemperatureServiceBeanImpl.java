package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpringBoot.Bean;

import java.math.BigDecimal;
import java.util.Map;

public class TemperatureServiceBeanImpl implements TemperatureServiceBean {

    public static Map<String, Integer> temperatureByCoutries;

    static {
        temperatureByCoutries.put("fr",10);
        temperatureByCoutries.put("en",8);
        temperatureByCoutries.put("de",12);
    }

    @Override
    public BigDecimal getTemperature(String country){

        return BigDecimal.valueOf(temperatureByCoutries.get(country));
    }

    @Override
    public TemperatureServiceBean temperatureServiceSingleton() {
        return new TemperatureServiceBeanImpl();
    }
}
