package Aspect_Oriented_Programming.PointCut_inObject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Aspect_Oriented_Programming.PointCut_inObject")
@EnableAspectJAutoProxy
public class MyConfig {
}
