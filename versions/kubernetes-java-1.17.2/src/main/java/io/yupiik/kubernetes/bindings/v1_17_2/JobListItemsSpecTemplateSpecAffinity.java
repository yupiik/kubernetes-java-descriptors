package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecAffinity {
    private JobListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private JobListItemsSpecTemplateSpecAffinityPodAffinity podAffinity;
    private JobListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public JobListItemsSpecTemplateSpecAffinity() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecAffinity(final JobListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                final JobListItemsSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                final JobListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final JobListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public JobListItemsSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final JobListItemsSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public JobListItemsSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final JobListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecAffinity)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecAffinity __otherCasted = (JobListItemsSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
