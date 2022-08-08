package io.yupiik.kubernetes.bindings.v1_11_7.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class RoleBindingMetadataInitializers {
    private List<JsonValue> pending;
    private RoleBindingMetadataInitializersResult result;

    public RoleBindingMetadataInitializers() {
        // no-op
    }

    public RoleBindingMetadataInitializers(final List<JsonValue> pending,
                                           final RoleBindingMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public RoleBindingMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final RoleBindingMetadataInitializersResult result) {
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
        if (!(__other instanceof RoleBindingMetadataInitializers)) {
            return false;
        }
        final RoleBindingMetadataInitializers __otherCasted = (RoleBindingMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
