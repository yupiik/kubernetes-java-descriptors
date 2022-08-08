package io.yupiik.kubernetes.bindings.v1_11_8.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private ReplicaSetSpecTemplateMetadataInitializersResult result;

    public ReplicaSetSpecTemplateMetadataInitializers() {
        // no-op
    }

    public ReplicaSetSpecTemplateMetadataInitializers(final List<JsonValue> pending,
                                                      final ReplicaSetSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ReplicaSetSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicaSetSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateMetadataInitializers)) {
            return false;
        }
        final ReplicaSetSpecTemplateMetadataInitializers __otherCasted = (ReplicaSetSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
