package io.yupiik.kubernetes.bindings.v1_17_6.v1beta2;

import io.yupiik.kubernetes.bindings.v1_17_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_6.Validable;
import io.yupiik.kubernetes.bindings.v1_17_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodDNSConfigOption implements Validable<PodDNSConfigOption>, Exportable {
    private String name;
    private String value;

    public PodDNSConfigOption() {
        // no-op
    }

    public PodDNSConfigOption(final String name,
                              final String value) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodDNSConfigOption)) {
            return false;
        }
        final PodDNSConfigOption __otherCasted = (PodDNSConfigOption) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }

    public PodDNSConfigOption name(final String name) {
        this.name = name;
        return this;
    }

    public PodDNSConfigOption value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public PodDNSConfigOption validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
