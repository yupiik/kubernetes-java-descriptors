package io.yupiik.kubernetes.bindings.v1_10_8.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private ReplicationControllerSpecTemplateMetadataInitializersResult result;

    public ReplicationControllerSpecTemplateMetadataInitializers() {
        // no-op
    }

    public ReplicationControllerSpecTemplateMetadataInitializers(final List<JsonValue> pending,
                                                                 final ReplicationControllerSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ReplicationControllerSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicationControllerSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateMetadataInitializers)) {
            return false;
        }
        final ReplicationControllerSpecTemplateMetadataInitializers __otherCasted = (ReplicationControllerSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
