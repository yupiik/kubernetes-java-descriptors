package io.yupiik.kubernetes.bindings.v1_24_3.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle {
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                           final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
