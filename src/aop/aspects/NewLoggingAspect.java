package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookAdvice: в библиотеку пытаются вернуть книгу");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "Преступление и наказание";
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookAdvice: в библиотеку успешно вернули книгу");
        System.out.println("Метод returnBook выполнил работу за " + (end - begin) + " миллисекунд");
        return targetMethodResult;

    }
}
