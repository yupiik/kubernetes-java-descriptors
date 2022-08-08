package io.yupiik.kubernetes.bindings.v1_16_7.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersLifecycle {
    private DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart postStart;
    private DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop preStop;

    public DeploymentListItemsSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecycle(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                                  final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop preStop) {
        this.preStop = preStop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                postStart,
                preStop);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersLifecycle __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
