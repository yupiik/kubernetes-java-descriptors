package io.yupiik.kubernetes.bindings.v1_16_12.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle {
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart postStart;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop preStop;

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                                             final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
