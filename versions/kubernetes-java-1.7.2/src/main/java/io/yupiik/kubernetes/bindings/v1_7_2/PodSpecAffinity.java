package io.yupiik.kubernetes.bindings.v1_7_2;

import java.util.Objects;

public class PodSpecAffinity {
    private PodSpecAffinityNodeAffinity nodeAffinity;
    private PodSpecAffinityPodAffinity podAffinity;
    private PodSpecAffinityPodAntiAffinity podAntiAffinity;

    public PodSpecAffinity() {
        // no-op
    }

    public PodSpecAffinity(final PodSpecAffinityNodeAffinity nodeAffinity,
                           final PodSpecAffinityPodAffinity podAffinity,
                           final PodSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public PodSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final PodSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public PodSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final PodSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public PodSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final PodSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof PodSpecAffinity)) {
            return false;
        }
        final PodSpecAffinity __otherCasted = (PodSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
