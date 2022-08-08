package io.yupiik.kubernetes.bindings.v1_16_15.v1beta1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersLifecycle {
    private DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecycle(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                 final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
