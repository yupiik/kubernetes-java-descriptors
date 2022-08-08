package io.yupiik.kubernetes.bindings.v1_20_10.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
