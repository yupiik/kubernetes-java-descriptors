package io.yupiik.kubernetes.bindings.v1_18_2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecAffinity {
    private DeploymentListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity;
    private DeploymentListItemsSpecTemplateSpecAffinityPodAffinity podAffinity;
    private DeploymentListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity;

    public DeploymentListItemsSpecTemplateSpecAffinity() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecAffinity(final DeploymentListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity,
                                                       final DeploymentListItemsSpecTemplateSpecAffinityPodAffinity podAffinity,
                                                       final DeploymentListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final DeploymentListItemsSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public DeploymentListItemsSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final DeploymentListItemsSpecTemplateSpecAffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public DeploymentListItemsSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final DeploymentListItemsSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecAffinity)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecAffinity __otherCasted = (DeploymentListItemsSpecTemplateSpecAffinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }
}
