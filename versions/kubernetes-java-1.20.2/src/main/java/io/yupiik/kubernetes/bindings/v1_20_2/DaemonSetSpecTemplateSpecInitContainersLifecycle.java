package io.yupiik.kubernetes.bindings.v1_20_2;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersLifecycle {
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public DaemonSetSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecycle(final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                            final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersLifecycle __otherCasted = (DaemonSetSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
