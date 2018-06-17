package mangolost.dubboclient.controller;

import mangolost.dubboclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    /**
     *
     * @return
     */
    @RequestMapping("health")
    public String health() {
        return "OK";
    }

    /**
     *
     * @param name
     * @return
     */
    @RequestMapping("hello")
    public String hello(String name) {
        return testService.hello(name);
    }


}
