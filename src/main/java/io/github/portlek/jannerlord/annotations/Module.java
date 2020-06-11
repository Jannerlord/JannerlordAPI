package io.github.portlek.jannerlord.annotations;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Module {

    @NotNull
    String name();

    @NotNull
    String id();

    @NotNull
    String version();

    boolean singlePlayer() default false;

    boolean multiPlayer() default false;

    @NotNull
    Dependency[] dependencies() default {};

    @NotNull
    SubModule[] subModules() default {};

}
