package local.logger.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Maksym_Pinchuk on 9/14/2016.
 */
@Aspect
public class LoggingAspect {



    @Pointcut("execution(* *.logEvent(..))")
    private void allLogEventMethods(){}

    @Before("allLogEventMethods")
    public void logBefore(JoinPoint joinPoint){


    }

}
