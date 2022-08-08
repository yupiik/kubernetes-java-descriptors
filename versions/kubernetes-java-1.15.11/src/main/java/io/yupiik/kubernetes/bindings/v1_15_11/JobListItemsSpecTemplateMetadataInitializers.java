package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateMetadataInitializers {
    private List<JobListItemsSpecTemplateMetadataInitializersPending> pending;
    private JobListItemsSpecTemplateMetadataInitializersResult result;

    public JobListItemsSpecTemplateMetadataInitializers() {
        // no-op
    }

    public JobListItemsSpecTemplateMetadataInitializers(final List<JobListItemsSpecTemplateMetadataInitializersPending> pending,
                                                        final JobListItemsSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JobListItemsSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<JobListItemsSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public JobListItemsSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final JobListItemsSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof JobListItemsSpecTemplateMetadataInitializers)) {
            return false;
        }
        final JobListItemsSpecTemplateMetadataInitializers __otherCasted = (JobListItemsSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
