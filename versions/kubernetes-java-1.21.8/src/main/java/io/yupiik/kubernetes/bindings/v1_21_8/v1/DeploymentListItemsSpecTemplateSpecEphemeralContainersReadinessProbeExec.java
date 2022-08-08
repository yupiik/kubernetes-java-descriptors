package io.yupiik.kubernetes.bindings.v1_21_8.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
