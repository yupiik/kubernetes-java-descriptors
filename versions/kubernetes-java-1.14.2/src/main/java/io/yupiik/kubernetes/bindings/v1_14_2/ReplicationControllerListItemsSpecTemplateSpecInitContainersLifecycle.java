package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle {
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                                 final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
