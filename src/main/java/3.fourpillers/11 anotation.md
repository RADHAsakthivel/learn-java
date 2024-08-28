[//]: # (# Annotation)

[//]: # (- Java Annotation are powerful feature used to provide the metadata to the code.)

[//]: # (- Annotation won't directly affect the code but used by compiler and runtime to perform validation, provide instruction etc.,)

[//]: # ()
[//]: # (## Key features)

[//]: # (- ***Metadata :*** Annotation provide meta data for you code)

[//]: # (- ***No Direct Effect :*** They don't directly change schematic of the code but influence code processing)

[//]: # (- ***Used in various context :*** Can be used in class, attributes, methods.)

[//]: # ()
[//]: # (## Common Use Cases)

[//]: # (- ***Documentation :*** Annotations can be used to generate documentation, such as with `@Deprecated`.)

[//]: # (- ***Compilation Checks :*** Annotations can instruct the compiler to enforce certain rules, such as `@Override`.)

[//]: # (- ***RunTime Process :*** Some Annotation are available at runtime can be used by framework and library `&#40;EX: @Entity in JPA, @Controller in Spring, @Test in unit&#41;`)

[//]: # ()
[//]: # (## Standard Annotations:)

[//]: # (- ***@Override:*** Indicates that a method overrides a method from a superclass.)

[//]: # (- ***@Deprecated :*** Marks a method, class, or field as deprecated, indicating that it should no longer be used.)

[//]: # (- ***@SuppressWarnings :*** Instructs the compiler to suppress specific warnings.)

[//]: # (- ***@SafeVarargs :*** Suppresses warnings about unsafe operations involving varargs.)

[//]: # (- ***@FunctionalInterface :*** Indicates that an interface is intended to be a functional interface &#40;an interface with a single abstract method&#41;.)

[//]: # ()
[//]: # (## Custom Annotations:)

[//]: # (- You can create your own annotations using the ***@interface*** keyword.)

[//]: # (- Consider that you want to monitor execution time of particular method)

[//]: # (- Instead of creating logs for all method you can create annotation that logs time automatically)

[//]: # ()
[//]: # (```java)

[//]: # (import java.lang.annotation.ElementType;)

[//]: # (import java.lang.annotation.Retention;)

[//]: # (import java.lang.annotation.RetentionPolicy;)

[//]: # (import java.lang.annotation.Target;)

[//]: # ()
[//]: # (// This annotation can be applied to methods)

[//]: # (@Retention&#40;RetentionPolicy.RUNTIME&#41; // => defines annotation is used runtime)

[//]: # (@Target&#40;ElementType.METHOD&#41; // => defines annotation for methods)

[//]: # (public @interface LogExecutionTime {)

[//]: # (})

[//]: # (```)

[//]: # ()
[//]: # (- An aspect will "wrap" the annotated method, timing its execution and logging the result.)

[//]: # ()
[//]: # (```java)

[//]: # (import org.aspectj.lang.ProceedingJoinPoint;)

[//]: # (import org.aspectj.lang.annotation.Around;)

[//]: # (import org.aspectj.lang.annotation.Aspect;)

[//]: # (import org.springframework.stereotype.Component;)

[//]: # ()
[//]: # (@Around&#40;"@annotation&#40;LogExecutionTime&#41;"&#41;)

[//]: # (public Object logExecutionTime&#40;ProceedingJoinPoint joinPoint&#41; throws Throwable {)

[//]: # (    // Step 1: Log the start time)

[//]: # (    long start = System.currentTimeMillis&#40;&#41;;)

[//]: # ()
[//]: # (    // Step 2: Proceed with the original method execution)

[//]: # (    Object proceed = joinPoint.proceed&#40;&#41;;)

[//]: # ()
[//]: # (    // Step 3: Log the end time)

[//]: # (    long executionTime = System.currentTimeMillis&#40;&#41; - start;)

[//]: # ()
[//]: # (    // Step 4: Print or log the execution time)

[//]: # (    System.out.println&#40;joinPoint.getSignature&#40;&#41; + " executed in " + executionTime + "ms"&#41;;)

[//]: # ()
[//]: # (    // Step 5: Return the result of the original method)

[//]: # (    return proceed;)

[//]: # (})

[//]: # ()
[//]: # (```)

[//]: # ()
[//]: # (- You can now annotate any method that you want to measure and log the execution time for.)

[//]: # ()
[//]: # (```java)

[//]: # (import org.springframework.stereotype.Service;)

[//]: # ()
[//]: # (@Service)

[//]: # (public class UserService {)

[//]: # ()
[//]: # (    @LogExecutionTime)

[//]: # (    public void getUserDetails&#40;String userId&#41; {)

[//]: # (        // Simulating a delay)

[//]: # (        try {)

[//]: # (            Thread.sleep&#40;500&#41;;)

[//]: # (        } catch &#40;InterruptedException e&#41; {)

[//]: # (            e.printStackTrace&#40;&#41;;)

[//]: # (        })

[//]: # (        System.out.println&#40;"Fetched details for user " + userId&#41;;)

[//]: # (    })

[//]: # (})

[//]: # ()
[//]: # (```)

# Java Annotations

- **Java Annotations** are a powerful feature used to provide metadata to the code.
- Annotations don't directly affect the code's logic but are used by the compiler and runtime to perform validations, provide instructions, and influence how the code is processed.

## Key Features
- **Metadata**: Annotations provide metadata for your code, adding additional information about program elements.
- **No Direct Effect**: Annotations don't directly change the code's behavior but influence how it is processed by tools, frameworks, and the JVM.
- **Versatility**: Annotations can be used in various contexts such as classes, methods, fields, and parameters.

## Common Use Cases
- **Documentation**: Annotations can generate documentation. For example, `@Deprecated` indicates that a method or class is outdated and should not be used.
- **Compilation Checks**: Annotations like `@Override` help the compiler enforce rules, such as ensuring a method correctly overrides a superclass method.
- **Runtime Processing**: Some annotations are available at runtime and can be processed by frameworks and libraries. Examples include `@Entity` in JPA, `@Controller` in Spring, and `@Test` in testing frameworks.

## Standard Annotations
- **@Override**: Indicates that a method overrides a method from a superclass.
- **@Deprecated**: Marks a method, class, or field as deprecated, signaling that it should no longer be used.
- **@SuppressWarnings**: Instructs the compiler to suppress specific warnings.
- **@SafeVarargs**: Suppresses warnings about unsafe operations involving varargs.
- **@FunctionalInterface**: Indicates that an interface is intended to be a functional interface (an interface with a single abstract method).

## Custom Annotations
- You can create your own annotations using the `@interface` keyword.
- For instance, if you want to monitor the execution time of particular methods, you can create a custom annotation that automatically logs the time.

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This annotation can be applied to methods
@Retention(RetentionPolicy.RUNTIME) // Annotation is available at runtime
@Target(ElementType.METHOD) // Annotation is applicable to methods
public @interface LogExecutionTime {
}
```

- To utilize this annotation, an aspect can "wrap" the annotated method, timing its execution and logging the result.

```java
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        // Log the start time
        long start = System.currentTimeMillis();

        // Proceed with the original method execution
        Object proceed = joinPoint.proceed();

        // Log the end time and calculate execution duration
        long executionTime = System.currentTimeMillis() - start;

        // Print or log the execution time
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");

        // Return the result of the original method
        return proceed;
    }
}
```

- You can now annotate any method that you want to measure and log the execution time for:

```java
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @LogExecutionTime
    public void getUserDetails(String userId) {
        // Simulate a delay
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fetched details for user " + userId);
    }
}
```