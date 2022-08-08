package io.yupiik.kubernetes.bindings.v1_16_0.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
