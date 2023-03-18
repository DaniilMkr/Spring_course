package Aspect_Oriented_Programming.PointCut_with_AnyParameters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Aspect_Oriented_Programming.PointCut_with_AnyParameters")
@EnableAspectJAutoProxy
public class MyConfig {
}
