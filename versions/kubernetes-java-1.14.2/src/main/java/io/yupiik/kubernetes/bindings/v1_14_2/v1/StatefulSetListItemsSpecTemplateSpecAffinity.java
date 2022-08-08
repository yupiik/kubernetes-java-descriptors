package io.yupiik.kubernetes.bindings.v1_14_2.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecAffinity {
    private StatefulSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity;
    private StatefulSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public StatefulSetListItemsSpecTemplateSpecAffinity() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecAffinity(final StatefulSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                        final StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                        final StatefulSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final StatefulSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public StatefulSetListItemsSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final StatefulSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecAffinity)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecAffinity __otherCasted = (StatefulSetListItemsSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
