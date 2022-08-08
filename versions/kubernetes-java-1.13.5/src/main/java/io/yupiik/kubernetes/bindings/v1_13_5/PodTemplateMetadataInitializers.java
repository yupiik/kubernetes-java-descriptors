package io.yupiik.kubernetes.bindings.v1_13_5;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private PodTemplateMetadataInitializersResult result;

    public PodTemplateMetadataInitializers() {
        // no-op
    }

    public PodTemplateMetadataInitializers(final List<JsonValue> pending,
                                           final PodTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public PodTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof PodTemplateMetadataInitializers)) {
            return false;
        }
        final PodTemplateMetadataInitializers __otherCasted = (PodTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
