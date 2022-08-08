package io.yupiik.kubernetes.bindings.v1_16_12.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecycle {
    private ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecycle(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                                      final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
