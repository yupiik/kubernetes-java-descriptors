package io.yupiik.kubernetes.bindings.v1_15_2;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecAffinity {
    private PodTemplateListItemsTemplateSpecAffinityNodeAffinity nodeAffinity;
    private PodTemplateListItemsTemplateSpecAffinityPodAffinity podAffinity;
    private PodTemplateListItemsTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public PodTemplateListItemsTemplateSpecAffinity() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecAffinity(final PodTemplateListItemsTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                    final PodTemplateListItemsTemplateSpecAffinityPodAffinity podAffinity,
                                                    final PodTemplateListItemsTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final PodTemplateListItemsTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public PodTemplateListItemsTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final PodTemplateListItemsTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public PodTemplateListItemsTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final PodTemplateListItemsTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeAffinity,
                podAffinity,
                podAntiAffinity);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecAffinity)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecAffinity __otherCasted = (PodTemplateListItemsTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
