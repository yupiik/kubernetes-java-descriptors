package io.yupiik.kubernetes.bindings.v1_8_15.v1alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class RoleMetadataInitializers {
    private List<JsonValue> pending;
    private RoleMetadataInitializersResult result;

    public RoleMetadataInitializers() {
        // no-op
    }

    public RoleMetadataInitializers(final List<JsonValue> pending,
                                    final RoleMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public RoleMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final RoleMetadataInitializersResult result) {
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
        if (!(__other instanceof RoleMetadataInitializers)) {
            return false;
        }
        final RoleMetadataInitializers __otherCasted = (RoleMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
