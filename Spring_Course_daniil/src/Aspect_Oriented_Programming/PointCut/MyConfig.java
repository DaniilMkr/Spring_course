package Aspect_Oriented_Programming.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Aspect_Oriented_Programming.AOP")
@EnableAspectJAutoProxy
public class MyConfig {
}
