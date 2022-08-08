package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
