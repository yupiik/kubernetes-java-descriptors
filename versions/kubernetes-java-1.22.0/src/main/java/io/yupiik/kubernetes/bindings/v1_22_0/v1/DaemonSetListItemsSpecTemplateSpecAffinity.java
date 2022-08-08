package io.yupiik.kubernetes.bindings.v1_22_0.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecAffinity {
    private DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private DaemonSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity;
    private DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public DaemonSetListItemsSpecTemplateSpecAffinity() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecAffinity(final DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                      final DaemonSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                      final DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public DaemonSetListItemsSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final DaemonSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecAffinity)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecAffinity __otherCasted = (DaemonSetListItemsSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
