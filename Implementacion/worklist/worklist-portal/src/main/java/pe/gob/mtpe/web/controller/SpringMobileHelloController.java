package pe.gob.mtpe.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author USUARIO
 */
@Controller
public class SpringMobileHelloController {
     private static final Logger logger = LoggerFactory.getLogger(SpringMobileHelloController.class.getName());
     
    @RequestMapping("/")
    public String sayHello(SitePreference sitePreference, Device device, Model model) {
        logger.warn("SitePreference : " + sitePreference);
        logger.warn("Device : " + device);
         
        model.addAttribute("message", "Hello World!");
         
        return "helloWorld";
    }
}
