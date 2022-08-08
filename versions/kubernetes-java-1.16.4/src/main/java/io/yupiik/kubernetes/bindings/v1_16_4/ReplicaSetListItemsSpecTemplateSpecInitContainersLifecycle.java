package io.yupiik.kubernetes.bindings.v1_16_4;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle {
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                      final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
