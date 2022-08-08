package io.yupiik.kubernetes.bindings.v1_7_7;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ScheduledJobSpecJobTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private ScheduledJobSpecJobTemplateMetadataInitializersResult result;

    public ScheduledJobSpecJobTemplateMetadataInitializers() {
        // no-op
    }

    public ScheduledJobSpecJobTemplateMetadataInitializers(final List<JsonValue> pending,
                                                           final ScheduledJobSpecJobTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ScheduledJobSpecJobTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ScheduledJobSpecJobTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof ScheduledJobSpecJobTemplateMetadataInitializers)) {
            return false;
        }
        final ScheduledJobSpecJobTemplateMetadataInitializers __otherCasted = (ScheduledJobSpecJobTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
