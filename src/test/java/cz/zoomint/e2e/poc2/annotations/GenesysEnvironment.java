package cz.zoomint.e2e.poc2.annotations;

import cz.zoomint.e2e.poc2.extensions.GenesysEnvironmentExtension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Tag("GenesysEnvironment")
@ExtendWith(GenesysEnvironmentExtension.class)
public @interface GenesysEnvironment {
}
