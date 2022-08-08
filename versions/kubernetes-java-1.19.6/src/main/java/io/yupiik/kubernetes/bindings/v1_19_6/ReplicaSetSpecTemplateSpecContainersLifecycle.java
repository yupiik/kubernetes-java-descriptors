package io.yupiik.kubernetes.bindings.v1_19_6;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersLifecycle {
    private ReplicaSetSpecTemplateSpecContainersLifecyclePostStart postStart;
    private ReplicaSetSpecTemplateSpecContainersLifecyclePreStop preStop;

    public ReplicaSetSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLifecycle(final ReplicaSetSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                         final ReplicaSetSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicaSetSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicaSetSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersLifecycle __otherCasted = (ReplicaSetSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
