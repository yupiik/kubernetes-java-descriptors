package io.yupiik.kubernetes.bindings.v1_32_5.v1;

import io.yupiik.kubernetes.bindings.v1_32_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_5.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeRuntimeHandlerFeatures implements Validable<NodeRuntimeHandlerFeatures>, Exportable {
    private Boolean recursiveReadOnlyMounts;
    private Boolean userNamespaces;

    public NodeRuntimeHandlerFeatures() {
        // no-op
    }

    public NodeRuntimeHandlerFeatures(final Boolean recursiveReadOnlyMounts,
                                      final Boolean userNamespaces) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
        this.userNamespaces = userNamespaces;
    }

    public Boolean getRecursiveReadOnlyMounts() {
        return recursiveReadOnlyMounts;
    }

    public void setRecursiveReadOnlyMounts(final Boolean recursiveReadOnlyMounts) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    }

    public Boolean getUserNamespaces() {
        return userNamespaces;
    }

    public void setUserNamespaces(final Boolean userNamespaces) {
        this.userNamespaces = userNamespaces;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                recursiveReadOnlyMounts,
                userNamespaces);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeRuntimeHandlerFeatures)) {
            return false;
        }
        final NodeRuntimeHandlerFeatures __otherCasted = (NodeRuntimeHandlerFeatures) __other;
        return Objects.equals(recursiveReadOnlyMounts, __otherCasted.recursiveReadOnlyMounts) &&
            Objects.equals(userNamespaces, __otherCasted.userNamespaces);
    }

    public NodeRuntimeHandlerFeatures recursiveReadOnlyMounts(final Boolean recursiveReadOnlyMounts) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
        return this;
    }

    public NodeRuntimeHandlerFeatures userNamespaces(final Boolean userNamespaces) {
        this.userNamespaces = userNamespaces;
        return this;
    }

    @Override
    public NodeRuntimeHandlerFeatures validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (recursiveReadOnlyMounts != null ? "\"recursiveReadOnlyMounts\":" + recursiveReadOnlyMounts : ""),
                    (userNamespaces != null ? "\"userNamespaces\":" + userNamespaces : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
