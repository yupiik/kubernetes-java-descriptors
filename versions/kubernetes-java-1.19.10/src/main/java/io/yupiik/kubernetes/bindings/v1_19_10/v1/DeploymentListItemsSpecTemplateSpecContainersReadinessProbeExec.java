package io.yupiik.kubernetes.bindings.v1_19_10.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
