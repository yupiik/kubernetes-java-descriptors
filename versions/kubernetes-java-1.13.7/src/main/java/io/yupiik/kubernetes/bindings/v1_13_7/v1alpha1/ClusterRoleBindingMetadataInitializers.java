package io.yupiik.kubernetes.bindings.v1_13_7.v1alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ClusterRoleBindingMetadataInitializers {
    private List<JsonValue> pending;
    private ClusterRoleBindingMetadataInitializersResult result;

    public ClusterRoleBindingMetadataInitializers() {
        // no-op
    }

    public ClusterRoleBindingMetadataInitializers(final List<JsonValue> pending,
                                                  final ClusterRoleBindingMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ClusterRoleBindingMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ClusterRoleBindingMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterRoleBindingMetadataInitializers)) {
            return false;
        }
        final ClusterRoleBindingMetadataInitializers __otherCasted = (ClusterRoleBindingMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
