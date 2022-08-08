package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersLifecycle {
    private StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart;
    private StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop;

    public StatefulSetListItemsSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecycle(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                                   final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersLifecycle __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
