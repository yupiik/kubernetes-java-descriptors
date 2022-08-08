package io.yupiik.kubernetes.bindings.v1_16_12.v1;

import java.util.Objects;

public class PodSpecContainersLifecycle {
    private PodSpecContainersLifecyclePostStart postStart;
    private PodSpecContainersLifecyclePreStop preStop;

    public PodSpecContainersLifecycle() {
        // no-op
    }

    public PodSpecContainersLifecycle(final PodSpecContainersLifecyclePostStart postStart,
                                      final PodSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodSpecContainersLifecycle)) {
            return false;
        }
        final PodSpecContainersLifecycle __otherCasted = (PodSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
