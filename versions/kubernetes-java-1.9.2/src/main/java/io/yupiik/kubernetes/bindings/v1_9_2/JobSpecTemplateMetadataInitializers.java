package io.yupiik.kubernetes.bindings.v1_9_2;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class JobSpecTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private JobSpecTemplateMetadataInitializersResult result;

    public JobSpecTemplateMetadataInitializers() {
        // no-op
    }

    public JobSpecTemplateMetadataInitializers(final List<JsonValue> pending,
                                               final JobSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public JobSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final JobSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof JobSpecTemplateMetadataInitializers)) {
            return false;
        }
        final JobSpecTemplateMetadataInitializers __otherCasted = (JobSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
