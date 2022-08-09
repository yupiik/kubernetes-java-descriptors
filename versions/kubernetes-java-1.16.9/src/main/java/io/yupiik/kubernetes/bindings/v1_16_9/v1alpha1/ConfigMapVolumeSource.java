package io.yupiik.kubernetes.bindings.v1_16_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_16_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_9.Validable;
import io.yupiik.kubernetes.bindings.v1_16_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ConfigMapVolumeSource implements Validable<ConfigMapVolumeSource>, Exportable {
    private Integer defaultMode;
    private List<KeyToPath> items;
    private String name;
    private Boolean optional;

    public ConfigMapVolumeSource() {
        // no-op
    }

    public ConfigMapVolumeSource(final Integer defaultMode,
                                 final List<KeyToPath> items,
                                 final String name,
                                 final Boolean optional) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<KeyToPath> getItems() {
        return items;
    }

    public void setItems(final List<KeyToPath> items) {
        this.items = items;
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
                defaultMode,
                items,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ConfigMapVolumeSource)) {
            return false;
        }
        final ConfigMapVolumeSource __otherCasted = (ConfigMapVolumeSource) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public ConfigMapVolumeSource defaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public ConfigMapVolumeSource items(final List<KeyToPath> items) {
        this.items = items;
        return this;
    }

    public ConfigMapVolumeSource name(final String name) {
        this.name = name;
        return this;
    }

    public ConfigMapVolumeSource optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public ConfigMapVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (defaultMode != null ? "\"defaultMode\":" + defaultMode : ""),
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (optional != null ? "\"optional\":" + optional : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
