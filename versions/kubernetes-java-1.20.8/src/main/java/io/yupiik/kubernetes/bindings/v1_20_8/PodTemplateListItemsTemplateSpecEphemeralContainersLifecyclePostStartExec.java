package io.yupiik.kubernetes.bindings.v1_20_8;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
