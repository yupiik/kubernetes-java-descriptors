package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersLifecycle {
    private DeploymentSpecTemplateSpecContainersLifecyclePostStart postStart;
    private DeploymentSpecTemplateSpecContainersLifecyclePreStop preStop;

    public DeploymentSpecTemplateSpecContainersLifecycle() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecycle(final DeploymentSpecTemplateSpecContainersLifecyclePostStart postStart,
                                                         final DeploymentSpecTemplateSpecContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DeploymentSpecTemplateSpecContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DeploymentSpecTemplateSpecContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersLifecycle)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersLifecycle __otherCasted = (DeploymentSpecTemplateSpecContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
