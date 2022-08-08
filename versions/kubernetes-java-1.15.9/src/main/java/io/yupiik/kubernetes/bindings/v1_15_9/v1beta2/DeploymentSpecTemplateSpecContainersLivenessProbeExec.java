package io.yupiik.kubernetes.bindings.v1_15_9.v1beta2;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (DeploymentSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
