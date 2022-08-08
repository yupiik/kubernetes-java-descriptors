package io.yupiik.kubernetes.bindings.v1_19_3.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecContainersLifecycle {
    private PodTemplateTemplateSpecContainersLifecyclePostStart postStart;
    private PodTemplateTemplateSpecContainersLifecyclePreStop preStop;

    public PodTemplateTemplateSpecContainersLifecycle() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLifecycle(final PodTemplateTemplateSpecContainersLifecyclePostStart postStart,
                                                      final PodTemplateTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodTemplateTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodTemplateTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodTemplateTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersLifecycle)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersLifecycle __otherCasted = (PodTemplateTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
