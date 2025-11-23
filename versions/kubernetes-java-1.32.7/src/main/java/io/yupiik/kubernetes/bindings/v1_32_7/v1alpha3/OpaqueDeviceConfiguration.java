package io.yupiik.kubernetes.bindings.v1_32_7.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_32_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_7.Validable;
import io.yupiik.kubernetes.bindings.v1_32_7.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class OpaqueDeviceConfiguration implements Validable<OpaqueDeviceConfiguration>, Exportable {
    private String driver;
    private JsonObject parameters;

    public OpaqueDeviceConfiguration() {
        // no-op
    }

    public OpaqueDeviceConfiguration(final String driver,
                                     final JsonObject parameters) {
        this.driver = driver;
        this.parameters = parameters;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public JsonObject getParameters() {
        return parameters;
    }

    public void setParameters(final JsonObject parameters) {
        this.parameters = parameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driver,
                parameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof OpaqueDeviceConfiguration)) {
            return false;
        }
        final OpaqueDeviceConfiguration __otherCasted = (OpaqueDeviceConfiguration) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }

    public OpaqueDeviceConfiguration driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public OpaqueDeviceConfiguration parameters(final JsonObject parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public OpaqueDeviceConfiguration validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (parameters == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "parameters", "parameters",
                "Missing 'parameters' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (parameters != null ? "\"parameters\":" + parameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
