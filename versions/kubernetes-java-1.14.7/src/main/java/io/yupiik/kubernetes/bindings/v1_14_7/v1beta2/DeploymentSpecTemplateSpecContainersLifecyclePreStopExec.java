package io.yupiik.kubernetes.bindings.v1_14_7.v1beta2;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (DeploymentSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
