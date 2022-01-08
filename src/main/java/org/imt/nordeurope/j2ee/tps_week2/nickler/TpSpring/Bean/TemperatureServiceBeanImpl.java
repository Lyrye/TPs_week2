package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TemperatureServiceBeanImpl implements TemperatureServiceBean {
    public static Map<String, Integer> temperatureByCountries;

    static {
        temperatureByCountries = new HashMap();
        temperatureByCountries.put("fr",10);
        temperatureByCountries.put("en",8);
        temperatureByCountries.put("de",12);
    }

    @Override
    public BigDecimal getTemperature(String country){
        BigDecimal temp = BigDecimal.valueOf(temperatureByCountries.get(country));
        temperatureByCountries.put("fr", temperatureByCountries.get("fr") + 1);
        temperatureByCountries.put("en", temperatureByCountries.get("en") + 1);
        temperatureByCountries.put("de", temperatureByCountries.get("de") + 1);
        return temp;
    }
}
