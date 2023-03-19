package Around_Advice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Around_Advice")
@EnableAspectJAutoProxy
public class MyConfig {
}
