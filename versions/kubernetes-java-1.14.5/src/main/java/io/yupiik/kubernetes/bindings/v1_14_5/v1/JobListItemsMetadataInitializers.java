package io.yupiik.kubernetes.bindings.v1_14_5.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsMetadataInitializers {
    private List<JobListItemsMetadataInitializersPending> pending;
    private JobListItemsMetadataInitializersResult result;

    public JobListItemsMetadataInitializers() {
        // no-op
    }

    public JobListItemsMetadataInitializers(final List<JobListItemsMetadataInitializersPending> pending,
                                            final JobListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<JobListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<JobListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public JobListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final JobListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof JobListItemsMetadataInitializers)) {
            return false;
        }
        final JobListItemsMetadataInitializers __otherCasted = (JobListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
