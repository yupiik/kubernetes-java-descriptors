package io.yupiik.kubernetes.bindings.v1_16_8.v1;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersLifecycle {
    private PodListItemsSpecEphemeralContainersLifecyclePostStart postStart;
    private PodListItemsSpecEphemeralContainersLifecyclePreStop preStop;

    public PodListItemsSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLifecycle(final PodListItemsSpecEphemeralContainersLifecyclePostStart postStart,
                                                        final PodListItemsSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodListItemsSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodListItemsSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodListItemsSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersLifecycle __otherCasted = (PodListItemsSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
