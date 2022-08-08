package io.yupiik.kubernetes.bindings.v1_17_7.v1beta1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle {
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                       final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
