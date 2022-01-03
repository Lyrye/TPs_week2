package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void should_simple_bean_be_injected() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        HelloWorldBeanInjection bean = applicationContext.getBean("helloWorldBeanInjection", HelloWorldBeanInjection.class);
        // Vérifie que le bean a bien été injecté, sinon le test echoue
        Assertions.assertNotNull(bean.getHelloWorldBean());
    }

    @Test
    public void should_simple_bean_be_injected_annotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        HelloWorldBeanInjectionAnnotation bean = applicationContext.getBean(HelloWorldBeanInjectionAnnotation.class);
        // Vérifie que le bean a bien été injecté, sinon le test echoue
        Assertions.assertNotNull(bean.getHelloWorldBeanAnnotation());
    }
}
