package io.yupiik.kubernetes.bindings.v1_16_13;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersStartupProbeExec __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
