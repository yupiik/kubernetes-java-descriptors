package io.yupiik.kubernetes.bindings.v1_18_18;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersLifecycle {
    private ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public ReplicaSetSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecycle(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                             final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersLifecycle __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
