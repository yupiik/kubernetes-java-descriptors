package io.yupiik.kubernetes.bindings.v1_31_7.v1;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeFeatures implements Validable<NodeFeatures>, Exportable {
    private Boolean supplementalGroupsPolicy;

    public NodeFeatures() {
        // no-op
    }

    public NodeFeatures(final Boolean supplementalGroupsPolicy) {
        this.supplementalGroupsPolicy = supplementalGroupsPolicy;
    }

    public Boolean getSupplementalGroupsPolicy() {
        return supplementalGroupsPolicy;
    }

    public void setSupplementalGroupsPolicy(final Boolean supplementalGroupsPolicy) {
        this.supplementalGroupsPolicy = supplementalGroupsPolicy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                supplementalGroupsPolicy);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeFeatures)) {
            return false;
        }
        final NodeFeatures __otherCasted = (NodeFeatures) __other;
        return Objects.equals(supplementalGroupsPolicy, __otherCasted.supplementalGroupsPolicy);
    }

    public NodeFeatures supplementalGroupsPolicy(final Boolean supplementalGroupsPolicy) {
        this.supplementalGroupsPolicy = supplementalGroupsPolicy;
        return this;
    }

    @Override
    public NodeFeatures validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (supplementalGroupsPolicy != null ? "\"supplementalGroupsPolicy\":" + supplementalGroupsPolicy : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
