/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Slynklair
 */
public class appContext {

    private static final ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/Services.xml");

    private appContext() {
    }

    public static Object getService(String ServiceName) {
        return context.getBean(ServiceName);
    }

}
