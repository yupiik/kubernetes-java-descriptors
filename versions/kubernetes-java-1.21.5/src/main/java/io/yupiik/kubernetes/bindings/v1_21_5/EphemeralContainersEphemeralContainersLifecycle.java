package io.yupiik.kubernetes.bindings.v1_21_5;

import java.util.Objects;

public class EphemeralContainersEphemeralContainersLifecycle {
    private EphemeralContainersEphemeralContainersLifecyclePostStart postStart;
    private EphemeralContainersEphemeralContainersLifecyclePreStop preStop;

    public EphemeralContainersEphemeralContainersLifecycle() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersLifecycle(final EphemeralContainersEphemeralContainersLifecyclePostStart postStart,
                                                           final EphemeralContainersEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public EphemeralContainersEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final EphemeralContainersEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public EphemeralContainersEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final EphemeralContainersEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersLifecycle)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersLifecycle __otherCasted = (EphemeralContainersEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
