package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.BeanAnnotation;

import org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.BeanAnnotation.HelloWorldBeanAnnotation;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class HelloWorldBeanInjectionAnnotation {
    private HelloWorldBeanAnnotation helloWorldBean;

    public HelloWorldBeanAnnotation getHelloWorldBeanAnnotation() {
        return helloWorldBean;
    }

    /*@Autowired*/
    @Inject
    public void setHelloWorldBeanAnnotation(HelloWorldBeanAnnotation helloWorldBean) {
        this.helloWorldBean = helloWorldBean;
    }
}
