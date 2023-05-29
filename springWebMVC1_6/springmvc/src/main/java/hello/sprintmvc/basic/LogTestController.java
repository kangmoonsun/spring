package hello.sprintmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController //데이터 그대로 넣어줌 restAPI 만들때 좋음
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(LogTestController.class);
    @RequestMapping("log-test")
    public String logTest(){
        String name = "spring";

        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info("info log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}", name);

        return "ok";
    }
}
