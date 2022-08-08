package io.yupiik.kubernetes.bindings.v1_21_1.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
