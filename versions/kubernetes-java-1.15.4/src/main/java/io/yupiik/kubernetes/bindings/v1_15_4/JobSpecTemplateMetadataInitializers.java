package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateMetadataInitializers {
    private List<JobSpecTemplateMetadataInitializersPending> pending;
    private JobSpecTemplateMetadataInitializersResult result;

    public JobSpecTemplateMetadataInitializers() {
        // no-op
    }

    public JobSpecTemplateMetadataInitializers(final List<JobSpecTemplateMetadataInitializersPending> pending,
                                               final JobSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JobSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<JobSpecTemplateMetadataInitializersPending> pending) {
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
