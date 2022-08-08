package io.yupiik.kubernetes.bindings.v1_19_16.v1;

import java.util.Objects;

public class PodListItemsSpecAffinity {
    private PodListItemsSpecAffinityNodeAffinity nodeAffinity;
    private PodListItemsSpecAffinityPodAffinity podAffinity;
    private PodListItemsSpecAffinityPodAntiAffinity podAntiAffinity;

    public PodListItemsSpecAffinity() {
        // no-op
    }

    public PodListItemsSpecAffinity(final PodListItemsSpecAffinityNodeAffinity nodeAffinity,
                                    final PodListItemsSpecAffinityPodAffinity podAffinity,
                                    final PodListItemsSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public PodListItemsSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final PodListItemsSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public PodListItemsSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final PodListItemsSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public PodListItemsSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final PodListItemsSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof PodListItemsSpecAffinity)) {
            return false;
        }
        final PodListItemsSpecAffinity __otherCasted = (PodListItemsSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
