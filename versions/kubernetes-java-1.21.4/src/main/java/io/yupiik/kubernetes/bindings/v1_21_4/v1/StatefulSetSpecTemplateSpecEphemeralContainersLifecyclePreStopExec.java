package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
