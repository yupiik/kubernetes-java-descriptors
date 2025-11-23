package io.yupiik.kubernetes.bindings.v1_30_5.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_5.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VendorParameters implements Validable<VendorParameters>, Exportable {
    private String driverName;
    private JsonObject parameters;

    public VendorParameters() {
        // no-op
    }

    public VendorParameters(final String driverName,
                            final JsonObject parameters) {
        this.driverName = driverName;
        this.parameters = parameters;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
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
                driverName,
                parameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VendorParameters)) {
            return false;
        }
        final VendorParameters __otherCasted = (VendorParameters) __other;
        return Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }

    public VendorParameters driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public VendorParameters parameters(final JsonObject parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public VendorParameters validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""),
                    (parameters != null ? "\"parameters\":" + parameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
