package io.yupiik.kubernetes.bindings.v1_29_5.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_29_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_5.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceHandle implements Validable<ResourceHandle>, Exportable {
    private String data;
    private String driverName;

    public ResourceHandle() {
        // no-op
    }

    public ResourceHandle(final String data,
                          final String driverName) {
        this.data = data;
        this.driverName = driverName;
    }

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                data,
                driverName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceHandle)) {
            return false;
        }
        final ResourceHandle __otherCasted = (ResourceHandle) __other;
        return Objects.equals(data, __otherCasted.data) &&
            Objects.equals(driverName, __otherCasted.driverName);
    }

    public ResourceHandle data(final String data) {
        this.data = data;
        return this;
    }

    public ResourceHandle driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    @Override
    public ResourceHandle validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (data != null ? "\"data\":\"" +  JsonStrings.escapeJson(data) + "\"" : ""),
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
