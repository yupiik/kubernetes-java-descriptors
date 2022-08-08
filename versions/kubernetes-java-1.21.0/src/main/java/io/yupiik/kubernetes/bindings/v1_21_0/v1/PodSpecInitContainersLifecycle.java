package io.yupiik.kubernetes.bindings.v1_21_0.v1;

import java.util.Objects;

public class PodSpecInitContainersLifecycle {
    private PodSpecInitContainersLifecyclePostStart postStart;
    private PodSpecInitContainersLifecyclePreStop preStop;

    public PodSpecInitContainersLifecycle() {
        // no-op
    }

    public PodSpecInitContainersLifecycle(final PodSpecInitContainersLifecyclePostStart postStart,
                                          final PodSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodSpecInitContainersLifecycle)) {
            return false;
        }
        final PodSpecInitContainersLifecycle __otherCasted = (PodSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
