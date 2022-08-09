package io.yupiik.kubernetes.bindings.v1_14_5.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_14_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_14_5.Validable;
import io.yupiik.kubernetes.bindings.v1_14_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SecretKeySelector implements Validable<SecretKeySelector>, Exportable {
    private String key;
    private String name;
    private Boolean optional;

    public SecretKeySelector() {
        // no-op
    }

    public SecretKeySelector(final String key,
                             final String name,
                             final Boolean optional) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
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
                key,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecretKeySelector)) {
            return false;
        }
        final SecretKeySelector __otherCasted = (SecretKeySelector) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public SecretKeySelector key(final String key) {
        this.key = key;
        return this;
    }

    public SecretKeySelector name(final String name) {
        this.name = name;
        return this;
    }

    public SecretKeySelector optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public SecretKeySelector validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (optional != null ? "\"optional\":" + optional : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
