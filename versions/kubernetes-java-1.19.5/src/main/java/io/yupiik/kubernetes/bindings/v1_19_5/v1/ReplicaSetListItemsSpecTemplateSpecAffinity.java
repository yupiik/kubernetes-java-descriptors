package io.yupiik.kubernetes.bindings.v1_19_5.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecAffinity {
    private ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private ReplicaSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity;
    private ReplicaSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public ReplicaSetListItemsSpecTemplateSpecAffinity() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecAffinity(final ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                       final ReplicaSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                       final ReplicaSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public ReplicaSetListItemsSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final ReplicaSetListItemsSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public ReplicaSetListItemsSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final ReplicaSetListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecAffinity)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecAffinity __otherCasted = (ReplicaSetListItemsSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
