package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle {
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                            final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
