package io.yupiik.kubernetes.bindings.v1_7_3.v2alpha1;

import java.util.Objects;

public class ScheduledJobSpecJobTemplateSpecTemplateSpecAffinity {
    private ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity;
    private ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public ScheduledJobSpecJobTemplateSpecTemplateSpecAffinity() {
        // no-op
    }

    public ScheduledJobSpecJobTemplateSpecTemplateSpecAffinity(final ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                               final ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                               final ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof ScheduledJobSpecJobTemplateSpecTemplateSpecAffinity)) {
            return false;
        }
        final ScheduledJobSpecJobTemplateSpecTemplateSpecAffinity __otherCasted = (ScheduledJobSpecJobTemplateSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
