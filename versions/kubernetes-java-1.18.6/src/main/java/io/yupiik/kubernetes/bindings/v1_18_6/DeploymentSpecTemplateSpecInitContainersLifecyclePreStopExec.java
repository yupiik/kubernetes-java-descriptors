package io.yupiik.kubernetes.bindings.v1_18_6;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
