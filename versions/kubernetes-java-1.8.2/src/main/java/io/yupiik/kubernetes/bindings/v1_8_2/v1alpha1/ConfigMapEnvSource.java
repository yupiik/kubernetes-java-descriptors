package io.yupiik.kubernetes.bindings.v1_8_2.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_8_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_2.Validable;
import io.yupiik.kubernetes.bindings.v1_8_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ConfigMapEnvSource implements Validable<ConfigMapEnvSource>, Exportable {
    private String name;
    private Boolean optional;

    public ConfigMapEnvSource() {
        // no-op
    }

    public ConfigMapEnvSource(final String name,
                              final Boolean optional) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ConfigMapEnvSource)) {
            return false;
        }
        final ConfigMapEnvSource __otherCasted = (ConfigMapEnvSource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public ConfigMapEnvSource name(final String name) {
        this.name = name;
        return this;
    }

    public ConfigMapEnvSource optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public ConfigMapEnvSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (optional != null ? "\"optional\":" + optional : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
