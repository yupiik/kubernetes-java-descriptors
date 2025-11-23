package io.yupiik.kubernetes.bindings.v1_30_14.v1;

import io.yupiik.kubernetes.bindings.v1_30_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_14.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeRuntimeHandlerFeatures implements Validable<NodeRuntimeHandlerFeatures>, Exportable {
    private Boolean recursiveReadOnlyMounts;

    public NodeRuntimeHandlerFeatures() {
        // no-op
    }

    public NodeRuntimeHandlerFeatures(final Boolean recursiveReadOnlyMounts) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    }

    public Boolean getRecursiveReadOnlyMounts() {
        return recursiveReadOnlyMounts;
    }

    public void setRecursiveReadOnlyMounts(final Boolean recursiveReadOnlyMounts) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                recursiveReadOnlyMounts);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeRuntimeHandlerFeatures)) {
            return false;
        }
        final NodeRuntimeHandlerFeatures __otherCasted = (NodeRuntimeHandlerFeatures) __other;
        return Objects.equals(recursiveReadOnlyMounts, __otherCasted.recursiveReadOnlyMounts);
    }

    public NodeRuntimeHandlerFeatures recursiveReadOnlyMounts(final Boolean recursiveReadOnlyMounts) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
        return this;
    }

    @Override
    public NodeRuntimeHandlerFeatures validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (recursiveReadOnlyMounts != null ? "\"recursiveReadOnlyMounts\":" + recursiveReadOnlyMounts : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
