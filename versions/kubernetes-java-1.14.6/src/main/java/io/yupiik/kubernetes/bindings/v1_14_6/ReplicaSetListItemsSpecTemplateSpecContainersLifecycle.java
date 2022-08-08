package io.yupiik.kubernetes.bindings.v1_14_6;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersLifecycle {
    private ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart;
    private ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop;

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecycle(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                                  final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersLifecycle __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
