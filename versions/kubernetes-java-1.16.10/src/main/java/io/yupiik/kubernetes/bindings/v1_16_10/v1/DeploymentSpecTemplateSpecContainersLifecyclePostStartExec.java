package io.yupiik.kubernetes.bindings.v1_16_10.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (DeploymentSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
