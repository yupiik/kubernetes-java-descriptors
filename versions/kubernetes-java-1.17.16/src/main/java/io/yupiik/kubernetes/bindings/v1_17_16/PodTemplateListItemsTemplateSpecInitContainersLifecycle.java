package io.yupiik.kubernetes.bindings.v1_17_16;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersLifecycle {
    private PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart postStart;
    private PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop preStop;

    public PodTemplateListItemsTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecycle(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                   final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersLifecycle __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
