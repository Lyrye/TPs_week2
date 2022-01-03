package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring;

public class HelloWorldBeanInjection {

    private HelloWorldBean helloWorldBean;

    public HelloWorldBean getHelloWorldBean() {
        return helloWorldBean;
    }

    public void setHelloWorldBean(HelloWorldBean helloWorldBean) {
        this.helloWorldBean = helloWorldBean;
    }
}
