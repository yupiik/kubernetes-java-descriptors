package io.yupiik.kubernetes.bindings.v1_23_8.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersLifecycle {
    private PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecycle(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                        final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersLifecycle __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
