package io.yupiik.kubernetes.bindings.v1_14_4.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersLifecycle {
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecycle(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                      final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersLifecycle __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
