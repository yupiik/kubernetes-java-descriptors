package io.yupiik.kubernetes.bindings.v1_17_7.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecAffinity {
    private ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private ReplicationControllerListItemsSpecTemplateSpecAffinityPodAffinity podAffinity;
    private ReplicationControllerListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public ReplicationControllerListItemsSpecTemplateSpecAffinity() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecAffinity(final ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                                  final ReplicationControllerListItemsSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                                  final ReplicationControllerListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public ReplicationControllerListItemsSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final ReplicationControllerListItemsSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public ReplicationControllerListItemsSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final ReplicationControllerListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecAffinity)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecAffinity __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
