package io.yupiik.kubernetes.bindings.v1_19_12;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersLifecycle {
    private ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public ReplicationControllerSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecycle(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                        final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersLifecycle __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
