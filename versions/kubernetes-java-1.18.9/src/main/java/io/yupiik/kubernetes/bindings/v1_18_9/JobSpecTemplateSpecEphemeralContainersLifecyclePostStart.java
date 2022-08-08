package io.yupiik.kubernetes.bindings.v1_18_9;

import java.util.Objects;

public class JobSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private JobSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private JobSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private JobSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public JobSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePostStart(final JobSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                    final JobSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                    final JobSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final JobSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final JobSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (JobSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
