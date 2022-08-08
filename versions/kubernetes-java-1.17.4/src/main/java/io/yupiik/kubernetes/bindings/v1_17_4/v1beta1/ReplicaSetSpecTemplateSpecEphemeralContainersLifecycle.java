package io.yupiik.kubernetes.bindings.v1_17_4.v1beta1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersLifecycle {
    private ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecycle(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                  final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
