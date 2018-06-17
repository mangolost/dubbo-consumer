package mangolost.dubboclient.service;

import com.alibaba.dubbo.config.annotation.Reference;
import mangolost.api.DemoService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class TestService {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345",
    timeout = 9999)
    private DemoService demoService;

    /**
     *
     * @param name
     * @return
     */
    public String hello(String name) {
        return demoService.sayHello(name);
    }
}
