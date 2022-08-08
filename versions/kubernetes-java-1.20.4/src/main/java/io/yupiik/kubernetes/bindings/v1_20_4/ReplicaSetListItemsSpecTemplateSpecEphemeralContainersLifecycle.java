package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecycle {
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecycle(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                           final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
