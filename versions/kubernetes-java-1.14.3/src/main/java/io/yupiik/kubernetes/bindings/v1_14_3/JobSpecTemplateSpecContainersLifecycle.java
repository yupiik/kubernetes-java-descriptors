package io.yupiik.kubernetes.bindings.v1_14_3;

import java.util.Objects;

public class JobSpecTemplateSpecContainersLifecycle {
    private JobSpecTemplateSpecContainersLifecyclePostStart postStart;
    private JobSpecTemplateSpecContainersLifecyclePreStop preStop;

    public JobSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecycle(final JobSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                  final JobSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final JobSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public JobSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final JobSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final JobSpecTemplateSpecContainersLifecycle __otherCasted = (JobSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
