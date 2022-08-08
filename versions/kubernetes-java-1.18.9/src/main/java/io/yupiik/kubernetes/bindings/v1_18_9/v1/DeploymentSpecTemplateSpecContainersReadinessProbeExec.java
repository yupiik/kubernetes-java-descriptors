package io.yupiik.kubernetes.bindings.v1_18_9.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (DeploymentSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
