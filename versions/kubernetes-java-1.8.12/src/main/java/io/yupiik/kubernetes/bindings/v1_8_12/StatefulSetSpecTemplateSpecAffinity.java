package io.yupiik.kubernetes.bindings.v1_8_12;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecAffinity {
    private StatefulSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private StatefulSetSpecTemplateSpecAffinityPodAffinity podAffinity;
    private StatefulSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public StatefulSetSpecTemplateSpecAffinity() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecAffinity(final StatefulSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                               final StatefulSetSpecTemplateSpecAffinityPodAffinity podAffinity,
                                               final StatefulSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final StatefulSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public StatefulSetSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final StatefulSetSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public StatefulSetSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final StatefulSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecAffinity)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecAffinity __otherCasted = (StatefulSetSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
