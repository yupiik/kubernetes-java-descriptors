package io.yupiik.kubernetes.bindings.v1_23_9;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
