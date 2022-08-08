package io.yupiik.kubernetes.bindings.v1_8_9.v1beta2;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecAffinity {
    private ReplicaSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private ReplicaSetSpecTemplateSpecAffinityPodAffinity podAffinity;
    private ReplicaSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public ReplicaSetSpecTemplateSpecAffinity() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecAffinity(final ReplicaSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                              final ReplicaSetSpecTemplateSpecAffinityPodAffinity podAffinity,
                                              final ReplicaSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final ReplicaSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public ReplicaSetSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final ReplicaSetSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public ReplicaSetSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final ReplicaSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecAffinity)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecAffinity __otherCasted = (ReplicaSetSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
