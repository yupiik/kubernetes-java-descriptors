package io.yupiik.kubernetes.bindings.v1_14_2.v1beta1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersLifecycle {
    private DeploymentSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private DeploymentSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public DeploymentSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersLifecycle(final DeploymentSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                             final DeploymentSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DeploymentSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DeploymentSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersLifecycle __otherCasted = (DeploymentSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
