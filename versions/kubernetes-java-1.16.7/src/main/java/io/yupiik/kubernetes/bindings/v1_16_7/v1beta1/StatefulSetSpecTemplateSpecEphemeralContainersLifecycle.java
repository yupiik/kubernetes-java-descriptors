package io.yupiik.kubernetes.bindings.v1_16_7.v1beta1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersLifecycle {
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecycle(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                   final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
