package io.yupiik.kubernetes.bindings.v1_18_7.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
