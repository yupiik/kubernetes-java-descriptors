package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersLifecycle {
    private ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecycle(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                             final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
