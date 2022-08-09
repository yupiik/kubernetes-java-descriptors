package io.yupiik.kubernetes.bindings.v1_12_7.v1;

import io.yupiik.kubernetes.bindings.v1_12_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_12_7.Validable;
import io.yupiik.kubernetes.bindings.v1_12_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamespaceSpec implements Validable<NamespaceSpec>, Exportable {
    private List<String> finalizers;

    public NamespaceSpec() {
        // no-op
    }

    public NamespaceSpec(final List<String> finalizers) {
        // no-op
    }

    public List<String> getFinalizers() {
        return finalizers;
    }

    public void setFinalizers(final List<String> finalizers) {
        this.finalizers = finalizers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                finalizers);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamespaceSpec)) {
            return false;
        }
        final NamespaceSpec __otherCasted = (NamespaceSpec) __other;
        return Objects.equals(finalizers, __otherCasted.finalizers);
    }

    public NamespaceSpec finalizers(final List<String> finalizers) {
        this.finalizers = finalizers;
        return this;
    }

    @Override
    public NamespaceSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (finalizers != null ? "\"finalizers\":" + finalizers.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
