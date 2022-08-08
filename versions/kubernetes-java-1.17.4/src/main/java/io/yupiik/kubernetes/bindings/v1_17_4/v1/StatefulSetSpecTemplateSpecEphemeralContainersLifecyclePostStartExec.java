package io.yupiik.kubernetes.bindings.v1_17_4.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
