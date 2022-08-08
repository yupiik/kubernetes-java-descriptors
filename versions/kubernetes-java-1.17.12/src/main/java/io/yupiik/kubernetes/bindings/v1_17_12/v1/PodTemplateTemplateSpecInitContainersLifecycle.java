package io.yupiik.kubernetes.bindings.v1_17_12.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersLifecycle {
    private PodTemplateTemplateSpecInitContainersLifecyclePostStart postStart;
    private PodTemplateTemplateSpecInitContainersLifecyclePreStop preStop;

    public PodTemplateTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLifecycle(final PodTemplateTemplateSpecInitContainersLifecyclePostStart postStart,
                                                          final PodTemplateTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodTemplateTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodTemplateTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersLifecycle __otherCasted = (PodTemplateTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
