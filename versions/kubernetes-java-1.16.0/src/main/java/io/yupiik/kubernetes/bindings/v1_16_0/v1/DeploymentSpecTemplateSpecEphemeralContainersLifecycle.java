package io.yupiik.kubernetes.bindings.v1_16_0.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainersLifecycle {
    private DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart;
    private DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop;

    public DeploymentSpecTemplateSpecEphemeralContainersLifecycle() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecycle(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart,
                                                                  final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStop preStop) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainersLifecycle)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainersLifecycle __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
