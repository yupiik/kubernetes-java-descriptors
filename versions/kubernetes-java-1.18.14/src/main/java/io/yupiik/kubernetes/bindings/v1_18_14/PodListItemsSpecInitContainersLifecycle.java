package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.Objects;

public class PodListItemsSpecInitContainersLifecycle {
    private PodListItemsSpecInitContainersLifecyclePostStart postStart;
    private PodListItemsSpecInitContainersLifecyclePreStop preStop;

    public PodListItemsSpecInitContainersLifecycle() {
        // no-op
    }

    public PodListItemsSpecInitContainersLifecycle(final PodListItemsSpecInitContainersLifecyclePostStart postStart,
                                                   final PodListItemsSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodListItemsSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodListItemsSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodListItemsSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodListItemsSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersLifecycle)) {
            return false;
        }
        final PodListItemsSpecInitContainersLifecycle __otherCasted = (PodListItemsSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
