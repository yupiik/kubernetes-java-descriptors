package io.yupiik.kubernetes.bindings.v1_20_9.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecAffinity {
    private PodTemplateTemplateSpecAffinityNodeAffinity nodeAffinity;
    private PodTemplateTemplateSpecAffinityPodAffinity podAffinity;
    private PodTemplateTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public PodTemplateTemplateSpecAffinity() {
        // no-op
    }

    public PodTemplateTemplateSpecAffinity(final PodTemplateTemplateSpecAffinityNodeAffinity nodeAffinity,
                                           final PodTemplateTemplateSpecAffinityPodAffinity podAffinity,
                                           final PodTemplateTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public PodTemplateTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final PodTemplateTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public PodTemplateTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final PodTemplateTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public PodTemplateTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final PodTemplateTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof PodTemplateTemplateSpecAffinity)) {
            return false;
        }
        final PodTemplateTemplateSpecAffinity __otherCasted = (PodTemplateTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
