package io.yupiik.kubernetes.bindings.v1_14_7.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle {
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                     final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
