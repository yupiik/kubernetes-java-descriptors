package io.yupiik.kubernetes.bindings.v1_30_13.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_13.Validable;
import io.yupiik.kubernetes.bindings.v1_30_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesFilter implements Validable<NamedResourcesFilter>, Exportable {
    private String selector;

    public NamedResourcesFilter() {
        // no-op
    }

    public NamedResourcesFilter(final String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(final String selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedResourcesFilter)) {
            return false;
        }
        final NamedResourcesFilter __otherCasted = (NamedResourcesFilter) __other;
        return Objects.equals(selector, __otherCasted.selector);
    }

    public NamedResourcesFilter selector(final String selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public NamedResourcesFilter validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (selector != null ? "\"selector\":\"" +  JsonStrings.escapeJson(selector) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
