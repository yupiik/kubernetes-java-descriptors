package io.yupiik.kubernetes.bindings.v1_20_5;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
