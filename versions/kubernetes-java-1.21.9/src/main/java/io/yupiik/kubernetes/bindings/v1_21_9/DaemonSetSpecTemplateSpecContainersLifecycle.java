package io.yupiik.kubernetes.bindings.v1_21_9;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersLifecycle {
    private DaemonSetSpecTemplateSpecContainersLifecyclePostStart postStart;
    private DaemonSetSpecTemplateSpecContainersLifecyclePreStop preStop;

    public DaemonSetSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecycle(final DaemonSetSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                        final DaemonSetSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DaemonSetSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DaemonSetSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersLifecycle __otherCasted = (DaemonSetSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
