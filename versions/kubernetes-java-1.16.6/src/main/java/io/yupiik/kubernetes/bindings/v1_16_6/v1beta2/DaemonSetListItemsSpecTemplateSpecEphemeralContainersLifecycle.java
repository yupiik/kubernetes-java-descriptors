package io.yupiik.kubernetes.bindings.v1_16_6.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle {
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                          final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
