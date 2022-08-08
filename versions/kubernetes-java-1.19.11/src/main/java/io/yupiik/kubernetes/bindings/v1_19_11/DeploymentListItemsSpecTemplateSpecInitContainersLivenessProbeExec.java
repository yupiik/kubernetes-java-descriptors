package io.yupiik.kubernetes.bindings.v1_19_11;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
