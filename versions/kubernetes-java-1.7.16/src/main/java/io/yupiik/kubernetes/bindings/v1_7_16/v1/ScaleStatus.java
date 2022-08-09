package io.yupiik.kubernetes.bindings.v1_7_16.v1;

import io.yupiik.kubernetes.bindings.v1_7_16.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_16.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_16.Validable;
import io.yupiik.kubernetes.bindings.v1_7_16.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ScaleStatus implements Validable<ScaleStatus>, Exportable {
    private int replicas;
    private String selector;

    public ScaleStatus() {
        // no-op
    }

    public ScaleStatus(final int replicas,
                       final String selector) {
        // no-op
    }

    public int getReplicas() {
        return replicas;
    }

    public void setReplicas(final int replicas) {
        this.replicas = replicas;
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
                replicas,
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScaleStatus)) {
            return false;
        }
        final ScaleStatus __otherCasted = (ScaleStatus) __other;
        return Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector);
    }

    public ScaleStatus replicas(final int replicas) {
        this.replicas = replicas;
        return this;
    }

    public ScaleStatus selector(final String selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public ScaleStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"replicas\":" + replicas,
                    (selector != null ? "\"selector\":\"" +  JsonStrings.escapeJson(selector) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
