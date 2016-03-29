package calculator.config;

import calculator.Calculator;
import calculator.calculatorImpl.CalculatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by lodz on 2016/03/26.
 */
@Configuration
public class AppConfig {
    @Bean(name="retcalc")
    public Calculator getCalculator(){
        return new CalculatorImpl();}

    @Bean(name="cir")
    public  Calculator getModuleCalculator()
    {
        return new CalculatorImpl();
    }
}
