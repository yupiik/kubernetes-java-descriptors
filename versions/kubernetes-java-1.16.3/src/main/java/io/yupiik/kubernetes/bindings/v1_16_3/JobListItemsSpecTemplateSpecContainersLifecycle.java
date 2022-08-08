package io.yupiik.kubernetes.bindings.v1_16_3;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersLifecycle {
    private JobListItemsSpecTemplateSpecContainersLifecyclePostStart postStart;
    private JobListItemsSpecTemplateSpecContainersLifecyclePreStop preStop;

    public JobListItemsSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecycle(final JobListItemsSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                           final JobListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final JobListItemsSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final JobListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
        this.preStop = preStop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                postStart,
                preStop);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersLifecycle __otherCasted = (JobListItemsSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
