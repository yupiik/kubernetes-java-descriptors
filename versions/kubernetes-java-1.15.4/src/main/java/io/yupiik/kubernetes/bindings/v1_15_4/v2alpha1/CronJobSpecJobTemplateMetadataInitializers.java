package io.yupiik.kubernetes.bindings.v1_15_4.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateMetadataInitializers {
    private List<CronJobSpecJobTemplateMetadataInitializersPending> pending;
    private CronJobSpecJobTemplateMetadataInitializersResult result;

    public CronJobSpecJobTemplateMetadataInitializers() {
        // no-op
    }

    public CronJobSpecJobTemplateMetadataInitializers(final List<CronJobSpecJobTemplateMetadataInitializersPending> pending,
                                                      final CronJobSpecJobTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<CronJobSpecJobTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CronJobSpecJobTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CronJobSpecJobTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CronJobSpecJobTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof CronJobSpecJobTemplateMetadataInitializers)) {
            return false;
        }
        final CronJobSpecJobTemplateMetadataInitializers __otherCasted = (CronJobSpecJobTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
