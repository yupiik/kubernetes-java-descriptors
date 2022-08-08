package io.yupiik.kubernetes.bindings.v1_21_11;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (DeploymentSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
