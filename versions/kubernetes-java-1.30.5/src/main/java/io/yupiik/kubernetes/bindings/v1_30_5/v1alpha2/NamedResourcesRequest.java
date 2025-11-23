package io.yupiik.kubernetes.bindings.v1_30_5.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_5.Validable;
import io.yupiik.kubernetes.bindings.v1_30_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesRequest implements Validable<NamedResourcesRequest>, Exportable {
    private String selector;

    public NamedResourcesRequest() {
        // no-op
    }

    public NamedResourcesRequest(final String selector) {
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
        if (!(__other instanceof NamedResourcesRequest)) {
            return false;
        }
        final NamedResourcesRequest __otherCasted = (NamedResourcesRequest) __other;
        return Objects.equals(selector, __otherCasted.selector);
    }

    public NamedResourcesRequest selector(final String selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public NamedResourcesRequest validate() {
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
