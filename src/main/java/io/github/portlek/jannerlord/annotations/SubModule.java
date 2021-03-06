package io.github.portlek.jannerlord.annotations;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SubModule {

    @NotNull
    String name();

    @NotNull
    String dllName();

    @NotNull
    Tag[] tags() default {};

}
