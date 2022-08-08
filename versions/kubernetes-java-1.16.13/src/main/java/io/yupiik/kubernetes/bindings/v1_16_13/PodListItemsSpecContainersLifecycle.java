package io.yupiik.kubernetes.bindings.v1_16_13;

import java.util.Objects;

public class PodListItemsSpecContainersLifecycle {
    private PodListItemsSpecContainersLifecyclePostStart postStart;
    private PodListItemsSpecContainersLifecyclePreStop preStop;

    public PodListItemsSpecContainersLifecycle() {
        // no-op
    }

    public PodListItemsSpecContainersLifecycle(final PodListItemsSpecContainersLifecyclePostStart postStart,
                                               final PodListItemsSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodListItemsSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodListItemsSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodListItemsSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodListItemsSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodListItemsSpecContainersLifecycle)) {
            return false;
        }
        final PodListItemsSpecContainersLifecycle __otherCasted = (PodListItemsSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
