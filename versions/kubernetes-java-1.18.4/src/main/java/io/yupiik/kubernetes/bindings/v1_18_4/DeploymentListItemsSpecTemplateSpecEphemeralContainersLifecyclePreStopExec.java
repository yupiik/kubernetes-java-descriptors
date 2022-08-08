package io.yupiik.kubernetes.bindings.v1_18_4;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
