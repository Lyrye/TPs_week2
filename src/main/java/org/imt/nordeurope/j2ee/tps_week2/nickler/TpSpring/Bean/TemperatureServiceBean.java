package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean;

import java.math.BigDecimal;

public interface TemperatureServiceBean {

    BigDecimal getTemperature(String country);
}
