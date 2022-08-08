package io.yupiik.kubernetes.bindings.v1_11_7.v1beta1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecAffinity {
    private DaemonSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private DaemonSetSpecTemplateSpecAffinityPodAffinity podAffinity;
    private DaemonSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public DaemonSetSpecTemplateSpecAffinity() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinity(final DaemonSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                             final DaemonSetSpecTemplateSpecAffinityPodAffinity podAffinity,
                                             final DaemonSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final DaemonSetSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public DaemonSetSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final DaemonSetSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public DaemonSetSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final DaemonSetSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecAffinity)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecAffinity __otherCasted = (DaemonSetSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
