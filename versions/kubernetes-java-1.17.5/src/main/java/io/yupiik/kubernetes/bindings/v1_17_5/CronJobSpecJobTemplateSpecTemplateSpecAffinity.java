package io.yupiik.kubernetes.bindings.v1_17_5;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecAffinity {
    private CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity;
    private CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public CronJobSpecJobTemplateSpecTemplateSpecAffinity() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinity(final CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                          final CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                          final CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecAffinity)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecAffinity __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
