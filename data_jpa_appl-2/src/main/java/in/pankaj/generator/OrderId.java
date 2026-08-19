package in.pankaj.generator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.hibernate.annotations.IdGeneratorType;

@IdGeneratorType(OrderIdGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrderId {

}
