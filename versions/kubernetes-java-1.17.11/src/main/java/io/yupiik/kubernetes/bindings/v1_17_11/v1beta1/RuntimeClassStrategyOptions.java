package io.yupiik.kubernetes.bindings.v1_17_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_11.Validable;
import io.yupiik.kubernetes.bindings.v1_17_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RuntimeClassStrategyOptions implements Validable<RuntimeClassStrategyOptions>, Exportable {
    private List<String> allowedRuntimeClassNames;
    private String defaultRuntimeClassName;

    public RuntimeClassStrategyOptions() {
        // no-op
    }

    public RuntimeClassStrategyOptions(final List<String> allowedRuntimeClassNames,
                                       final String defaultRuntimeClassName) {
        // no-op
    }

    public List<String> getAllowedRuntimeClassNames() {
        return allowedRuntimeClassNames;
    }

    public void setAllowedRuntimeClassNames(final List<String> allowedRuntimeClassNames) {
        this.allowedRuntimeClassNames = allowedRuntimeClassNames;
    }

    public String getDefaultRuntimeClassName() {
        return defaultRuntimeClassName;
    }

    public void setDefaultRuntimeClassName(final String defaultRuntimeClassName) {
        this.defaultRuntimeClassName = defaultRuntimeClassName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowedRuntimeClassNames,
                defaultRuntimeClassName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassStrategyOptions)) {
            return false;
        }
        final RuntimeClassStrategyOptions __otherCasted = (RuntimeClassStrategyOptions) __other;
        return Objects.equals(allowedRuntimeClassNames, __otherCasted.allowedRuntimeClassNames) &&
            Objects.equals(defaultRuntimeClassName, __otherCasted.defaultRuntimeClassName);
    }

    public RuntimeClassStrategyOptions allowedRuntimeClassNames(final List<String> allowedRuntimeClassNames) {
        this.allowedRuntimeClassNames = allowedRuntimeClassNames;
        return this;
    }

    public RuntimeClassStrategyOptions defaultRuntimeClassName(final String defaultRuntimeClassName) {
        this.defaultRuntimeClassName = defaultRuntimeClassName;
        return this;
    }

    @Override
    public RuntimeClassStrategyOptions validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (allowedRuntimeClassNames == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "allowedRuntimeClassNames", "allowedRuntimeClassNames",
                "Missing 'allowedRuntimeClassNames' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allowedRuntimeClassNames != null ? "\"allowedRuntimeClassNames\":" + allowedRuntimeClassNames.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (defaultRuntimeClassName != null ? "\"defaultRuntimeClassName\":\"" +  JsonStrings.escapeJson(defaultRuntimeClassName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}