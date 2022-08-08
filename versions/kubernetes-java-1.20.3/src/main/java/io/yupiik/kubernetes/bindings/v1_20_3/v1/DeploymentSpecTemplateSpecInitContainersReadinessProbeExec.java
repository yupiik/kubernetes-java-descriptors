package io.yupiik.kubernetes.bindings.v1_20_3.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (DeploymentSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
