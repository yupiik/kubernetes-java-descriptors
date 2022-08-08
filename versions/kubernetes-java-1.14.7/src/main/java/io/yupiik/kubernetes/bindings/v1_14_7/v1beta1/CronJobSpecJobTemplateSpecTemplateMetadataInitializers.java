package io.yupiik.kubernetes.bindings.v1_14_7.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateMetadataInitializers {
    private List<CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending> pending;
    private CronJobSpecJobTemplateSpecTemplateMetadataInitializersResult result;

    public CronJobSpecJobTemplateSpecTemplateMetadataInitializers() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateMetadataInitializers(final List<CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending> pending,
                                                                  final CronJobSpecJobTemplateSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending> pending) {
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
