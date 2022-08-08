package io.yupiik.kubernetes.bindings.v1_16_11;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinity {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinity() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinity(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                                   final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                                   final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinity)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinity __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
