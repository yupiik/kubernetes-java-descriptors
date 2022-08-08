package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersLifecycle {
    private DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart;
    private DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop;

    public DaemonSetListItemsSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecycle(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                                 final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersLifecycle __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
