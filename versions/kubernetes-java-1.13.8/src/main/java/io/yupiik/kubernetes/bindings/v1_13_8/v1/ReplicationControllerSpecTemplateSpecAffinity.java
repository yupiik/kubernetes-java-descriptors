package io.yupiik.kubernetes.bindings.v1_13_8.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecAffinity {
    private ReplicationControllerSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private ReplicationControllerSpecTemplateSpecAffinityPodAffinity podAffinity;
    private ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public ReplicationControllerSpecTemplateSpecAffinity() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecAffinity(final ReplicationControllerSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                         final ReplicationControllerSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                         final ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final ReplicationControllerSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public ReplicationControllerSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final ReplicationControllerSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final ReplicationControllerSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecAffinity)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecAffinity __otherCasted = (ReplicationControllerSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
