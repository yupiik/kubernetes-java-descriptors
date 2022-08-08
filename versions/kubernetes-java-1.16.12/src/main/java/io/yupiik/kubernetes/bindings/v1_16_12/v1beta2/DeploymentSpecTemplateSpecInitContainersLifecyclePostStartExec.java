package io.yupiik.kubernetes.bindings.v1_16_12.v1beta2;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
        // no-op
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(final List<String> command) {
        this.command = command;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                command);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
