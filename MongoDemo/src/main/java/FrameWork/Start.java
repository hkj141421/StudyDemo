package FrameWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableMongoRepositories(basePackages = "FrameWork.Dao")
public class Start
{
    public static void main( String[] args )
    {
        SpringApplication.run(Start.class);
    }
}
