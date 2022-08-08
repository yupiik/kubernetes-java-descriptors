package io.yupiik.kubernetes.bindings.v1_16_11;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersLifecycle {
    private PodTemplateListItemsTemplateSpecContainersLifecyclePostStart postStart;
    private PodTemplateListItemsTemplateSpecContainersLifecyclePreStop preStop;

    public PodTemplateListItemsTemplateSpecContainersLifecycle() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecycle(final PodTemplateListItemsTemplateSpecContainersLifecyclePostStart postStart,
                                                               final PodTemplateListItemsTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodTemplateListItemsTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodTemplateListItemsTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersLifecycle)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersLifecycle __otherCasted = (PodTemplateListItemsTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
