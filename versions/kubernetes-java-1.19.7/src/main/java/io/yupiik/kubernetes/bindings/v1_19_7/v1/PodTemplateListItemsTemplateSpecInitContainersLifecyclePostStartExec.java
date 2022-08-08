package io.yupiik.kubernetes.bindings.v1_19_7.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
