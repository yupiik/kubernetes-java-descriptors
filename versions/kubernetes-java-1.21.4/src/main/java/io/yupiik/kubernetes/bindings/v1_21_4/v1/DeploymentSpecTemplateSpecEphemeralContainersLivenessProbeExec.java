package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
