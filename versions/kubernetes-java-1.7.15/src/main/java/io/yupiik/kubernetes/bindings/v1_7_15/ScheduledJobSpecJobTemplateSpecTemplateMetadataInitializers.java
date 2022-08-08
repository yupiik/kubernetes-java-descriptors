package io.yupiik.kubernetes.bindings.v1_7_15;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializersResult result;

    public ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializers() {
        // no-op
    }

    public ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializers(final List<JsonValue> pending,
                                                                       final ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializers)) {
            return false;
        }
        final ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializers __otherCasted = (ScheduledJobSpecJobTemplateSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
