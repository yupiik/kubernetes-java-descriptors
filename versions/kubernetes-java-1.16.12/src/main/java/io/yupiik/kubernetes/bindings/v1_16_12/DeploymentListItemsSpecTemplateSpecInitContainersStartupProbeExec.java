package io.yupiik.kubernetes.bindings.v1_16_12;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
