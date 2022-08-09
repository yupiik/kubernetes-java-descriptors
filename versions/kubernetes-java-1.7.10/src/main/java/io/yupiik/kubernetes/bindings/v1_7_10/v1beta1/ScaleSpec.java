package io.yupiik.kubernetes.bindings.v1_7_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_10.Validable;
import io.yupiik.kubernetes.bindings.v1_7_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ScaleSpec implements Validable<ScaleSpec>, Exportable {
    private Integer replicas;

    public ScaleSpec() {
        // no-op
    }

    public ScaleSpec(final Integer replicas) {
        // no-op
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                replicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScaleSpec)) {
            return false;
        }
        final ScaleSpec __otherCasted = (ScaleSpec) __other;
        return Objects.equals(replicas, __otherCasted.replicas);
    }

    public ScaleSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    @Override
    public ScaleSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (replicas != null ? "\"replicas\":" + replicas : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
