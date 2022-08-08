package io.yupiik.kubernetes.bindings.v1_18_3.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersLifecycle {
    private JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public JobListItemsSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecycle(final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                               final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersLifecycle __otherCasted = (JobListItemsSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
