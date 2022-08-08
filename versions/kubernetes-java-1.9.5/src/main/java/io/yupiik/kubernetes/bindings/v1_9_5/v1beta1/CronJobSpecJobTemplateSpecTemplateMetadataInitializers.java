package io.yupiik.kubernetes.bindings.v1_9_5.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private CronJobSpecJobTemplateSpecTemplateMetadataInitializersResult result;

    public CronJobSpecJobTemplateSpecTemplateMetadataInitializers() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateMetadataInitializers(final List<JsonValue> pending,
                                                                  final CronJobSpecJobTemplateSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public CronJobSpecJobTemplateSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CronJobSpecJobTemplateSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateMetadataInitializers)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateMetadataInitializers __otherCasted = (CronJobSpecJobTemplateSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
