package io.yupiik.kubernetes.bindings.v1_18_0;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecEphemeralContainersLifecycle {
    private JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecycle(final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                    final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (JobListItemsSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
