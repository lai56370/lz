package com.lz;

import com.lz.listener.MyApplicationEnvironmentPreparedEventListener;
import com.lz.listener.MyApplicationStartedEventListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Date;

/**
 * Created by Maven on 2017/2/9.
 */
@RestController
@EnableWebMvc
//@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages = "com.lz.mapper")
public class Application {


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String hehe() {
        return "现在时间：" + (new Date()).toLocaleString();
    }

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);

//        SpringApplication application = new SpringApplication(Application.class);
//        Map<String, Object> defaultMap
// = new HashMap<String, Object>();
//        defaultMap.put("name", "Isea-Blog");
////还可以是Properties对象
//        application.setDefaultProperties(defaultMap);
//        application.run(args);

        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new MyApplicationStartedEventListener());
        app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
        app.run(args);
    }
}
