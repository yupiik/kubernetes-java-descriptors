package io.yupiik.kubernetes.bindings.v1_17_4.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersLifecycle {
    private PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public PodTemplateTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecycle(final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                               final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersLifecycle __otherCasted = (PodTemplateTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
