package io.yupiik.kubernetes.bindings.v1_11_6.v1beta2;

import java.util.Objects;

public class DeploymentSpecTemplateSpecAffinity {
    private DeploymentSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private DeploymentSpecTemplateSpecAffinityPodAffinity podAffinity;
    private DeploymentSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public DeploymentSpecTemplateSpecAffinity() {
        // no-op
    }

    public DeploymentSpecTemplateSpecAffinity(final DeploymentSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                              final DeploymentSpecTemplateSpecAffinityPodAffinity podAffinity,
                                              final DeploymentSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public DeploymentSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final DeploymentSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public DeploymentSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final DeploymentSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public DeploymentSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final DeploymentSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecAffinity)) {
            return false;
        }
        final DeploymentSpecTemplateSpecAffinity __otherCasted = (DeploymentSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
