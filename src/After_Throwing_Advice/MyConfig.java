package After_Throwing_Advice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("After_Throwing_Advice")
@EnableAspectJAutoProxy
public class MyConfig {
}
