package io.yupiik.kubernetes.bindings.v1_19_6;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
