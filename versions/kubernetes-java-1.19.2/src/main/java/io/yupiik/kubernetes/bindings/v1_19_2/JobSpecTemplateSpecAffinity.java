package io.yupiik.kubernetes.bindings.v1_19_2;

import java.util.Objects;

public class JobSpecTemplateSpecAffinity {
    private JobSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private JobSpecTemplateSpecAffinityPodAffinity podAffinity;
    private JobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public JobSpecTemplateSpecAffinity() {
        // no-op
    }

    public JobSpecTemplateSpecAffinity(final JobSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                       final JobSpecTemplateSpecAffinityPodAffinity podAffinity,
                                       final JobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public JobSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final JobSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public JobSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final JobSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public JobSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final JobSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof JobSpecTemplateSpecAffinity)) {
            return false;
        }
        final JobSpecTemplateSpecAffinity __otherCasted = (JobSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
