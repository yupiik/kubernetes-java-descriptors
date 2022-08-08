package io.yupiik.kubernetes.bindings.v1_14_7.v1beta2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersLifecycle {
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public StatefulSetSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecycle(final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                              final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersLifecycle __otherCasted = (StatefulSetSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
