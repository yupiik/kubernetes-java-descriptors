package io.yupiik.kubernetes.bindings.v1_18_2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersLifecycle {
    private StatefulSetSpecTemplateSpecContainersLifecyclePostStart postStart;
    private StatefulSetSpecTemplateSpecContainersLifecyclePreStop preStop;

    public StatefulSetSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersLifecycle(final StatefulSetSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                          final StatefulSetSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final StatefulSetSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final StatefulSetSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersLifecycle __otherCasted = (StatefulSetSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
