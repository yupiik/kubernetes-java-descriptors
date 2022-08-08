package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.Objects;

public class JobSpecTemplateSpecEphemeralContainersLifecycle {
    private JobSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private JobSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public JobSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersLifecycle(final JobSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                           final JobSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final JobSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final JobSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof JobSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final JobSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (JobSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
