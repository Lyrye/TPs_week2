package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpringBoot;

public class HelloWorldBeanInjection {

    private HelloWorldBean helloWorldBean;

    public HelloWorldBean getHelloWorldBean() {
        return helloWorldBean;
    }

    public void setHelloWorldBean(HelloWorldBean helloWorldBean) {
        this.helloWorldBean = helloWorldBean;
    }
}
