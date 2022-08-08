package io.yupiik.kubernetes.bindings.v1_10_11.v1beta2;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private DaemonSetSpecTemplateMetadataInitializersResult result;

    public DaemonSetSpecTemplateMetadataInitializers() {
        // no-op
    }

    public DaemonSetSpecTemplateMetadataInitializers(final List<JsonValue> pending,
                                                     final DaemonSetSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public DaemonSetSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DaemonSetSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof DaemonSetSpecTemplateMetadataInitializers)) {
            return false;
        }
        final DaemonSetSpecTemplateMetadataInitializers __otherCasted = (DaemonSetSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
