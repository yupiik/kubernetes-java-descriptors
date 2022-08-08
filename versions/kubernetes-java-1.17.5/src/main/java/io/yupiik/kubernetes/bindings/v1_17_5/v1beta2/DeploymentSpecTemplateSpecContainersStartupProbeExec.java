package io.yupiik.kubernetes.bindings.v1_17_5.v1beta2;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersStartupProbeExec __otherCasted = (DeploymentSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
