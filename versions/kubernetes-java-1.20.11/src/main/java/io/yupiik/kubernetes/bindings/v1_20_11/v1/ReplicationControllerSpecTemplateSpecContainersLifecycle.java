package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersLifecycle {
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart postStart;
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop preStop;

    public ReplicationControllerSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecycle(final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                                    final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersLifecycle __otherCasted = (ReplicationControllerSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
