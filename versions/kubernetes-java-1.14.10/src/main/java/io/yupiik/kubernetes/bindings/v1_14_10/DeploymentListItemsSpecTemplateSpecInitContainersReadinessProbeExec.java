package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
