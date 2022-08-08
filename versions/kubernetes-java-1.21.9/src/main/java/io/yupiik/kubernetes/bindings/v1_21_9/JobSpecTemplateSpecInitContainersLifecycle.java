package io.yupiik.kubernetes.bindings.v1_21_9;

import java.util.Objects;

public class JobSpecTemplateSpecInitContainersLifecycle {
    private JobSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private JobSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public JobSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersLifecycle(final JobSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                      final JobSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final JobSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public JobSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final JobSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersLifecycle __otherCasted = (JobSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
