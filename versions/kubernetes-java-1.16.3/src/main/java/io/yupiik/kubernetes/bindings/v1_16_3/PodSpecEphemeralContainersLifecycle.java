package io.yupiik.kubernetes.bindings.v1_16_3;

import java.util.Objects;

public class PodSpecEphemeralContainersLifecycle {
    private PodSpecEphemeralContainersLifecyclePostStart postStart;
    private PodSpecEphemeralContainersLifecyclePreStop preStop;

    public PodSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public PodSpecEphemeralContainersLifecycle(final PodSpecEphemeralContainersLifecyclePostStart postStart,
                                               final PodSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final PodSpecEphemeralContainersLifecycle __otherCasted = (PodSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
